package com.fbq.baseadmin.openapi.service;


import com.fbq.baseadmin.common.pojo.Result;

public interface OpenApiService {
    /**
     * open api test测试
     * @return 测试数据
     */
    Result<String> test();
}
