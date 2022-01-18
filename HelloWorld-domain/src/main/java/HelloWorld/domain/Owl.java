package HelloWorld.domain;

import java.util.Random;

public class Owl extends Animal{
    private int wingSpan;
    private boolean hungry;
    private int age;
    private String gender;
    private String name;
    private boolean luckyDay;

    public void owl(int wingSpan, int age, String gender){
        setAge(age);
        setWingSpan(wingSpan);
        setGender(gender);
    }

    public String eat(String name){
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
        if(randomInt == 0){
            this.hungry = false;
        }
        else
            this.hungry = true;
    }
    public void setLuckyDay(){
        Random rand = new Random();
        int randomInt = rand.nextInt(2);

            if(randomInt == 0){
                this.luckyDay = false;
            }
            else {
                this.luckyDay = true;
            }
    }
    public boolean getLuckyDay(){
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

    public boolean getHungry() {return hungry;}

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
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
            return false;
    }
}

