package com.fbq.baseadmin.sys.sysuserauthority.service;

import com.fbq.baseadmin.common.pojo.Result;
import com.fbq.baseadmin.common.service.CommonService;
import com.fbq.baseadmin.sys.sysuserauthority.pojo.SysUserAuthority;
import com.fbq.baseadmin.sys.sysuserauthority.vo.SysUserAuthorityVo;

import java.util.List;

public interface SysUserAuthorityService extends CommonService<SysUserAuthorityVo, SysUserAuthority, String> {
    Result<List<SysUserAuthorityVo>> findByUserId(String userId);

    Result<Boolean> saveAllByUserId(String userId, String authorityIdList);
}
