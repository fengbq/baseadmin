package com.fbq.baseadmin.openapi.service;

import com.fbq.baseadmin.common.pojo.Result;
import org.springframework.stereotype.Service;

@Service
public class OpenApiServiceImpl implements OpenApiService {
    @Override
    public Result<String> test() {
        return Result.of("无需登录的接口：OpenApi测试数据！");
    }
}
