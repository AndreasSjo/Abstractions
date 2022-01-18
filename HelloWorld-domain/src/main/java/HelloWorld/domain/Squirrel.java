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


