import java.util.Random;

public class Owl {
    int wingSpan;
    boolean hungry;
    int age;
    String gender;
    String name;
    boolean luckyDay;

    public void owl(int wingSpan, int age, String gender){
        setAge(age);
        setWingSpan(wingSpan);
        setGender(gender);
    }

    public int eat(int numbOfSquirrels){
        int numbOfSquirrelsToReturn = numbOfSquirrels;

        if(numbOfSquirrels > 0){
            numbOfSquirrelsToReturn--;
            return numbOfSquirrelsToReturn;
        }
        else
            return numbOfSquirrels;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    // Metod för att avgöra om ugglan är hungrig eller inte
    public void setHungry() {
        Random rand = new Random();
        // Slumpar ett tal mellan 0-1
        int randomInt = rand.nextInt(2);
        // Om talet är 1 så sätts hungry till true
        if(randomInt == 0){
            this.hungry = false;
        }
        else
            this.hungry = true;
    }
    public void setLuckyDay(){
        Random rand = new Random();
        int randomInt = rand.nextInt(2);

            if(randomInt == 0){
                this.luckyDay = false;
            }
            else {
                this.luckyDay = true;
            }
    }
    public boolean getLuckyDay(){
        return this.luckyDay;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    public boolean getHungry() {return hungry;}

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
