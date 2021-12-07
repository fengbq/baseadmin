package com.fbq.baseadmin.sys.sysusermenu.service;

import com.fbq.baseadmin.common.pojo.Result;
import com.fbq.baseadmin.common.service.CommonService;
import com.fbq.baseadmin.sys.sysmenu.vo.SysMenuVo;
import com.fbq.baseadmin.sys.sysusermenu.pojo.SysUserMenu;
import com.fbq.baseadmin.sys.sysusermenu.vo.SysUserMenuVo;

import java.util.List;

public interface SysUserMenuService extends CommonService<SysUserMenuVo, SysUserMenu, String> {
    Result<List<SysMenuVo>> findByUserId(String userId);

    Result<Boolean> saveAllByUserId(String userId, String menuIdList);
}
