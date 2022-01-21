package Abstractions.test.unit;

import Abstractions.dao.ForestDao;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.SQLException;

public class TestDao {

    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:Abstractions-dao.xml");
    ForestDao forestDao = (ForestDao) (context.getBean("forestDao"));

    @Test
    public void testGetConnection() throws SQLException {

        Connection connection = forestDao.getConnection();
        Assert.assertNotNull(connection);

    }
}
