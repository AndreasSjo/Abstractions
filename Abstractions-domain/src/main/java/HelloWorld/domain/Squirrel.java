package HelloWorld.domain;

public class Squirrel extends Animal {
    private int weight;
    private int height;
    private String name;
    Cone cone = new Cone();


    public Squirrel(String name, int weight, int age, int height) {
        setWeight(weight);
        setAge(age);
        setHeight(height);
        setName(name);
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public void setHeight(int height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }



    public int getHeight() {
        return height;
    }


    @Override
    public boolean eat(Object food) {
        if (food instanceof Cone) {
            if (((Cone) food).edible == true) {
                return true;
            } else
                return false;
        } else
            return false;
    }
}
