package entidades;

public class Dueño {

    protected Integer dni;
    private String nombre;
    private Gato gato;
    private Perro perro;

    public void mostrarMascotas(){
        System.out.println(gato.nombre);
        // usando la propiedad protegida en el mismo paquete
    }

    @Override
    public int hashCode() {
        int hash=17;
        hash= hash* nombre.hashCode() * dni.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
       if(obj== null || ! (obj instanceof Dueño) )
       {return false;}
         return  this.dni.equals(((Dueño)obj).dni); //((Dueño)obj).dni.equals(this.dni);

    }

   /* @Override
    public String toString() {
        return "estos son los datos del dueño:"+"\n"+
                this.nombre+"\n"+this.dni;
    }*/

    @Override
    public String toString() {
        return "Dueño{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", gato=" + gato +
                ", perro=" + perro +
                '}';
    }
}
