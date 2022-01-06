import java.util.Random;

public class Owl {
    int wingSpan;
    boolean hungry;
    int age;
    String gender;

    public void owl(int wingSpan, int age, String gender){
        setAge(age);
        setWingSpan(wingSpan);
        setGender(gender);
    }

    void eat(){

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
        if(randomInt > 0){
            this.hungry = true;
        }
        else
            this.hungry = false;
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
}
