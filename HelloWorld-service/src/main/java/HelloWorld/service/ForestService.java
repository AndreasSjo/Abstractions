package HelloWorld.service;

import HelloWorld.domain.Owl;
import HelloWorld.domain.Pinetree;
import HelloWorld.domain.Squirrel;


public interface ForestService {
        Owl createOwl(int wingspan, String gender, String name);
        Squirrel createSquirrel(String name, int weight, int age, int height);
        Pinetree createPinetree(int age);
    }

