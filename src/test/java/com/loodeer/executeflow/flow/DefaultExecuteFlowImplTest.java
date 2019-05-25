package com.loodeer.executeflow.flow;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class DefaultExecuteFlowImplTest {

    @Test
    public void testExecute() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        ExecuteFlow flow1 = (ExecuteFlow) context.getBean("flow1");

        RequestTO requestTO = new RequestTO();
        requestTO.setId(1L);
        flow1.execute(requestTO);

        assert true;
    }

}
