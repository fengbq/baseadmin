package com.fbq.baseadmin.sys.sysuserauthority.controller;

import com.fbq.baseadmin.annotation.Decrypt;
import com.fbq.baseadmin.annotation.Encrypt;
import com.fbq.baseadmin.common.controller.CommonController;
import com.fbq.baseadmin.common.pojo.Result;
import com.fbq.baseadmin.sys.sysauthority.service.SysAuthorityService;
import com.fbq.baseadmin.sys.sysauthority.vo.SysAuthorityVo;
import com.fbq.baseadmin.sys.sysuserauthority.pojo.SysUserAuthority;
import com.fbq.baseadmin.sys.sysuserauthority.service.SysUserAuthorityService;
import com.fbq.baseadmin.sys.sysuserauthority.vo.SysUserAuthorityVo;
import com.fbq.baseadmin.sys.sysuserauthority.vo.SysUserAuthorityVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sys/sysUserAuthority/")
public class SysUserAuthorityController extends CommonController<SysUserAuthorityVo, SysUserAuthority, String> {
    @Autowired
    private SysUserAuthorityService sysUserAuthorityService;

    @Autowired
    private SysAuthorityService sysAuthorityService;

    @PostMapping("findUserAuthorityAndAllSysAuthorityByUserId")
    @Decrypt
    @Encrypt
    public Result<Map<String, Object>> findUserAuthorityAndAllSysAuthorityByUserId(SysUserAuthorityVo sysUserAuthorityVo) {
        HashMap<String, Object> map = new HashMap<>(2);
        List<SysUserAuthorityVo> sysUserAuthorityVoList = sysUserAuthorityService.findByUserId(sysUserAuthorityVo.getUserId()).getData();
        map.put("sysUserAuthorityVoList", sysUserAuthorityVoList);
        List<SysAuthorityVo> sysAuthorityVoList = sysAuthorityService.list(new SysAuthorityVo()).getData();
        map.put("sysAuthorityVoList", sysAuthorityVoList);
        return Result.of(map);
    }

    @PostMapping("saveAllByUserId")
    @Decrypt
    @Encrypt
    public Result<Boolean> saveAllByUserId(SysUserAuthorityVo sysUserAuthorityVo) {
        return sysUserAuthorityService.saveAllByUserId(sysUserAuthorityVo.getUserId(), sysUserAuthorityVo.getAuthorityIdList());
    }
}
