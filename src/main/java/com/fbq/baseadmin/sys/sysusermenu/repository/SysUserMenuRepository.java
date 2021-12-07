package com.fbq.baseadmin.sys.sysusermenu.repository;

import com.fbq.baseadmin.common.repository.CommonRepository;
import com.fbq.baseadmin.sys.sysusermenu.pojo.SysUserMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserMenuRepository extends CommonRepository<SysUserMenu, String> {
    List<SysUserMenu> findByUserId(String userId);
}
