import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {

        var s = new Scanner(System.in);

        int valor = randomGen();
        boolean acierto = false;
        int intentos = 0;

        do {

            System.out.println("Este es tu intento: " + intentos);
            System.out.println("Introduce un número: ");
            int temp = Integer.parseInt(s.nextLine());

            if (temp == valor) {
                System.out.println("Has acertado.");
                acierto = true;
            }else{
                intentos++;
                if (temp < valor){
                    System.out.println("Es menor que el numero buscado.");
                }else{
                    System.out.println("Es mayor que el numero buscado.");
                }
            }

        }while(intentos < 6 && !acierto);

        if (!acierto){
            System.out.println("Has perdido, el numero es: " + valor);
        }else{
            System.out.println("Has ganado.");
        }

    }

    public static int randomGen(){
        return (int) (Math.random() * 101);
    }
}
