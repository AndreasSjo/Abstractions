public class Squirrel {
    int weight;
    int numbOfConesInNest;
    int age;
    int height;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setNumbOfConesInNest(int numbOfConesInNest) {
        this.numbOfConesInNest = numbOfConesInNest;
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

    public int getNumbOfConesInNest() {
        return numbOfConesInNest;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    void eat(){
        if(numbOfConesInNest > 0){
            System.out.println("eating cone");
            numbOfConesInNest--;
        }
        else{
            System.out.println("Go get cones");
        }
    }
}


