package Abstractions.domain;

public abstract class Animal {
   protected int age;
   protected boolean hungry;
   protected int weight;

    abstract boolean eat(Object food);

    public void  setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}

