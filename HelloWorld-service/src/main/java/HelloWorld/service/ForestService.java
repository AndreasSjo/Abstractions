package HelloWorld.service;

import HelloWorld.domain.Owl;

public interface ForestService {
    Owl createOwl(int wingspan, String gender, String name);
}
