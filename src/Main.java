import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      ingresarMotor();

        nombreMetodo();
     /*   Motor motor1= new Motor(245.3, "PREMIUM-L");
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

        //colección dinámica de vehiculos
        ArrayList<Vehiculo> listaAutos= new ArrayList<>();
        listaAutos.add(auto);
        listaAutos.add(auto2);

        System.out.println(  "está vacio? "+ listaAutos.isEmpty()+"\n"+
        "tiene el auto2 en la lista? "+ listaAutos.contains(auto2)+"\n"
                +"elimino el auto? "  + listaAutos.remove(auto) );

        System.out.println("recorriendo ArrayList ");
        for (int i = 0; i < listaAutos.size() ; i++) {
            System.out.println(listaAutos.get(i));
        }

        //coleccion estática array
        Vehiculo[] autosEstaticos= new Vehiculo[3];
        autosEstaticos[0]= auto;

     //   nombreMetodo();*/

    }


    public static void nombreMetodo(){
      // ¿continuar?
        Boolean continuar=true;

        // esta es la lista de motores
        ArrayList<Motor> motores= new ArrayList<>();

        Scanner scanner= new Scanner(System.in);

     while(continuar){

        System.out.println("ingresa un nuevo motor al sistema de la siguiente forma:" +
                "204.0(potencia), ewkor(modelo)");
        String infoIngresada=scanner.nextLine();
        String[] arrayInfo= infoIngresada.split(",");
        Motor motorIngresado= new Motor( Double.parseDouble(arrayInfo[0]),arrayInfo[1]);
        motores.add(motorIngresado);
        System.out.println("¿Continuar ingresando info? ");
        continuar= scanner.nextBoolean();
        scanner.nextLine();

     }

        for (int i = 0; i < motores.size(); i++) {
            System.out.println(motores.get(i));
        }

    }

    public static void ingresarMotor(){
        // ¿continuar?
        Boolean continuar=true;
        // esta es la lista de motores
        ArrayList<Motor> motores= new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        while(continuar){

            System.out.println("ingresa la potencia con este formato: 2.0");
            String potencia= scanner.nextLine();
            System.out.println("ingresa modelo: 2dfsfsd");
            String modelo= scanner.nextLine();
            Motor motorNuevo= new Motor(Double.parseDouble(potencia),modelo);
            motores.add(motorNuevo);

            System.out.println("¿Continuar ingresando info? ");
            continuar= scanner.nextBoolean();
            scanner.nextLine();
        }
        for (int i = 0; i < motores.size(); i++) {
            System.out.println(motores.get(i));
        }

    }
    public static void ingresarMotorDouble(){
        // ¿continuar?
        Boolean continuar=true;
        // esta es la lista de motores
        ArrayList<Motor> motores= new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        while(continuar){

            System.out.println("ingresa la potencia con este formato: 2.0");
            Double potencia= scanner.nextDouble();
            System.out.println("ingresa modelo: 2dfsfsd");
            String modelo= scanner.nextLine();
            Motor motorNuevo= new Motor(potencia,modelo);
            motores.add(motorNuevo);

            System.out.println("¿Continuar ingresando info? ");
            continuar= scanner.nextBoolean();
            scanner.nextLine();
        }
        for (int i = 0; i < motores.size(); i++) {
            System.out.println(motores.get(i));
        }

    }




}

