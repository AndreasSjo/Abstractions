import java.util.Random;
import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        Pinetree pt = new Pinetree();
        int squirrelsToAdd = generateRandomNumber();



        if (pt.squirrels.size() > 1) {
            pt.owl.eat();
        }
    }

    public static int generateRandomNumber() {
        Random rand = new Random();
        int randomInt = rand.nextInt(10);
        return randomInt;
    }
}
