package com.fbq.baseadmin.sys.sysauthority.service;

import com.fbq.baseadmin.common.pojo.Result;
import com.fbq.baseadmin.common.service.CommonServiceImpl;
import com.fbq.baseadmin.eventlistener.eventsource.SecurityMetadataSourceEventSource;
import com.fbq.baseadmin.sys.sysauthority.pojo.SysAuthority;
import com.fbq.baseadmin.sys.sysauthority.repository.SysAuthorityRepository;
import com.fbq.baseadmin.sys.sysauthority.vo.SysAuthorityVo;
import com.fbq.baseadmin.sys.sysuserauthority.service.SysUserAuthorityService;
import com.fbq.baseadmin.sys.sysuserauthority.vo.SysUserAuthorityVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
@Transactional
public class SysAuthorityServiceImpl extends CommonServiceImpl<SysAuthorityVo, SysAuthority, String> implements SysAuthorityService{

    @PersistenceContext
    private EntityManager em;
    @Autowired
    private SysAuthorityRepository sysAuthorityRepository;

    @Autowired
    private SysAuthorityService sysAuthorityService;

    @Autowired
    private SysUserAuthorityService sysUserAuthorityService;

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    /**
     * 重写save方法，当新增、修改权限表后需要去更新权限集合
     */
    @Override
    public Result<SysAuthorityVo> save(SysAuthorityVo entityVo) {
        Result<SysAuthorityVo> result = super.save(entityVo);

        //更新权限集合
        //发布 认证数据源事件
        applicationEventPublisher.publishEvent(new SecurityMetadataSourceEventSource(sysAuthorityService.list(new SysAuthorityVo()).getData()));

        return result;
    }

    /**
     * 重写delete方法
     */
    @Override
    public Result<String> delete(String id) {
        //删除权限之前，删除用户权限关联表对应数据
        SysUserAuthorityVo sysUserAuthorityVo = new SysUserAuthorityVo();
        sysUserAuthorityVo.setAuthorityId(id);
        sysUserAuthorityService.list(sysUserAuthorityVo).getData().forEach((vo)->{
            sysUserAuthorityService.delete(vo.getUserAuthorityId());
        });

        //再删除自己
        Result<String> result = super.delete(id);

        //更新权限集合
        //发布 认证数据源事件
        applicationEventPublisher.publishEvent(new SecurityMetadataSourceEventSource(sysAuthorityService.list(new SysAuthorityVo()).getData()));
        return result;
    }
}
