package HelloWorld.domain;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

    public class Main {


        private int windspeed = generateRandomNumber(0, 40);


        public static void main(String[] args) {

            Main m = new Main();




            Owl owl = new Owl(25 , "male", "Urban");

            Squirrel squirrel = new Squirrel("Orre", 7, 4, 10);
            Pinetree pt = new Pinetree(m.generateRandomNumber(10,100));


            squirrel.cone.setEdible();
            owl.setHungry();
            owl.setLuckyDay();


            while (true) {
                Scanner sc = new Scanner(System.in);
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

            System.out.println("I en skog fanns en tall.");



            System.out.println("I skogen bodde ekorren " + squirrel.getName() + ".");





            if(!squirrel.eat(squirrel.cone) ){
                System.out.println("Han hade tomt i skafferiet och gick ut i skogen för att söka föda.");

            }
            else{
                System.out.println("Han hade gott om kottar hemma och tog en vilodag.");
            }

            System.out.println("I tallen bodde det även en uggla vid namn " + owl.getName() + ".");

            System.out.print("En dag vaknade " + owl.getName());

            if (owl.getHungry()) {
                System.out.print(" och var hungrig.\n");
                if(!squirrel.eat(squirrel.cone)){
                    System.out.println("Till hans stora glädje fick han syn på en ekorre som skuttade runt i hans tall "
                            + " på jakt efter kottar. Vilken fest! Tänkte urban");
                    if(owl.eat(squirrel)){
                        System.out.println("Urban hade en himla tur och lyckades fånga en stackars ekorre till middag");
                    }
                    else {
                        System.out.println("Men den lilla gnagaren var för listig för ugglan och kom undan!");
                    }
                }
                else {
                    System.out.println("Men till hans stora förtret hittade han inga stackars gnagare att trakassera.");
                }
            }else {
                System.out.println(" och hade ont i magen efter gårdagens skrovmål. Inga gnagare behövde oroa sig för ugglan idag.");
            }


            //Här anropas pinetree.fall()
            if (pt.fall(pt.getAge(), m.windspeed, pt.getLuckyDay()) == true) {
                System.out.println("Plötsligt blåste det upp till storm. Trädet föll som en fura och " + owl.getName() + "s liv var i fara!");
                if (owl.getLuckyDay() == true) {
                    System.out.println("Men som tur var, så hade " + owl.getName() + " just då flygit ur sitt bo för hans dagliga motionsrunda och klarade sig oskadd.");
                } else if (owl.getLuckyDay() == false) {
                    System.out.println("Våran käre " + owl.getName() + " hann tyvär inte flyga ur boet i tid och vilar nu i ugglehimlen.");
                }
            } else {
                System.out.println();

            }
        }



        // En metod för att generera ett slumpat tal
        public int generateRandomNumber ( int min, int max){
            Random rand = new Random();
            int randomInt = rand.nextInt(max - min + 1);

            return randomInt;
        }
    }





