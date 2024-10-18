package entidades;

public class Gato extends Animal  {

    private Integer cantidadPresas;

    public Gato(String n, Integer e, String r,Integer presas){
        super(n,e,r);
        this.cantidadPresas=presas;
    }


    //probando protected
    public void viendoAtributosPadre(){
        System.out.println(this.raza);
    }

    @Override
    public void hacerSonido(){
        System.out.println("Maullar ");
    }

    @Override
    public String toString() {
        return "entidades.Gato{" +
                "nombre "+ this.getNombre()+
                " raza " + super.raza +
                " cantidadPresas=" + cantidadPresas +
                '}';
    }
}
