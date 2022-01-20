package HelloWorld.domain;

import java.util.Random;

public class Owl extends Animal{
    private int wingSpan;
    private boolean hungry;
    private String gender;
    private String name;
    private boolean luckyDay;

    public Owl(int wingSpan, String gender, String name) {
        setWingSpan(wingSpan);
        setGender(gender);
        setName(name);
    }



    public void setWingSpan(int wingSpan) {
        if(wingSpan > 0)
        this.wingSpan = wingSpan;
        else{
            System.out.println("only positive integer input");
        }
    }

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


    public boolean getHungry() {
        return hungry;
    }

    public void setName(String name) {
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
