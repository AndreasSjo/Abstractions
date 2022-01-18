<<<<<<<< HEAD:Abstractions-domain/src/main/java/Abstractions/domain/Pinetree.java
package Abstractions.domain;
========
package HelloWorld.domain;
>>>>>>>> 6f556a433dae78b6c4096cb513ca950ccb55e65f:HelloWorld-domain/src/main/java/HelloWorld/domain/Pinetree.java

import java.util.ArrayList;
import java.util.List;

public class Pinetree {
<<<<<<<< HEAD:Abstractions-domain/src/main/java/Abstractions/domain/Pinetree.java



========
>>>>>>>> 6f556a433dae78b6c4096cb513ca950ccb55e65f:HelloWorld-domain/src/main/java/HelloWorld/domain/Pinetree.java
    private int branches;
    private int age;
    private int numOfCones;
    private boolean luckyDay;
    List<Squirrel> squirrels = new ArrayList<>();
    Owl owl = new Owl();

    public Pinetree(){

        setBranches(branches);
        setAge(age);
        setNumOfCones(numOfCones);
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
