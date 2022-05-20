package com.tyf.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author tyf
 * @create 2022-03-20-10:20
 */
@ComponentScan("com.tyf")
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class AopConfig {

}
