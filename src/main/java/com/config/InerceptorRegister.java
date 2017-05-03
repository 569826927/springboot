package com.config;

import com.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *拦截器注册
 * Created by admin on 2017/4/22.
 */
@Configuration
public class InerceptorRegister extends WebMvcConfigurerAdapter{


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/*/hello");/**拦截路径**/
        super.addInterceptors(registry);
    }
}
