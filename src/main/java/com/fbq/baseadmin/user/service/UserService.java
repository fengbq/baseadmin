package com.fbq.baseadmin.user.service;

import com.fbq.baseadmin.common.pojo.Result;
import com.fbq.baseadmin.sys.sysuser.vo.SysUserVo;

public interface  UserService {
    Result<SysUserVo> updatePassword(String oldPassword, String newPassword);

    Result<SysUserVo> updateUser(SysUserVo sysUserVo);
}
