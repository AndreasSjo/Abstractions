package HelloWorld.domain;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private Pinetree pt = new Pinetree();
    private int windspeed = generateRandomNumber(0, 40);
    // Slumpar först ett tal mellan 0-2
    private int numbOfSquirrelsInTree = generateRandomNumber(0, 3);
    private int hungrySquirrels = 0;

    public static void main(String[] args) {

        Main m = new Main();


        m.pt.setAge(m.generateRandomNumber(10, 100));
        m.pt.setNumOfCones(m.generateRandomNumber(0, 15));
        m.pt.setBranches(m.generateRandomNumber(0, 50));
        m.squirrelsInTree();

        Owl owl = new Owl(20, "Male", "Urban");

        Scanner sc = new Scanner(System.in);


            while(true) {
                try {
                    System.out.println("Ange en ålder på Urban");
                    owl.setAge(sc.nextInt());
                    sc.close();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Ange bara ett tal i siffror");
                    sc.nextLine();
                    continue;
                }
            }

            owl.setHungry();
            owl.setLuckyDay();


            System.out.println("I en skog fanns en tall som var " + m.pt.getAge() + " år gammal.");

            if (m.pt.squirrels.size() == 1) {
                System.out.println("I skogen bodde det också en ekorre.");
            } else {
                System.out.println("I skogen bodde det också några ekorrar");
            }

            for (int i = 0; i < m.pt.squirrels.size(); i++) {
                if (m.pt.squirrels.get(i).eat(m.pt.squirrels.get(i).cone)) {
                    m.hungrySquirrels++;
                }
            }


            if (m.hungrySquirrels > 0) {
                System.out.println(m.hungrySquirrels + " st av dom hade tomt i skafferiet så de gick till ett träd för att hämta kottar");
            } else {
                System.out.println("Alla ekorrarna hade mat i boet och behövde inte gå till trädet");
            }


            System.out.println("I tallen bodde det även en uggla vid namn " + owl.getName() + ".");

            System.out.print("En dag vaknade " + owl.getName());

            if (owl.getHungry()) {
                System.out.print(" och var hungrig.\n");
                if (m.hungrySquirrels > 0) {
                    System.out.println("Till hans stora glädje fick han syn på en ekorre som skuttade runt i hans tall "
                            + " på jakt efter kottar. Vilken fest! Tänkte urban");
                    if (owl.eat(m.pt.squirrels.get(0))) {
                        System.out.println("Urban hade en himla tur och lyckades fånga en stackars ekorre till middag");
                    } else {
                        System.out.println("Men den lilla gnagaren var för listig för ugglan och kom undan!");
                    }
                } else {
                    System.out.println("Men till hans stora förtret hittade han inga ekorrar i trädet");
                }
            } else {
                System.out.println(" och hade ont i magen efter gårdagens skrovmål. Inga gnagare behövde oroa sig för ugglan idag.");
            }


            //Här anropas pinetree.fall()
            if (m.pt.fall(m.pt.getAge(), m.windspeed, m.pt.getLuckyDay())) {
                System.out.println("Plötsligt blåste det upp till storm. Trädet föll som en fura och " + owl.getName() + "s liv var i fara!");
                if (owl.getLuckyDay()) {
                    System.out.println("Men som tur var, så hade " + owl.getName() + " just då flygit ur sitt bo för hans dagliga motionsrunda och klarade sig oskadd.");
                } else if (!owl.getLuckyDay()) {
                    System.out.println("Våran käre " + owl.getName() + " hann tyvär inte flyga ur boet i tid och vilar nu i ugglehimlen.");
                }
            } else {
                System.out.println();
            }

        }

        public void squirrelsInTree () {


            //Skapar 3 ekorrar
            Squirrel John = new Squirrel("John", 2, generateRandomNumber(0, 1), 5, 25);
            John.cone.setEdible();
            Squirrel Doe = new Squirrel("Orre", 2, generateRandomNumber(0, 1), 3, 20);
            Doe.cone.setEdible();
            Squirrel Dummy = new Squirrel("Orvar", 4, generateRandomNumber(0, 1), 4, 23);
            Dummy.cone.setEdible();


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
        public int generateRandomNumber ( int min, int max){
            Random rand = new Random();
            int randomInt = rand.nextInt(max - min + 1);

            return randomInt;
        }
    }




