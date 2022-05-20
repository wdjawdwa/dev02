package com.tyf.config;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author tyf
 * @create 2022-03-17-21:06
 */
@PropertySource("classpath:jdbc.properties")
//指定包扫描路径，会扫描指定包下的所有注解
@ComponentScan("com.tyf")
//当前类就是一个配置类
@Configuration
public class JdbcConfig {
    @Value("${jdbc.driver}")
    private String driverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    //@Bean注解用于将指定方法的返回值作为容器中的对象
    //id就是方法名
    @Bean
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate = null;
        Properties properties = new Properties();

        properties.setProperty("driverClassName",driverClassName);
        properties.setProperty("url",url);
        properties.setProperty("username",username);
        properties.setProperty("password",password);

        DataSource dataSource ;
        try {
            dataSource = DruidDataSourceFactory.createDataSource(properties);

            jdbcTemplate = new JdbcTemplate(dataSource);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return jdbcTemplate;
    }
}
