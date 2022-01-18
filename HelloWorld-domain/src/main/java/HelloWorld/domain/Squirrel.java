<<<<<<<< HEAD:Abstractions-domain/src/main/java/Abstractions/domain/Squirrel.java
package Abstractions.domain;

public class Squirrel extends Animal {
    private int numOfConesInNest;
    private int height;
    private String name;
    Cone cone = new Cone();
========
package HelloWorld.domain;
>>>>>>>> 6f556a433dae78b6c4096cb513ca950ccb55e65f:HelloWorld-domain/src/main/java/HelloWorld/domain/Squirrel.java

public class Squirrel extends Animal {
    private int weight;
    private int numOfConesInNest;
    private int age;
    private int height;
    private String name;
    Cone cone = new Cone();


    public Squirrel(String name, int weight, int numOfConesInNest, int age, int height){
        setWeight(weight);
        setNumOfConesInNest(numOfConesInNest);
        setAge(age);
        setHeight(height);
        setName(name);
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setNumOfConesInNest(int numOfConesInNest) {
        this.numOfConesInNest = numOfConesInNest;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setName(String name){this.name = name;}

    public String getName(){return name;}

    public int getWeight() {
        return weight;
    }

    public int getNumOfConesInNest() {
        return numOfConesInNest;
    }

    public int getHeight() {
        return height;
    }

<<<<<<<< HEAD:Abstractions-domain/src/main/java/Abstractions/domain/Squirrel.java
    /* public boolean eat(int numOfConesInTree){
        boolean canEat;

        if(numOfConesInTree > 0){
            canEat = true;
        }

        else{
            canEat = false;
        }
        return canEat;
    }*/
    @Override
    boolean eat(Object food) {
        if (food instanceof Cone) {
            if(((Cone)food).edible == true) {
                return true;
            } else
                return false;
        }else
            return false;
    }
}
========

    @Override
    public boolean eat(Object food) {
        if (food instanceof Cone) {
            if (((Cone) food).edible = true) {
                return true;
            } else
                return false;
        } else
            return false;
    }
}


>>>>>>>> 6f556a433dae78b6c4096cb513ca950ccb55e65f:HelloWorld-domain/src/main/java/HelloWorld/domain/Squirrel.java
