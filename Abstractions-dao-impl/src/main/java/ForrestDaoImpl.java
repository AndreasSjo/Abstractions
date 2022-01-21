import Abstractions.dao.ForrestDao;
import Abstractions.domain.Owl;
import Abstractions.domain.Pinetree;
import Abstractions.domain.Squirrel;

public class ForrestDaoImpl implements ForrestDao {
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
