package com.weidoubaobao.duying.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "TestFilter2" , urlPatterns = "/*")
public class TestFilter2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("------------------filter激活------------------");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("---------------------------filter执行-----------------------------");
    }

    @Override
    public void destroy() {
        System.out.println("---------------------------------filter销毁------------------------------");
    }
}
