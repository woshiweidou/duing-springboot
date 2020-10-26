package com.weidoubaobao.duying;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.weidoubaobao.duying.dao")
//@ServletComponentScan("com.weidoubaobao.duying.filter")
public class DuyingApplication {

    public static void main(String[] args) {
        SpringApplication.run(DuyingApplication.class, args);
    }

}
