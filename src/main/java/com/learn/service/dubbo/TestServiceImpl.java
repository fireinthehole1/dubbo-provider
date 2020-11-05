package com.learn.service.dubbo;

import com.learn.service.TestService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author bill
 * @version 1.0
 * @date 2020/11/4 9:43
 * @description
 */
@Service(version = "1.0.0",interfaceClass = TestService.class,timeout = 3000)
public class TestServiceImpl implements TestService {

    public String getStr() {
        return "hello dubbo";
    }

}
