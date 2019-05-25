package com.loodeer.executeflow;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class ExecuteFlowApplicationTests {

    @Test
    public void contextLoads() {
        assert true;
    }

    @Test
    public void aTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Date date = (Date) context.getBean("date");
        System.out.println(date);
        assert true;
    }

}
