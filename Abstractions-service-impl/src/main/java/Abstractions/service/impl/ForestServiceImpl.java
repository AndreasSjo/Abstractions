package HelloWorld.service.impl;

import HelloWorld.domain.Owl;
import HelloWorld.domain.Pinetree;
import HelloWorld.domain.Squirrel;
import HelloWorld.service.ForestService;

public class ForestServiceImpl implements ForestService {


    @Override
    public Owl createOwl(int wingspan, String gender, String name) {
        Owl owl = new Owl(wingspan, gender, name);
        return owl;
    }

    @Override
    public Squirrel createSquirrel(String name, int weight, int age, int height) {
        Squirrel squirrel = new Squirrel(name, weight, age, height);
        return squirrel;
    }

    @Override
    public Pinetree createPinetree(int age) {
        Pinetree pinetree = new Pinetree(age);
        return pinetree;
    }
}