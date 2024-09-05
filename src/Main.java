import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // arrayScannerUnaLinea();
       arrayScannerPelisSeparados();

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



}

