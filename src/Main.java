import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        CuentaCorriente cuentaCorriente= new CuentaCorriente(5000.0,new Cliente());
       // System.out.println( cuentaCorriente.extraer(10000.0) );

        cuentaCorriente.extraer(2000.0);
        cuentaCorriente.extraer(10000.0);
        cuentaCorriente.extraer(500000.0);



    }

}

