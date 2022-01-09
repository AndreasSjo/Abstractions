import java.util.ArrayList;
import java.util.List;

public class Pinetree {
    int branches;
    int age;
    int numOfCones;
    List<Squirrel> squirrels = new ArrayList<Squirrel>();
    Owl owl = new Owl();




    public Pinetree(){
>>>>>>> c1cf119b30d2de4acdff3cdc71dacdc6d54d5795
        setBranches(branches);
        setAge(age);
        setNumOfCones(numOfCones);
    }


    public boolean fall(int age, int windspeed, boolean luckyDay){
>>>>>>> c1cf119b30d2de4acdff3cdc71dacdc6d54d5795

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
