package Apuestas;

import java.util.Scanner;

public class Apuesta {

    public static void main(String[] args) {

        var s = new Scanner(System.in);

        int nDobles = 0, nTriples = 0, nBets;

        System.out.print("¿Cuantas apuestas desea?: ");
        nBets = Integer.parseInt(s.nextLine());


        for (int i = 1; i < nBets + 1; i++) {

            do {
                System.out.print("¿Cuantos dobles quieres en apuesta numero " + i + "?: ");
                nDobles = Integer.parseInt(s.nextLine());

                if (nDobles > 14) System.out.println("Número máximo de dobles es 14.");

            } while (nDobles > 14);

            do {

                System.out.print("¿Cuantos triples quieres en apuesta numero " + i + "?: ");
                nTriples =  Integer.parseInt(s.nextLine());

                if (nTriples > 9) System.out.println("Número máximo de triples es 9.");

            }while(nTriples > 9);
        }

        for (int i = 0; i < 15; i++) {
            System.out.println(printLine(nBets,i+1, nDobles, nTriples));
        }
    }

    public static String random1X2(){

        int random;

        random = (int) (Math.random() * 3);

        switch (random){

            case 0:
                return "|X|";
            case 1:
                return "|1|";
            case 2:
                return "|2|";
        }
        return null;
    }


    public static String printLine(int bets, int match, int nDobles, int nTriples){

        String line = "Partido " + match + ": ";

        for (int i = 0; i < bets; i++) {
            line += "\t\t";
            line += random1X2();
        }

        return line;
    }
}
