import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    private Pinetree pt = new Pinetree();
    private int windspeed = generateRandomNumber(0, 40);
    private List<Squirrel> HungrySquirrels = new ArrayList<Squirrel>();
    // Slumpar först ett tal mellan 0-2
    private int numbOfSquirrelsInTree = generateRandomNumber(0, 3);

    public static void main(String[] args) {

        Main m = new Main();


        m.pt.setAge(m.generateRandomNumber(10, 100));
        m.pt.setNumOfCones(m.generateRandomNumber(0, 15));
        m.pt.setBranches(m.generateRandomNumber(0, 50));
        m.squirrelsInTree();

        for (Squirrel s : m.pt.squirrels) {
            if (s.getNumOfConesInNest() == 0) {
                m.HungrySquirrels.add(s);
            }
        }

        m.pt.owl.setGender("male");
       m.pt.owl.setName("Urban");
        m.pt.owl.setWingSpan(20);
        m.pt.owl.setAge(10);
        m.pt.owl.setHungry();
        m.pt.owl.setLuckyDay();


        System.out.println("I en skog fanns en tall som var " + m.pt.getAge() + " år gammal.");

        if (m.pt.squirrels.size() == 1) {
            System.out.println("I skogen bodde det också en ekorre.");
        } else {
            System.out.println("I skogen bodde det också några ekorrar");
        }


        if (m.HungrySquirrels.size() > 0) {
            System.out.println(m.HungrySquirrels.size() + " st av dom hade tomt i skafferiet så de gick till ett träd för att hämta kottar");

      // Här anropas squirrel.eat()
            if(m.HungrySquirrels.get(0).eat(m.pt.getNumOfCones()) == true){
                System.out.println("De hade tur och hittade tillräckligt med kottar för dagens måltid och vinterns förråd.");
            }

        } else {
            System.out.println("Alla ekorrarna hade mat i boet och behövde inte gå till trädet");
        }

        System.out.println("I tallen bodde det även en uggla vid namn " + m.pt.owl.getName() + ".");

        System.out.print("En dag vaknade " + m.pt.owl.getName());

        if (m.pt.owl.getHungry() == true && m.HungrySquirrels.size() > 0) {
            System.out.print(" och var hungrig.\n");

            System.out.println("Till hans stora glädje fick han syn på en ekorre som skuttade runt i hans tall "
                    + " på jakt efter kottar. Vilken fest!");


            if (m.pt.owl.getLuckyDay() == true) {

        // Här anropas owl.eat()
                System.out.println( m.pt.owl.eat(m.pt.owl.getName()) );

            } else if (m.pt.owl.getLuckyDay() == false) {
                System.out.println("Men den lilla gnagaren var för listig för ugglan och kom undan!");
            }



        } else if (m.pt.owl.getHungry() == true && m.HungrySquirrels.size() == 0) {
            System.out.println(" och var hungrig men han hittade inget att äta");
        } else {
            System.out.println(" och hade ont i magen efter gårdagens skrovmål. Inga gnagare behövde oroa sig för ugglan idag.");
        }



            //Här anropas pinetree.fall()
        if (m.pt.fall(m.pt.getAge(), m.windspeed, m.pt.getLuckyDay()) == true) {
            System.out.println("Plötsligt blåste det upp till storm. Trädet föll som en fura och " + m.pt.owl.getName() + "s liv var i fara!");
            if (m.pt.owl.getLuckyDay() == true) {
                System.out.println("Men som tur var, så hade " + m.pt.owl.getName() + " just då flygit ur sitt bo för hans dagliga motionsrunda och klarade sig oskadd.");
            } else if (m.pt.owl.getLuckyDay() == false) {
                System.out.println("Våran käre " + m.pt.owl.getName() + " hann tyvär inte flyga ur boet i tid och vilar nu i ugglehimlen.");
            }
        } else {
            System.out.println();

        }

    }

    public void squirrelsInTree() {


        //Skapar 3 ekorrar
        Squirrel John = new Squirrel("John", 2, generateRandomNumber(0, 1), 5, 25);
        Squirrel Doe = new Squirrel("Orre", 2, generateRandomNumber(0, 1), 3, 20);
        Squirrel Dummy = new Squirrel("Orvar", 4, generateRandomNumber(0, 1), 4, 23);


        if (numbOfSquirrelsInTree == 0) {
            pt.squirrels.add(John);
        } else if (numbOfSquirrelsInTree == 1) {
            pt.squirrels.add(John);
            pt.squirrels.add(Doe);
        } else if (numbOfSquirrelsInTree == 2) {
            pt.squirrels.add(John);
            pt.squirrels.add(Doe);
            pt.squirrels.add(Dummy);
        }
    }

    // En metod för att generera ett slumpat tal
    public int generateRandomNumber(int min, int max) {
        Random rand = new Random();
        int randomInt = rand.nextInt(max - min + 1);

        return randomInt;
    }
}




