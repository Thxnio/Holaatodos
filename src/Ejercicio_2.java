import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {

        var s = new Scanner(System.in);

        int numero;

        System.out.println("Introduce: ");
        numero = Integer.parseInt(s.nextLine());

        System.out.println((binarioDecimal(numero)));

    }

    public static int binarioDecimal (int x){

        int y, digito, exponente = 0;
        int decimal = 0;

        while (x != 0) {

            digito = x % 10;

            decimal = decimal + digito * (int) Math.pow(2, exponente);

            exponente++;
            //se quita la última cifra para repetir el proceso
            x = x / 10;
        }
        return decimal;
    }
}

