package com.gainer.demo.config.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfigurer implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new InterceptorFifter()).addPathPatterns("/**").excludePathPatterns("/login").excludePathPatterns("/loginSys").excludePathPatterns("/static/**");
    }

}
