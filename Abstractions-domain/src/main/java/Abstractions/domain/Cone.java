package Abstractions.domain;

import java.util.Random;

public class Cone {
        boolean edible;


        public void setEdible(){
            Random random = new Random();
            boolean tempEdible = random.nextBoolean();
            this.edible = tempEdible;
        }


    }
