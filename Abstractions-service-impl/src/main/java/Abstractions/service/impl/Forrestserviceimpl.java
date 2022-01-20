package Abstractions.service.impl;

import Abstractions.domain.*;
import Abstractions.service.Forrestservice;

public class Forrestserviceimpl implements Forrestservice {

    public Owl createOwl(int wingSpan, String gender, String name){
        Owl owl = new Owl(wingSpan, gender, name);
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
