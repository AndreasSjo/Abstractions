package Abstractions.domain;

public class Squirrel extends Animal {
    private int numOfConesInNest;
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

    public void setAge(int age) {
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

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