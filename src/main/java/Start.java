import java.util.List;
import java.util.Random;

public class Start {
    Pinetree pt = new Pinetree();
    int windspeed = generateRandomNumber(40);
    List<Squirrel> HungrySquirrels;
    // Slumpar först ett tal mellan 0-2
    int numbOfSquirrlesInTree = generateRandomNumber(3);

    public void run(){

        pt.setAge(100);
        pt.setNumOfCones(generateRandomNumber(50));
        pt.setBranches(generateRandomNumber(50));
        squirrlesInTree();

        for (int i = 0; i < pt.squirrels.size() - 1; i++) {

            if (pt.squirrels.get(i).numOfConesInNest == 0){
                HungrySquirrels.add(pt.squirrels.get(i));
            }
        }



        pt.owl.setGender("male");
        pt.owl.setName("Urban");
        pt.owl.setWingSpan(20);
        pt.owl.setAge(10);
        pt.owl.setHungry();

        if(pt.squirrels.size() == 1){
            System.out.println("Det var en gång en ekorre som bodde i en skog ");
        }
        else{
            System.out.println("Det var en gång några ekorrar som bodde i en skog ");
        }
        System.out.println(HungrySquirrels.size() + " st av dom hade tomt i skafferiet så de gick till ett träd för att hämta kottar");

        System.out.println("I skogen fanns en tall som var " + pt.getAge() +" år gammalt");

        System.out.println("i tallen bodde det en uggla vid namn " + pt.owl.getName());

        System.out.println("En dag vaknade " + pt.owl.getName());

        if(pt.owl.getHungry() == true && HungrySquirrels.size() > 0 ){
            System.out.println(" och var hungrig.");

            System.out.println("Till hans stora glädje fick han syn på en ekorre som skuttade runt i hans tall\n "
            + " på jakt efter kottar. VIlken fest!");
        }
        else if (pt.owl.getHungry() == true &&HungrySquirrels.size() == 0){
            System.out.println("men han hittade inget att äta");
        }

        else{
            System.out.println(" och hade ont i magen efter gårdagens skrovmål.");
        }

        System.out.println("");

    }

    // En metod som lägger till ekorrar i trädet
    public void squirrlesInTree(){


        //Skapar 3 ekorrar
        Squirrel John = new Squirrel(2, generateRandomNumber(10), 5, 25);
        Squirrel Doe = new Squirrel(2, generateRandomNumber(10), 3, 20);
        Squirrel Dummy = new Squirrel(4,generateRandomNumber( 10), 4,23);


        if (numbOfSquirrlesInTree == 0) {
                pt.squirrels.add(John);
        }
        else if (numbOfSquirrlesInTree == 1) {
                pt.squirrels.add(John);
                pt.squirrels.add(Doe);
            }
        else if (numbOfSquirrlesInTree == 2){
                pt.squirrels.add(John);
                pt.squirrels.add(Doe);
                pt.squirrels.add(Dummy);
        }
    }

// En metod för att generera ett slumpat tal
    public int generateRandomNumber(int max) {
        Random rand = new Random();
        int randomInt = rand.nextInt(max);
        return randomInt;
    }
}
