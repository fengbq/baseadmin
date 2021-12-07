package com.fbq.baseadmin.sys.syssetting.repository;

import com.fbq.baseadmin.common.repository.CommonRepository;
import com.fbq.baseadmin.sys.syssetting.pojo.SysSetting;
import org.springframework.stereotype.Repository;

@Repository
public interface SysSettingRepository extends CommonRepository<SysSetting, String> {
}
