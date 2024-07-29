package org.example.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @Auther sun
 * @Time 2024/7/29 下午3:48
 */
@Configuration
@ComponentScan("org.example")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class, ServletContainerInitConfig.class, SpringMvcConfig.class})
@MapperScan("org.example.dao")
public class SpringConfig {
}