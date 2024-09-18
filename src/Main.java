import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // arrayScannerUnaLinea();
       //arrayScannerPelisSeparados();

      // ordenarPelis();
      //  pasarArrayMayus();

        crearArrayAPartir2Cadenas();

    }

/*Crea un array de cuatro películas  e imprimirlas por orden alfabético.
Crea un nuevo array que contenga la lista de películas en mayúscula. (main)
Resolver los ejercicios 1 y 2 implementando dos funciones que utilicen la clase Scanner.

Crea una variable que guardará la primera película que comience con “L”,
se debe recorrer el array buscando el primer resultado.

Necesitamos un programa que reciba dos cadenas de texto y
que  cada una contenga dos películas separadas por una coma.
El método debe retornar la que tenga mayor cantidad de caracteres.
Debe generar un array de cuatro elementos.

* */

    public static void arrayScannerUnaLinea(){
       // String[] nuevasPelis= new String[4];
        Scanner scanner= new Scanner(System.in);
        System.out.println("ingresa las cuatro pelis separadas por coma");
        String pelis= scanner.nextLine();
        String[] pelisAgrupadas= pelis.split(","); // este método crea el nuevo array de 4 elementos x nostros
        for (int i = 0; i < pelisAgrupadas.length; i++) {
            System.out.println(pelisAgrupadas[i]);
        }
    }

    public static void arrayScannerPelisSeparados(){
        String[] nuevasPelis= new String[3];
        String peliL;

        Scanner scanner= new Scanner(System.in);
        System.out.println("ingresa la peli 1 ");
        String pelis1= scanner.nextLine();
        nuevasPelis[0]=pelis1;
        //System.out.println("ingresa la peli 2");
        String pelis2= scanner.nextLine();
        nuevasPelis[1]=pelis2;
      //  System.out.println("ingresa la peli 3");
        String pelis3= scanner.nextLine();
        nuevasPelis[2]=pelis3;
        Arrays.sort(nuevasPelis);
        for (int i = 0; i < nuevasPelis.length; i++) {
            if(nuevasPelis[i].toLowerCase().charAt(0) == 'l'){
                peliL=nuevasPelis[i];
                System.out.println("esta es la peli que inicia con L" + "\n" +peliL);
            }
            System.out.println(nuevasPelis[i].toUpperCase());
        }
    }



    public static void ordenarPelis(){
        //
        String[] pelisOrdenadas= new String[2];
        // recibir información
        Scanner scanner= new Scanner(System.in );

        System.out.println("ingresa la peli 1 ");
        String peli1= scanner.nextLine(); // recibe texto
        pelisOrdenadas[0]= peli1;
        System.out.println("ingresa la peli 2 ");
        String peli2= scanner.nextLine();
        pelisOrdenadas[1]= peli2;

        Arrays.sort(pelisOrdenadas);
        for (int i = 0; i < pelisOrdenadas.length  ; i++) {
            System.out.println(pelisOrdenadas[i]);
        }
    }

    public static void pasarArrayMayus(){

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingresa cuatro pelis separadas por coma ");
        String pelisRecibidas= scanner.nextLine();
        String[]  arrayPelisSeparadas= pelisRecibidas.split(",");
        Arrays.sort(arrayPelisSeparadas);
        for (int i=0; i < arrayPelisSeparadas.length; i++ ){
            System.out.println(arrayPelisSeparadas[i].toUpperCase());
        }


    }


    /*
    * Necesitamos un programa que reciba dos cadenas de texto por consola y
    * que  cada una contenga dos apellidos y nombres separados por una coma.
El método debe retornar  la que tenga mayor cantidad de caracteres.
*
Debe generar un array de cuatro elementos.
Debe guardar en el array e imprimirlas por consola.
    *
    * */

    public static String comparandoNombres(){
       String[] nombresRecibidos= new String[4];
        //Recibimos la info
        Scanner scanner= new Scanner(System.in);
        System.out.println("ingrese apellido y nombre separado por coma");
        String cadena1= scanner.nextLine();
        System.out.println("ingrese el segundo apellido y nombre separado por coma");
        String cadena2= scanner.nextLine();
      /*
        // guardar en el array e imprimir antes de que corte la ejecución
        String[] nombresCadena1= cadena1.split(",");
        nombresRecibidos[0]=nombresCadena1[0];
        nombresRecibidos[1]= nombresCadena1[1];

        String[] nombresCadena2= cadena2.split(",");
        nombresRecibidos[2]=nombresCadena2[2];*/

        // retorna la mayor cadena -1,0,1
       if(cadena1.compareTo(cadena2) == -1){
           return cadena2; }
       else if( cadena1.compareTo(cadena2) == 0  ){
           return "son iguales";
       }else{
           return cadena1; }


    }

    /*recibir dos cadenas de texto por consola, cada una debe tener dos pelis
     separadas por coma.
     Tenemos que guardarlas en un nuevo array e imprimir todos los elementos del mismo,
      para eso necesitamos crear ese array primero
       y despues de recibir con scanner los strings
      utilizar split por cada cadena para crear un array temporal "" y
      luego guardar sus dos elementos en el array general   */

    public static void crearArrayAPartir2Cadenas(){


        Scanner scanner= new Scanner(System.in);
        System.out.println(" ingresa dos pelis separadas por coma");
        String pelis1= scanner.nextLine();
        System.out.println(" ingresa otras dos pelis separadas por coma");
        String pelis2= scanner.nextLine(); // tengo parsearlo Array

        String[] arrayNuevo= new String[4];

        String[] pelisSeparadas1= pelis1.split(",");// {batman , robin } tenemos un array de 2 elementos
        arrayNuevo[0] = pelisSeparadas1[0]; // batman
        arrayNuevo[1]= pelisSeparadas1[1];// robin

        String[] pelisSeparadas2= pelis2.split(","); // {superman,thor}
        arrayNuevo[2]= pelisSeparadas2[0];
        arrayNuevo[3]=pelisSeparadas2[1];


        for (int i = 0; i < arrayNuevo.length; i++) {
            System.out.println(arrayNuevo[i]);
        }
    }



}

