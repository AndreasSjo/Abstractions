package Abstractions.domain;

import java.util.Random;

public class nut {
        boolean nutExists;

        public nut() {
            setNut();
        }

        public void setNut() {
            Random rand = new Random();
            int randomInt = rand.nextInt(2);
            this.nutExists = randomInt != 0;
        }
        public boolean getNut() {return nutExists;}

    }
