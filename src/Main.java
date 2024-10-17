import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        CuentaCorriente cuentaCorriente = new CuentaCorriente(5000.0, new Cliente());
        // System.out.println( cuentaCorriente.extraer(10000.0) );
   /*

    System.out.println("utilizando el atributo monto acumulado");
        cuentaCorriente.extraer(2000.0);
        cuentaCorriente.extraer(10000.0);
        cuentaCorriente.extraer(500000.0);

*/

        System.out.println("sin utilizar el atributo monto acumulado");
        cuentaCorriente.extraer2(5000.0);
        cuentaCorriente.extraer2(20000.0);
        cuentaCorriente.extraer2(30000.0);
        cuentaCorriente.extraer2(50000.0);

        cuentaCorriente.depositar(80000.0);


        // n° negativos
        double n = 23;
        if (20 > -n) {
            System.out.println("20 es más grande");
        }

        //
        if (n > -cuentaCorriente.getSaldo()) {
            System.out.println("23 es más grande");
        }


    }

}

