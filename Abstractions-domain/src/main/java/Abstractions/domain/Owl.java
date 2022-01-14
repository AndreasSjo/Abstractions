package Abstractions.domain;

import java.util.Random;

public class Owl extends Animal {
    private int wingSpan;
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

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    // Metod för att avgöra om ugglan är hungrig eller inte
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

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public boolean getHungry() {
        return hungry;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    boolean eat(Object food) {
        Random random = new Random();
        boolean owlGetsToEat = random.nextBoolean();


        if (food instanceof Squirrel) {
            if (owlGetsToEat == true) {
                return true;
            } else
                return false;
        } else
            return false;
    }
}
