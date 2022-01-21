package HelloWorld.dao;

import HelloWorld.domain.Owl;
import HelloWorld.domain.Pinetree;
import HelloWorld.domain.Squirrel;

public interface ForestDao {

    Owl createOwl(int wingspan, String gender, String name);
    Squirrel createSquirrel(String name, int weight, int age, int height);
    Pinetree createPinetree(int age);
}
