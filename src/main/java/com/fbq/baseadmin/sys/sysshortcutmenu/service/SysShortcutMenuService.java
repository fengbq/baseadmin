package com.fbq.baseadmin.sys.sysshortcutmenu.service;


import com.fbq.baseadmin.common.pojo.Result;
import com.fbq.baseadmin.common.service.CommonService;
import com.fbq.baseadmin.sys.sysshortcutmenu.pojo.SysShortcutMenu;
import com.fbq.baseadmin.sys.sysshortcutmenu.vo.SysShortcutMenuVo;

import java.util.List;

public interface SysShortcutMenuService extends CommonService<SysShortcutMenuVo, SysShortcutMenu, String> {
    Result<List<SysShortcutMenuVo>> findByUserId(String userId);
}
