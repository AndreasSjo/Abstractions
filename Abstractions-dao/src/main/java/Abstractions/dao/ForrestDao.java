package Abstractions.dao;

import Abstractions.domain.*;

public interface ForrestDao {
    Owl createOwl(int wingspan, String gender, String name);
    Squirrel createSquirrel(String name, int weight, int age, int height);
    Pinetree createPinetree(int age);
}
