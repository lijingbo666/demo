package org.example.demo;


import ch.qos.logback.core.net.server.Client;
import com.alibaba.fastjson.*;
import org.example.demo.model.bo.HelloWorldSetInputBO;
import org.example.demo.service.HelloWorldService;
import org.fisco.bcos.sdk.transaction.model.dto.CallResponse;
import org.fisco.bcos.sdk.utils.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ch.qos.logback.core.net.server.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collector;

@RestController

public class text {
    @Autowired
    public HelloWorldService helloWorldService;

    @GetMapping(path = "/userinfo")
    public String getpublic() throws Exception {
//        CallResponse qq = new CallResponse();
//        qq = helloWorldService.get();
//        String aa = qq.getValues();
//        String bb = qq.getReturnMessage();
//        Collection ccc = new ArrayList();
//        ccc.add(bb);
//        JSONObject cc = new JSONObject();
//        HelloWorldSetInputBO set = new HelloWorldSetInputBO();
//        set.setN("李京博");
//        helloWorldService.set(set);
//        return cc.toString();
        return null;
    }


}
