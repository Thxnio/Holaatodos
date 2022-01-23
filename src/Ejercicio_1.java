import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {

        var s = new Scanner(System.in);

        int number;


        do {

        System.out.println("Insert number: ");
        number = Integer.parseInt(s.nextLine());

        switch (Menu()){

            case 1:
            break;

            case 2: esPrimo(number);
                break;

            case 3:
                break;

            case 4:
                break;

            case 5:
                break;

        }

        }while(Menu() != 15);
    }

    //FUNCIONES


 public static int Menu(){
     int opcion;

     var s = new Scanner(System.in);

     System.out.println("""
             1. Capicua.
             2. Es primo.
             3. Siguiente Primo.
             4. Potencia.
             5. Digitos.
             6. Voltea.
             7. Digito N.
             8. Posicion de digito.
             9. Quita por detras.
             10. Quita por delante.
             11. Pega por detras.
             12. Pega por delante.
             13. Trozo de numero.
             14. Junta numeros.
             15. Salir.""");

     opcion = Integer.parseInt(s.nextLine());

     return opcion;

 }//MENU



    public static boolean esPrimo (int x){
        for (int i = 2; i < x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }//FUNCION ES PRIMO

}


