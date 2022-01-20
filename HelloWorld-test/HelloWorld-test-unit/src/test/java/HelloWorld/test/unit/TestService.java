package HelloWorld.test.unit;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:HelloWorld-service.xml");

    @Before
    public void before(){
        applicationContext.getBean("forestService");
    }
}
