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

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
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
