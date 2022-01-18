<<<<<<<< HEAD:Abstractions-domain/src/main/java/Abstractions/domain/Owl.java
package Abstractions.domain;

import java.util.Random;

public class Owl extends Animal {
    private int wingSpan;
========
package HelloWorld.domain;

import java.util.Random;

public class Owl extends Animal{
    private int wingSpan;
    private boolean hungry;
    private int age;
>>>>>>>> 6f556a433dae78b6c4096cb513ca950ccb55e65f:HelloWorld-domain/src/main/java/HelloWorld/domain/Owl.java
    private String gender;
    private String name;
    private boolean luckyDay;

    public void owl(int wingSpan, int age, String gender) {
        setAge(age);
        setWingSpan(wingSpan);
        setGender(gender);
    }

    public String eat(String name) {
        String s;
        s = name + " hade ett himla flax idag och fick sig en ekorre till middag";
        return s;
    }

    public void setWingSpan(int wingSpan) {this.wingSpan = wingSpan;}

    public void setHungry() {
        Random rand = new Random();
        // Slumpar ett tal mellan 0-1
        int randomInt = rand.nextInt(2);
        // Om talet är 1 så sätts hungry till true
        this.hungry = randomInt != 0;
    }

    public void setLuckyDay() {
        Random rand = new Random();
        int randomInt = rand.nextInt(2);

        this.luckyDay = randomInt != 0;
    }

    public boolean getLuckyDay() {
        return this.luckyDay;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public String getGender() {
        return gender;
    }
<<<<<<<< HEAD:Abstractions-domain/src/main/java/Abstractions/domain/Owl.java
========

    public boolean getHungry() {return hungry;}
>>>>>>>> 6f556a433dae78b6c4096cb513ca950ccb55e65f:HelloWorld-domain/src/main/java/HelloWorld/domain/Owl.java

    public boolean getHungry() {
        return hungry;
    }

    public void setName(String name) {
        this.name = name;
    }

<<<<<<<< HEAD:Abstractions-domain/src/main/java/Abstractions/domain/Owl.java
    public String getName() {
========
    public String getName(){
>>>>>>>> 6f556a433dae78b6c4096cb513ca950ccb55e65f:HelloWorld-domain/src/main/java/HelloWorld/domain/Owl.java
        return this.name;
    }

    @Override
<<<<<<<< HEAD:Abstractions-domain/src/main/java/Abstractions/domain/Owl.java
    boolean eat(Object food) {
        Random random = new Random();
        boolean owlGetsToEat = random.nextBoolean();


        if (food instanceof Squirrel) {
            if (owlGetsToEat == true) {
                return true;
            } else
                return false;
        } else
========
    public boolean eat(Object food) {
        Random random = new Random();
        boolean owlGetsToEat = random.nextBoolean();

        if (food instanceof Squirrel){
            if (owlGetsToEat == true) {
                return true;
            }
            else
                return false;
        }
        else
>>>>>>>> 6f556a433dae78b6c4096cb513ca950ccb55e65f:HelloWorld-domain/src/main/java/HelloWorld/domain/Owl.java
            return false;
    }
}

