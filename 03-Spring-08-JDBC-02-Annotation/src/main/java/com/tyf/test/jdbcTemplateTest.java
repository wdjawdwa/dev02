package com.tyf.test;


import com.tyf.config.JdbcConfig;
import com.tyf.dao.impl.JDBCTemplateDaoImpl;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author tyf
 * @create 2022-03-16-9:55
 */
public class jdbcTemplateTest {
    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JdbcConfig.class);

        JDBCTemplateDaoImpl templateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);

        int count = templateDao.findCount();

        System.out.println(count);
    }
}
