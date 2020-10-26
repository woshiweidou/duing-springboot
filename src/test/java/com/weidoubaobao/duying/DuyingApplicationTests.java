package com.weidoubaobao.duying;

import com.weidoubaobao.duying.controller.TestController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestConstructor;
import org.springframework.test.context.junit4.SpringRunner;

//这是标记这是一个springboot测试类 并且已经加载了上下文的环境
@SpringBootTest
//测试启动器这个测试环境在spring的环境下
@RunWith(SpringRunner.class)

class DuyingApplicationTests {

    @Autowired
    private TestController testConstructor;
    @Test
    void contextLoads() {
        String demo = testConstructor.testDemo();
        System.out.println(demo);
    }

}
