import entidades.Animal;
import entidades.Gato;
import entidades.Perro;

public class Main {



    public static void main(String[] args) {




        // objeto de la clase hija y utilizar métodos heredados

        Perro rinTinTin= new Perro("Rin Tin Tin",3,"Manto Negro","A");
        Perro rinTinTin2= new Perro("Rin Tin Tin",3,"Manto Negro","A");

        System.out.println(" son iguales ==? "+ (rinTinTin2 == rinTinTin));




        rinTinTin.pastorear();
        rinTinTin.mostrarDatoProtegido();

        // uso de los métodos de la super clase
        rinTinTin.comer(2);
        rinTinTin.comer("Hueso");
        rinTinTin.hacerSonido();

        Gato silvestre= new Gato("Silvestre",2,"Angora",3);
        silvestre.hacerSonido();
        silvestre.hacerSonido(2);
        silvestre.hacerSonido("hola miau");

      //  String nombreProtected= silvestre.raza;

        Animal animal= new Perro("d",2,"r","a");
        ((Perro)animal).pastorear();
      // abstract
      // Animal animalAbstractoFallido= new Animal();

        // polimorfismo
        animal.hacerSonido();
        animal= new Gato("d",2,"r",3);
        animal.hacerSonido();


        //String nombreAnimal= animal.raza;
        //método heredado sin sobrescribir
        System.out.println(silvestre.toString());
        Gato silvestre2= new Gato("Silvestre",2,"Angora",3);
        System.out.println(silvestre.equals(silvestre2));

        System.out.println("este es el hashcode de silvestre"+silvestre.hashCode());

//polimorfismo

    }


}

