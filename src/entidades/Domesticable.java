package entidades;

// no puede instanciarse !new
public interface Domesticable {
 // constante
    int CANT_MESES=3;
    //método abstracto
    public void domesticar();

    public static void visualizarMesesDomesticacion(){
        System.out.println("cantidad de meses domesticación "+CANT_MESES );
    }


}
