package Abstractions.service.impl;

import Abstractions.domain.*;
import Abstractions.service.Forrestservice;

public class Forrestserviceimpl implements Forrestservice {
    Squirrel squirrel;


    @Override
    public Owl createOwl(int wingspan, String gender, String name) {
        Owl owl = new Owl(wingspan, gender, name);
        return owl;
    }
}
