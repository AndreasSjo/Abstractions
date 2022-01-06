import java.util.Random;

public class Start {

    public void run(){
    Pinetree pt = new Pinetree();
        pt.setAge(100);
        pt.setNumOfCones(generateRandomNumber(50));
        pt.setBranches(generateRandomNumber(50));

    Squirrel s1 = new Squirrel(2, generateRandomNumber(10), 5, 25);
            pt.squirrels.add(s1);
    Squirrel s2 = new Squirrel(2, generateRandomNumber(10), 3, 20);
            pt.squirrels.add(s2);
    Squirrel s3 = new Squirrel(4,generateRandomNumber( 4), 4,23);
            pt.squirrels.add(s3);

        pt.owl.setGender("male");
        pt.owl.setWingSpan(40);
        pt.setAge(generateRandomNumber(30));
    }
// En metod för att generera ett slumpat tal
    public int generateRandomNumber(int max) {
        Random rand = new Random();
        int randomInt = rand.nextInt(max);
        return randomInt;
    }
}
