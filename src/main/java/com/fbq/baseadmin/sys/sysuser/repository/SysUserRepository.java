package com.fbq.baseadmin.sys.sysuser.repository;

import com.fbq.baseadmin.common.repository.CommonRepository;
import com.fbq.baseadmin.sys.sysuser.pojo.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserRepository extends CommonRepository<SysUser, String> {
    SysUser findByLoginName(String username);
}
