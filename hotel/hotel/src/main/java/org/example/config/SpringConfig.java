package org.example.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Auther sun
 * @Time 2024/7/29 下午3:48
 */
@Configuration
@ComponentScan("org.example.service")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
@MapperScan("org.example.dao")
public class SpringConfig {
}