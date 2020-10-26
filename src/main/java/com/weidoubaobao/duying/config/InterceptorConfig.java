package com.weidoubaobao.duying.config;

import com.weidoubaobao.duying.interceptor.TestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
//    @Autowired
//    private TestInterceptor testInterceptor;
//    public  void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(testInterceptor).addPathPatterns("/**");
//    }
}
