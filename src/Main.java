import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {


        deuda(50000, 20000);
        deuda(50000, 50000);
        deuda(50000, 200000);


    }

    // quiero sber si el monto de pago es mayor a la deuda y el saldo a favor o adeudado
    public static Integer deuda( Integer monto, Integer deuda ){

        int diferencia= monto.compareTo(deuda);
        Integer saldo= monto - deuda;

        if(diferencia ==1 ){
            System.out.println("saldo a favor "+ saldo);
            return saldo;
        }else if( diferencia == 0 ){
            System.out.println("sin deuda");
            return saldo;
        }else{
            System.out.println("saldo  "+ Math.abs( saldo));
            return Math.abs(saldo); // valor absoluto
        }



    }



   public static Boolean ingresa(LocalDate fechaNacimiento, Boolean tieneEntrada){
        // primero necesito saber si es mayor de edad
       int  edad= LocalDate.now().getYear() -  fechaNacimiento.getYear()  ;
        // segundo necesito saber si tiene entrada válida
       if( tieneEntrada  && edad >= 18  ){
           return true;
       } else {
           return false;
       }
   }



   /*
   * Escribí una función que reciba una cadena de texto
   *  y cuente la cantidad de “s”. Retorna la cantidad encontrada.
    * */

    public static int contarS(String texto){
        int contador=0;

        for (int i = 0; i <texto.length() ; i++) {
            if(texto.charAt(i) == 's' ){
                contador++;
            }
        }
        System.out.println(" la cantidad de s de el texto es "+ contador);
        return contador;

    }

    /*
    * Necesitamos crear una función que reciba dos números
    *  en formato texto y retorne el cociente de dividir el primero por el segundo.

     * */

}