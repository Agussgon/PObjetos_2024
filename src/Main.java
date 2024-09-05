import entidades.Producto;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //instanciamos el objeto
        Producto pelotaModelo1= new Producto("pelota modelo 2024",25000.0,
                50000.0,20);
        System.out.println(" este es el objeto creado con el constructor personalizado"+
                '\n'+ pelotaModelo1+
                '\n'+ pelotaModelo1.informarStock()+
                '\n'+ pelotaModelo1.stockDisponible()+
                '\n'+pelotaModelo1.calcularGananciaObtenida());

        Producto pelotaModelo2= new Producto();
        System.out.println("este lo creamos con el que viene por defecto implicito" +pelotaModelo2);

        Producto pelotaModelo3= new Producto("tercer modelo",30 );
        System.out.println("tercer modelo "+ pelotaModelo3);
    }




}