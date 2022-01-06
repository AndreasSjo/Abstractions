import java.util.List;

public class Pinetree {
    int branches;
    int age;
    int numOfCones;
    List<Squirrel> squirrels;
    Owl owl;

    public void Pintetree(int branches, int age, int numOfCones){
        setBranches(branches);
        setAge(age);
        setNumOfCones(numOfCones);

    }
    public boolean fall(int age, int windspeed, boolean lumberjack){
        boolean b = false;



        return b;
    }

    public void setBranches(int branches) {
        this.branches = branches;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumOfCones(int numOfCones) {
        this.numOfCones = numOfCones;
    }

    public int getBranches() {return branches;}

    public int getAge() {
        return age;
    }

    public int getNumOfCones() {
        return numOfCones;
    }
}
