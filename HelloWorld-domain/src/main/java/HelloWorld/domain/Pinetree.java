package HelloWorld.domain;

import java.util.ArrayList;
import java.util.List;

public class Pinetree {

    private int branches;
    private int age;
    private int numOfCones;
    private boolean luckyDay;



    public Pinetree(int age){


        setAge(age);

    }


    public boolean fall(int age, int windspeed, boolean luckyDay){


        boolean treeWillFall = false;

        if (age < 20 && windspeed > 40 && luckyDay == false ){
            treeWillFall = true;
        }
        else if ( age > 20 && windspeed > 25 && luckyDay == false){
            treeWillFall = true;
        }

        return treeWillFall;
    }

    public void setLuckyDay(boolean luckyDay){
        this.luckyDay = luckyDay;
    }

    public void setBranches(int branchesInput) {

        this.branches = branchesInput;

    }

    public void setAge(int ageInput) {

        this.age = ageInput;

    }

    public void setNumOfCones(int numOfConesInput) {
        this.numOfCones = numOfConesInput;
    }

    public int getBranches() {return branches;}

    public int getAge() {
        return age;
    }

    public int getNumOfCones() {
        return numOfCones;
    }
    public boolean getLuckyDay(){return luckyDay;}
}