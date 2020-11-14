package com.gainer.demo.config.filter;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.FilterConfig;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Slf4j
public class FilterOne  implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        log.info("url={}, params={}", req.getRequestURI(), JSON.toJSONString(req.getParameterMap()));
        filterChain.doFilter(req, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
