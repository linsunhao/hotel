package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Auther sun
 * @Time 2024/7/29 下午4:41
 */
@Configuration
@ComponentScan("org.example.controller")
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer {
}