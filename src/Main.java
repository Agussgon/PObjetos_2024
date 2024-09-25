import entidades.Producto;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {


        String[] a= new String[2];

        //instanciamos el objeto
        Producto pelotaModelo1= new Producto("pelota modelo 2024",25000.0,
                50000.0,20);
        System.out.println(" este es el objeto creado con el constructor personalizado"+
                '\n'+ pelotaModelo1+
                '\n'+ pelotaModelo1.informarStock()+
                '\n'+ pelotaModelo1.stockDisponible()+
                '\n'+pelotaModelo1.calcularGananciaObtenida());
        System.out.println("constante comisión en producto "+ pelotaModelo1.getCOMISION()+'\n'+
                "calculando comision usando la variable estática " + pelotaModelo1.calcularComision());

        Producto pelotaModelo2= new Producto();
        System.out.println("este lo creamos con el que viene por defecto implicito" +pelotaModelo2);

        Producto pelotaModelo3= new Producto("tercer modelo",30 );
        System.out.println("tercer modelo "+ pelotaModelo3);


        ArrayList productos= new ArrayList<Producto>();
        productos.add(new Producto("libro 1",10000.0,20000.0,10));
        productos.add(pelotaModelo1);
        productos.add(2,pelotaModelo3);

        for (int i = 0; i < productos.size() ; i++) {
            System.out.println(productos.get(i));
        }

        productos.remove(2);
        productos.contains(pelotaModelo2);
        productos.isEmpty();
        // permie almacenar valores nulos también
    }




}