package entidades;

public class Perro extends Animal implements Domesticable {
    private String sectorPastoreo;

    public Perro(String n, Integer e, String r, String sectorPastoreo) {
     //utiliza la palabra reservada super para heredar el constructor
        super(n, e, r);
        this.sectorPastoreo = sectorPastoreo;
    }

    @Override
    public void domesticar(){
        System.out.println("Domesticando al perro "+ this.nombre+
                " edad "+this.getEdad());

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


}
