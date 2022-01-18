package HelloWorld.service.impl;

import HelloWorld.domain.Owl;
import HelloWorld.service.ForestService;

public class ForestServiceImpl implements ForestService {
    Owl owl;

    @Override
    public Owl createOwl(int wingspan, String gender,String name) {
        Owl owl = new Owl(wingspan, gender, name);
        return owl;
    }
}
