package com.tyf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author tyf
 * @create 2022-03-15-17:17
 * PO 持久层
 */
@Data
@AllArgsConstructor
//把当前类的对象放到了容器中
@Component
@Scope("singleton")
public class User {
    @Value("100")
    private Integer id;
    @Value("易烊千玺")
    private String username;
    @Value("123456")
    private String password;

    public User() {
        System.out.println("无参构造");
    }

    //和init-method相同，会在对象创建后执行此方法
    @PostConstruct
    public void eat(){
        System.out.println("今天中午吃什么");
    }

    //在容器销毁之前和destroy-method相同
    @PreDestroy
    public void sleep() {
        System.out.println("吃了睡");
    }
}
