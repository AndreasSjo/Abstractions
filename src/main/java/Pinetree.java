import java.util.List;

public class Pinetree {
    int branches;
    int age;
    int numOfCones;
    List<Squirrel> squirrels;
    Owl owl;

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
