import java.util.Random;

public class Start {
    Pinetree pt = new Pinetree();
    int windspeed = generateRandomNumber(40);


    public void run(){

        pt.setAge(100);
        pt.setNumOfCones(generateRandomNumber(50));
        pt.setBranches(generateRandomNumber(50));

        squirrelsInTree(pt);

        pt.owl.setGender("male");
        pt.owl.setWingSpan(20);
        pt.setAge(generateRandomNumber(30));
        pt.owl.setHungry();

        pt.squirrels.get(1).eat(pt.squirrels.get(1).numOfConesInNest);



    }

    // En metod som lägger till ekorrar i trädet
    public void squirrelsInTree(Pinetree pt){

        // Slumpar först ett tal mellan 0-3
        int numbOfSquirrlesInTree = generateRandomNumber(3);

        //Skapar 3 ekorrar
        Squirrel John = new Squirrel(2, generateRandomNumber(10), 5, 25);
        Squirrel Doe = new Squirrel(2, generateRandomNumber(10), 3, 20);
        Squirrel Dummy = new Squirrel(4,generateRandomNumber( 10), 4,23);


        // En switch-sats för att lägga till ekorrar i trädet om antalet blir 1,2 eller 3
        switch (numbOfSquirrlesInTree) {
            case 1:
                pt.squirrels.add(John);
                break;
            case 2:
                pt.squirrels.add(John);
                pt.squirrels.add(Doe);
                break;
            case 3:
                pt.squirrels.add(John);
                pt.squirrels.add(Doe);
                pt.squirrels.add(Dummy);
                break;
            default:
                // Om antalet blir 0 så läggs inga ekorrar till
                System.out.println("No squirrels in this tree");
        }
    }

// En metod för att generera ett slumpat tal
    public int generateRandomNumber(int max) {
        Random rand = new Random();
        int randomInt = rand.nextInt(max+1);
        return randomInt;
    }
}
