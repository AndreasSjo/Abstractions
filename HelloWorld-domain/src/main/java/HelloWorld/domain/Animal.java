package HelloWorld.domain;

public abstract class Animal {
    int age;

    public abstract boolean eat(Object food);

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

}
