import java.util.Scanner;

public class Ejercicio_14 {

    public static void main(String[] args) {

        var s = new Scanner(System.in);

        System.out.print("Cuantas apuestas desea: ");
        int nBets = Integer.parseInt(s.nextLine());

        for (int i = 0; i < 15; i++) {
            System.out.println(printLine(nBets,i+1));
        }
    }

    public static String random1X2(){

        int random;

        random = (int) (Math.random() * 3);

        switch (random){

            case 0:
                return "X";
            case 1:
                return "1";
            case 2:
                return "2";
        }
        return null;
    }

    public static String printLine(int bets, int match){

        String line = "Partido " + match + ": ";

        for (int i = 0; i < bets; i++) {
            line += "\t|\t";
            line += random1X2();
        }
        
        return line;
    }
}
