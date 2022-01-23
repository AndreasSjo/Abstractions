import Abstractions.dao.ForrestDao;
import Abstractions.domain.Owl;
import Abstractions.domain.Pinetree;
import Abstractions.domain.Squirrel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ForrestDaoImpl implements ForrestDao {

    Connection connection = null;
    Statement statement = null;

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/stidb", "sti", "sti");
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
