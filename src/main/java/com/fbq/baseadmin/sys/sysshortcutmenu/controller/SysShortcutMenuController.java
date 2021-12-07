package com.fbq.baseadmin.sys.sysshortcutmenu.controller;

import com.fbq.baseadmin.common.controller.CommonController;
import com.fbq.baseadmin.sys.sysshortcutmenu.pojo.SysShortcutMenu;
import com.fbq.baseadmin.sys.sysshortcutmenu.service.SysShortcutMenuService;
import com.fbq.baseadmin.sys.sysshortcutmenu.vo.SysShortcutMenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys/sysShortcutMenu/")
public class SysShortcutMenuController extends CommonController<SysShortcutMenuVo, SysShortcutMenu, String> {
    @Autowired
    private SysShortcutMenuService sysShortcutMenuService;
}
