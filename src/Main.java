import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //scanner
    scannerDatosPersonales();


        //arrays

        System.out.println(" creando array sin ordenar");
        String[] comidas= new String[3];   // tiene tres elementos
        comidas[0]= "Pollo con limón";
        comidas[1]="a";
        comidas[2]="jamón de pollo con papas";

        for (int i = 0; i < comidas.length ; i++) {

            System.out.println(comidas[i]);

        }

        Integer[] numeros= new Integer[3];
        numeros[2]=123;


        System.out.println("recorriendo array de números con while");
        int contador=0;

        while(contador < numeros.length || contador < 3 ){

            System.out.println(numeros[contador]+ " ¿Dónde está Fede?" );
            contador ++;
            if( contador == 3){
                System.out.println(" Acá estoy");
            }
        }
        // simplemente lo ordenamos
        System.out.println("Ahora ordenamos alfabéticamente el array comidas");
      Arrays.sort(comidas);
        for (int i = 0; i < comidas.length ; i++) {
            System.out.println(comidas[i]);
        }
/// recorro el array para imprimir la inicial de cada elemento
        for (int i = 0; i < comidas.length ; i++) {
            comidas[i].charAt(0);
            System.out.println("Imprimo la inicial "+ comidas[i].charAt(0));
        }


        System.out.println(" Ejercicio con copia del Array");
        // minusc lower case
        String[] copiaComidas= new String[3];

        for (int i = 0; i < comidas.length ; i++) {
            copiaComidas[i]= comidas[i].toUpperCase()  ;
            System.out.println(copiaComidas[i]);
        }



    }

    public static void scannerDatosPersonales(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese su nombre y edad: ");
        String nombreRecibido = scanner.nextLine();
        Integer edadRecibida= scanner.nextInt();
        System.out.println("usted ingreso la siguiente información "+ '\n'
                + nombreRecibido
                + '\n'+ " la clase es " + nombreRecibido.getClass()
                + '\n'+ "la edad ingresada es" + edadRecibida + '\n'+
                " la clase del objeto es "+ edadRecibida.getClass() );

    }


}