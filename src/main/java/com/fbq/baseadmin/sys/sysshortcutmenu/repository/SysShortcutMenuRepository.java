package com.fbq.baseadmin.sys.sysshortcutmenu.repository;

import com.fbq.baseadmin.common.repository.CommonRepository;
import com.fbq.baseadmin.sys.sysshortcutmenu.pojo.SysShortcutMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysShortcutMenuRepository extends CommonRepository<SysShortcutMenu, String> {
    List<SysShortcutMenu> findByUserId(String userId);
}
