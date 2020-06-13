package com.shawn.apache.dubbo.provider.service;

import com.shawn.apache.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String string) {
        return "Dubbo service echo ："+string;
    }
}
