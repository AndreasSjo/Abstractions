package Abstractions.domain;

public abstract class Animal {
   protected int age;
   protected boolean hungry;
   protected int weight;

    abstract boolean eat(Object food);
}

