public class Ejercicio_ALEATORIO {
    public static void main(String[] args) {

// GENERA UN NUMERO DE SERIE PARA UN PRODUCTO CON LAS SIGUIENTES CONDICIONES:
        //ESTÁ FORMADO POR LA REPITICION DE 4 NUMEROS ENTRE 333 y 387.
        //SACA POR PANTALLA 50 NUM SERIE VALIDOS

        for (int i = 0; i < 50; i++) {
            System.out.println(codigoLargo(numeroSerie(), numeroSerie(), numeroSerie(), numeroSerie()));
        }

    }

    public static long numeroSerie(){

        long numero;

        do {

            numero = (long) (Math.random() * 400);

        }while(numero < 332 || numero > 388);

            return numero;
    }


    public static long codigoLargo(long num1, long num2, long num3, long num4){

        String lNum1 = String.valueOf(num1);
        String lNum2 = String.valueOf(num2);
        String lNum3 = String.valueOf(num3);
        String lNum4 = String.valueOf(num4);

        String salida = lNum1 + lNum2 + lNum3 + lNum4;

        return Long.parseLong(salida);
    }
}
