package com.shawn.apache.dubbo.consumer.controller;

import com.shawn.apache.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @Reference(version = "1.0.0")
    EchoService echoService;

    @GetMapping("/echo/{string}")
    public String echo(@PathVariable String string){
        return echoService.echo(string);
    }
}
