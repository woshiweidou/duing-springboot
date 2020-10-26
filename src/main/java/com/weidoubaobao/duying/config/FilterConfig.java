package com.weidoubaobao.duying.config;

import com.weidoubaobao.duying.filter.TestFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
//    @Bean
//    public TestFilter  testFilter(){
//        return  new TestFilter();
//    }
//
//    @Bean
//    public FilterRegistrationBean<TestFilter> filterFilterRegistrationBean(){
//        FilterRegistrationBean<TestFilter> filterRegistrationBean = new FilterRegistrationBean<>();
//        filterRegistrationBean.setFilter(testFilter());
//        filterRegistrationBean.addUrlPatterns("/*");
//        return  filterRegistrationBean;
//    }
}
