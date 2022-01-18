package Abstractions.service;

import Abstractions.domain.*;

public interface Forrestservice {
    Owl createOwl(int wingspan, String gender, String name);
}