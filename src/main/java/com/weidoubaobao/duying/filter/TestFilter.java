package com.weidoubaobao.duying.filter;

import javax.servlet.*;
import java.io.IOException;

public class TestFilter implements Filter {

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
