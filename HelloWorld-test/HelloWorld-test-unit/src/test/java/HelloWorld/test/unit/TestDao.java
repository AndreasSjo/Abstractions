package HelloWorld.test.unit;

import HelloWorld.dao.ForestDao;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDao {

    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:HelloWorld-dao.xml");

    @Test
    public void testGetBean(){

            ForestDao forestDao = (ForestDao) (context.getBean("forestDao"));
            Assert.assertNotNull(forestDao);
    }
}
