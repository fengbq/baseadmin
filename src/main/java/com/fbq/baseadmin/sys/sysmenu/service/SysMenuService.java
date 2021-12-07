package com.fbq.baseadmin.sys.sysmenu.service;


import com.fbq.baseadmin.common.pojo.Result;
import com.fbq.baseadmin.common.service.CommonService;
import com.fbq.baseadmin.sys.sysmenu.pojo.SysMenu;
import com.fbq.baseadmin.sys.sysmenu.vo.SysMenuVo;

import java.util.List;

public interface SysMenuService extends CommonService<SysMenuVo, SysMenu, String> {
    Result<List<SysMenuVo>> listByTier(SysMenuVo entityVo);
}
