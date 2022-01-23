package Token_InicioSesion;

public class main {

    public static void main(String[] args) {

        System.out.println("Introduce usuario: ");
        System.out.println("Introduce contraseña: ");

    }

    public static int numLongitud(){

        int numero;

        do {

            numero = (int) (Math.random() * 20);

        }while(numero < 12 || numero > 18);

        return numero;
    }

    public static String letter(){

        String abecedario = "ABCDEFGHIJKLMNPQRSTUVWXYZ";

        int num;

        num = (int) (Math.random() * 25);

        return abecedario.substring(num);

    }

}