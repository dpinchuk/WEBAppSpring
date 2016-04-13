package com.webappspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * Class {@link WebAppConfig}
 *
 * @author Pavlo Kozub
 * @since April 13, 2016
 */
@EnableWebMvc
@ComponentScan({"com.webappspring.controllers"})
@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter{

    private static final String VIEWS_LOCATION = "/WEB-INF/views/";
    private static final String VIEWS_EXTENSION = ".jsp";
    private static final String RESOURCES_LOCATION = "/resources/";
    private static final String RESOURCES_HANDLER = "/resources/**";
    private static final String DEFAULT_ENCODING = "UTF-8";
    private static final String CONTENT_TYPE = "text/html;charset=UTF-8";

    @Bean
    public UrlBasedViewResolver urlBasedViewResolver()
    {
        UrlBasedViewResolver res = new InternalResourceViewResolver();
        res.setViewClass(JstlView.class);
        res.setPrefix(VIEWS_LOCATION);
        res.setSuffix(VIEWS_EXTENSION);

        return res;
    }
}
