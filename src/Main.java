import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Object obj = "123";
        //Integer numero = (Integer) obj; // Intento de casteo inválido classcastException

        if (obj instanceof String) {
            String str = (String) obj; //casteo
            Integer numero = Integer.parseInt(str); // Parseo de String a Integer
            System.out.println("Número: " + numero);
        }



        String cadena="1234" ;
        Integer num= Integer.parseInt(cadena);
        Double numDouble= Double.parseDouble(cadena);
        String num2= Integer.toString(num);


        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(1990, 8, 15);
        System.out.println("Año actual "+fechaActual.getYear() );
       // System.out.println(fechaActual.getYear() - fechaNacimiento.getYear());


        //of pattern
        DateTimeFormatter fechaHoraPersonalizada= DateTimeFormatter.ofPattern("yyy MM dd");
        String fechaFormateada=fechaHoraPersonalizada.format(fechaNacimiento);
        System.out.println(fechaFormateada);

        Date fecha=new Date(100,2,20);
        System.out.println(fecha.toString());
        Date hoy= new Date();
        int  anioActual= hoy.getYear();
        System.out.println(anioActual); //124

        Float decimal=2.5f;
        Double a= 2.5;
        a.equals(decimal);



        String saludo= null;
        //saludo="";

        if (saludo == null)
        {
            System.out.println("Cadena con valor nulo");
        }else
        {System.out.println("¿Qué retorna?" + saludo.length());
        }

        compareStrings("hola","hola");

        Integer num1=20;
        Integer num2_2=1;

        compareInteger(2,1,110.2);

        countS("sasa asa");

        System.out.println( getAnioNac(33));

        /*
        Crea un arrays de cuatro películas  e imprimirlas por orden alfabetico.*/

        String[] pelis= new String[]{"Alien", "E.T","Batman","Up"};
        Arrays.sort(pelis);
        for (int i = 0; i < pelis.length ; i++) {
            System.out.println(pelis[i]);
        }

        /*Crea un nuevo array que contenga la lista de películas en mayúscula.*/
        String[] pelisMayus= new String[4];
        for (int i = 0; i < pelis.length; i++) {
          pelisMayus[i]=pelis[i].toUpperCase();
            System.out.println(pelisMayus[i]);
        }

        //scanner
        countSConsole();


    }


    /* Crea una función que reciba dos cadenas de texto. Debe comparar si son iguales y
    retornar un booleano además de imprimir un mensaje con el resultado.
     */

    public static boolean compareStrings(String cadena1, String cadena2){
        boolean resultado=cadena1.equals(cadena2);
        System.out.println(resultado);
        return resultado;

    }

    /*      Definir dos variables Integer y asignarles un valor a cada una,
    crea una función que determine
     si el primero es mayor que el producto del segundo y un porcentaje dado
     */

    public static Integer compareInteger(Integer numA, Integer numB,Double porcentaje){
        Integer resultado=numA.compareTo((int)(numB* porcentaje));// No hay conversión directa
        if (resultado >= 0){
            System.out.println("El primero es mayor ");
        }else{
            System.out.println("El primero es menor ");
        }
        return resultado;
    }

    /*Escribí una función que reciba una cadena de texto y cuente la cantidad de “s”.
     Retorna la cantidad encontrada.
     */

    public static Integer countS(String texto){
        Integer contador=0;
        for (int i = 0; i <texto.length() ; i++) {
        if(texto.charAt(i) == 's'){
            contador ++;

        };
        }
        System.out.println(contador);
        return  contador;
    }

    /*Crea una función que reciba una edad y determine el año de nacimiento*/

    public static int getAnioNac(int edad){
        int anioActual= LocalDate.now().getYear();
        return anioActual - edad;

    }

    /*Resolver el ejercicio 7 de la primera parte( switch) , el 4 y 6 de esta 2°
    implementando la clase Scanner.
     */

    public static void countSConsole(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el texto para contabilizar las s");
        String texto= scanner.nextLine();
        countS(texto);
        // podríamos pedir que nos envien varios datos y almacenarlos en != variables utilizando un separador
        String[] palabras=texto.split(" ");
        String palabra1= palabras[0];
        System.out.println(palabra1);

    }






    // casteo

    public static void calcularFaltas(int encuentros, double porcentaje){
        int a= (int) (encuentros*porcentaje);
        int faltas= encuentros - a;
        System.out.println(faltas);
    }


}

