public class Squirrel {
    int weight;
    int numOfConesInNest;
    int age;
    int height;



    public Squirrel(int weight, int numOfConesInNest, int age, int height){
        setWeight(weight);
        setNumOfConesInNest(numOfConesInNest);
        setAge(age);
        setHeight(height);
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

    public int eat(int numOfConesInNest){
        int conesLeft = numOfConesInNest;

        if(numOfConesInNest > 0){
            System.out.println("Eating cone");
            conesLeft --;
        }
        else{
            System.out.println("Go get cones");
        }
        return conesLeft;
    }
}


