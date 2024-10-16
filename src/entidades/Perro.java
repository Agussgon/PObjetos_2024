package entidades;

public class Perro extends Animal{
    private String sectorPastoreo;

    public Perro(String n, Integer e, String r, String sectorPastoreo) {
     //utiliza la palabra reservada super para heredar el constructor
        super(n, e, r);
        this.sectorPastoreo = sectorPastoreo;
    }

    public void pastorear(){
        System.out.println(" pastoreando por "+ this.sectorPastoreo);
    }
    public void mostrarDatoProtegido(){
        System.out.println(this.raza);
       String n= this.nombre;
    }


    // sobrescritura
    @Override
    public void hacerSonido(){
        System.out.println("Ladrar");
    }

    @Override
    public void comer(Integer cantidad) {
        System.out.println("cantidad:");
    }


}
