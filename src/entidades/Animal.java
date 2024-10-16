package entidades;

public abstract class Animal {

    protected String nombre;
    private Integer edad;
    //nuevo tipo de visibilidad;
    protected String raza;
    private final Integer CANT_COMIDAS=2;

    public Animal(String n, Integer e, String r){
       this.nombre=n;
       this.edad=e;
       this.raza=r;

    }

  // las clases hijas no pueden sobrescribirlo "final"
    public final void mostrarComidas(){
        System.out.println(CANT_COMIDAS);
    }

    // firma de un método: nombre, parámetros y tipos de esos parámetros
    // constructores
    // sobreescritura
    public void hacerSonido(){
        System.out.println("El animal realiza sonido");
    }
    // ej sobrecarga
    public void hacerSonido(Integer numero){
        System.out.println("cuenta hasta "+ numero);
    }
    // ej 2  sobrecarga
    public void hacerSonido(String saludo){
        System.out.println(saludo);
    }

    // sobrecarga el nombre es el mismo pero la firma no es identica(parametros)
    public abstract void comer(Integer cantidad );
    public void comer(String comida){
        System.out.println("El animal come: "+ comida );
    }

    //sobrescribiendo de la clase Object
    @Override
    public String toString() {
        return "entidades.Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                '}';
    }

    public String getNombre(){
        return this.nombre;
    }


    @Override
    public int hashCode() {
        int hash=11;
        hash= hash* this.nombre.hashCode()* this.edad.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object o){
        if(o == null)return false;
        else if( o.getClass() != this.getClass() //|| o instanceof Animal
         ){
            return false;
        }else{
            //casteo
            return ((Animal)o).nombre.equals(this.nombre) &&
                    ((Animal) o).edad.equals(this.edad) &&
                    ((Animal) o).raza.equals(this.raza) ;

        }

    }

}
