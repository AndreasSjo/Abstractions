import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Start {
    Pinetree pt = new Pinetree();
    int windspeed = generateRandomNumber(0,40);
    List<Squirrel> HungrySquirrels = new ArrayList<Squirrel>();
    // Slumpar först ett tal mellan 0-2
    int numbOfSquirrelsInTree = generateRandomNumber(0,3);


    public void run(){

        pt.setAge(generateRandomNumber(10,100));
        pt.setNumOfCones(generateRandomNumber(0,15));
        pt.setBranches(generateRandomNumber(0,50));
        squirrelsInTree();

        for (Squirrel s : pt.squirrels ) {
            if (s.numOfConesInNest == 0){
                HungrySquirrels.add(s);
            }
        }

        pt.owl.setGender("male");
        pt.owl.setName("Urban");
        pt.owl.setWingSpan(20);
        pt.owl.setAge(10);
        pt.owl.setHungry();
        pt.owl.setLuckyDay();


        System.out.println("I en skog fanns en tall som var " + pt.getAge() +" år gammal.");

        if(pt.squirrels.size() == 1){
            System.out.println("I skogen bodde det en ekorre.");
        }
        else{
            System.out.println("I skogen bodde det några ekorrar");
        }

        if (HungrySquirrels.size()>0){
             System.out.println(HungrySquirrels.size() + " st av dom hade tomt i skafferiet så de gick till ett träd för att hämta kottar");

            {
                for (Squirrel s: HungrySquirrels) {
                    if(s.eat(pt.getNumOfCones()) == true){
                        System.out.println(s.getName() + " fick äta kottar");
                    }
                    else{
                        System.out.println(s.getName()+ " fick inte äta kottar");
                    }
                }
            }

        }



                System.out.println("I tallen bodde det en uggla vid namn " + pt.owl.getName() +".");

                    System.out.print("En dag vaknade " + pt.owl.getName());

        if(pt.owl.getHungry() == true && HungrySquirrels.size() > 0 ){
            System.out.print(" och var hungrig.\n ");

            System.out.println("Till hans stora glädje fick han syn på en ekorre som skuttade runt i hans tall "
            + " på jakt efter kottar. Vilken fest!");



            if(pt.owl.getLuckyDay() == true){
                System.out.println(pt.owl.getName() + " hade ett himla flax idag och fick sig en ekorre till middag");
            }
            else if (pt.owl.getLuckyDay() == false){
                System.out.println("Men den lilla gnagaren var för listig för ugglan och kom undan!");
            }
        }
        else if (pt.owl.getHungry() == true && HungrySquirrels.size() == 0){
            System.out.println("men han hittade inget att äta");
        }

        else{
            System.out.println(" och hade ont i magen efter gårdagens skrovmål. Inga gnagare behövde oroa sig för ugglan idag.");
        }

        if (pt.fall(pt.getAge(), windspeed, pt.getLuckyDay()) == true){
            System.out.println("Plötsligt blåste det upp till storm. Trädet föll som en fura och " + pt.owl.getName() +  "s liv var i fara!");
                if(pt.owl.getLuckyDay() == true){
                    System.out.println("Men som tur var, så hade " + pt.owl.getName() + " just då flygit ur sitt bo för hans dagliga motionsrunda och klarade sig oskadd");
                }
                else if(pt.owl.getLuckyDay() == false){
                    System.out.println("Våran käre " + pt.owl.getName() + " hann tyvär inte flyga ur boet i tid och vilar nu i ugglehimlen");
                }
        }
        else{
            System.out.println();

        }
    }

    // En metod som lägger till ekorrar i trädet
    public void squirrelsInTree(){


        //Skapar 3 ekorrar
        Squirrel John = new Squirrel("John",2, generateRandomNumber(0,1), 5, 25);
        Squirrel Doe = new Squirrel("Orre",2, generateRandomNumber(0,1), 3, 20);
        Squirrel Dummy = new Squirrel("Orvar",4,generateRandomNumber(0,1), 4,23);


        if (numbOfSquirrelsInTree == 0) {
                pt.squirrels.add(John);
        }
        else if (numbOfSquirrelsInTree == 1) {
                pt.squirrels.add(John);
                pt.squirrels.add(Doe);
            }
        else if (numbOfSquirrelsInTree == 2){
                pt.squirrels.add(John);
                pt.squirrels.add(Doe);
                pt.squirrels.add(Dummy);
        }
    }

// En metod för att generera ett slumpat tal
    public int generateRandomNumber(int min, int max) {
        Random rand = new Random();
        int randomInt = rand.nextInt(max - min ) + min;
        return randomInt;
    }
}
