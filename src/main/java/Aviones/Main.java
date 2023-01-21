package Aviones;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        AvionPerseguido avionPerseguido = new AvionPerseguido();
        AvionCaza avioncaza = new AvionCaza(avionPerseguido);



        for(int i=0; i<40; i++){
            avionPerseguido.setAltitude(rand.nextInt(30)*1000);
            avionPerseguido.setSpeed(rand.nextInt(6)*100);
            avionPerseguido.setDirection(rand.nextInt(360));

            System.out.println("_________________________________________________________________");
            System.out.println();
            System.out.println("Avion Perseguido está en: ");
            avionPerseguido.printParameters();
            System.out.println();

            System.out.println("Avion Caza(Perseguidor) está en: ");
            avioncaza.printParameters();
            System.out.println();
            System.out.println("_________________________________________________________________");
        }


        }
    }

