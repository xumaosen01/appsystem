package com.pb.appsystem.servers.impl;

import com.pb.appsystem.servers.BackendUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class BackendUserServiceImplTest {
    @Autowired
    private BackendUserService backendUserService;
    @Test
    public void findUserByUserCode() {
        System.out.print(backendUserService.findUserByUserCode("admin",
                "123456"));
    }

    @Test
    public void findUserByUserCode2() {
        ApplicationContext context=new ClassPathXmlApplicationContext("classpath:spring.xml");
        BackendUserService backendUserService =(BackendUserService)context.getBean("backendUserServiceImpl");
        System.out.print(this.backendUserService.findUserByUserCode("admin",
                "123456"));
    }
}