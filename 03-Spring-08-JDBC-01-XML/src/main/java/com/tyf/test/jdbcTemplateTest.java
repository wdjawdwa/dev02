package com.tyf.test;

import com.tyf.dao.impl.JDBCTemplateDaoImpl;
import com.tyf.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author tyf
 * @create 2022-03-16-9:55
 */
public class jdbcTemplateTest {

    @Test
    public void testDelete(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        JDBCTemplateDaoImpl jdbcTemplateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);

        int affectedRows = jdbcTemplateDao.delete(6);

        System.out.println(affectedRows);
    }

    @Test
    public void testUpdate(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        JDBCTemplateDaoImpl jdbcTemplateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);

        int affectedRows = jdbcTemplateDao.update(new User(4,null,"888"));
        System.out.println(affectedRows);
    }

    @Test
    public void testInsert(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        JDBCTemplateDaoImpl jdbcTemplateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);

        int affectedRows = jdbcTemplateDao.insert(new User(null,"老坛酸菜","666"));
        System.out.println(affectedRows);
    }

    @Test
    public void testFindCount(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        JDBCTemplateDaoImpl templateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);
        int count = templateDao.findCount();
        System.out.println(count);
    }

    @Test
    public void testFindAll(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        JDBCTemplateDaoImpl jdbcTemplateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);

        List<User> users = jdbcTemplateDao.findAll();

        System.out.println(users);
    }
    @Test
    public void testFindById(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        JDBCTemplateDaoImpl jdbcTemplateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);

        User user = jdbcTemplateDao.findById(1);

        System.out.println(user);
    }
}
