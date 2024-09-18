import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Sube sube1= new Sube(123,2000.0 );
        System.out.println("ver el límite del saldo negativo");
        System.out.println( "desde la clase "+ Sube.getLimiteSaldoNegativo2()
                        + "\n"+ "desde el objeto "+ sube1.getLimiteSaldoNegativo()
                );

        Sube.setLimiteSaldoNegativo(5000.0);
        System.out.println(Sube.getLimiteSaldoNegativo2());







    }



}

