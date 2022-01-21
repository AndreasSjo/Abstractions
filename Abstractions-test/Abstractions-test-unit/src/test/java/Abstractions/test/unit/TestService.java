package Abstractions.test.unit;

import HelloWorld.domain.Owl;
import HelloWorld.service.ForestService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:HelloWorld-service.xml");

    private ForestService forestService;

    @Before
    public void before(){
        forestService = (ForestService)applicationContext.getBean("forestService");
    }

    @Test
    public void testForestServiceDependencyInjection(){
        Owl owl = forestService.createOwl(95,"male","olof");
        Assert.assertNotNull(owl);
    }
}
