package Abstractions.test.unit;


import Abstractions.domain.Owl;
import Abstractions.service.Forrestservice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testservice {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:Abstractions-service.xml");
    private Forrestservice forrestservice;

    @Before
    public  void before(){forrestservice =(Forrestservice)applicationContext.getBean("forrestservice"); }

    @Test
    public void testForrestserviceDependencyInjection(){
        Owl owl = forrestservice.createOwl(95,"Female","Ulla");
        Assert.assertNotNull(owl);
    }

}
