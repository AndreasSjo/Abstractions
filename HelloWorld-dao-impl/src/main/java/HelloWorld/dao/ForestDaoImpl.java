package HelloWorld.dao;

import HelloWorld.domain.Owl;
import HelloWorld.domain.Pinetree;
import HelloWorld.domain.Squirrel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ForestDaoImpl implements ForestDao {
    Connection con = null;
    Statement statement = null;

    @Override
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/stidb", "sti" ,"sti");
    }

    @Override
    public Owl createOwl(int wingspan, String gender, String name) {
        return null;
    }

    @Override
    public Squirrel createSquirrel(String name, int weight, int age, int height) {
        return null;
    }

    @Override
    public Pinetree createPinetree(int age) {
        return null;
    }

}
