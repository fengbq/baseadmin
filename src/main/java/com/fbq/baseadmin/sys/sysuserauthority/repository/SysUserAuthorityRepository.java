package com.fbq.baseadmin.sys.sysuserauthority.repository;

import com.fbq.baseadmin.common.repository.CommonRepository;
import com.fbq.baseadmin.sys.sysuserauthority.pojo.SysUserAuthority;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserAuthorityRepository extends CommonRepository<SysUserAuthority, String> {
    List<SysUserAuthority> findByUserId(String userId);
}
