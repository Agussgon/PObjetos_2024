import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Motor motor1= new Motor(245.3, "PREMIUM-L");
        System.out.println(motor1.toString());;
        motor1.setModelo("LOW-COST");
        System.out.println(motor1.getModelo());
        System.out.println( motor1.sonIguales(motor1));
        motor1.tieneMasPotencia(motor1);

        Vehiculo auto= new Vehiculo("aer234","Audi",3,motor1);
        Vehiculo auto2= new Vehiculo("aer233","Audi",3,motor1);
        System.out.println(auto.equals(auto2));

        Motor motor2= new Motor(242.3, "AWE");
        auto.setMotor(motor2);
        System.out.println(auto.getMotor()+ "\n"+ auto.toString());




    }

}

