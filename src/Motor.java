public class Motor {

    private Double potencia;
    private String modelo;

    // constructor
    public Motor(Double potenciaIngresada, String modelo  ){
     this.potencia=potenciaIngresada;
     this.modelo= modelo;
    }

    //getters y setters

    public String getModelo(){

        return this.modelo;
    }

    public void setModelo( String modeloNuevo){
        this.modelo = modeloNuevo;
    }

    // Métodos que heredamos de Objects equals, compareTo, toString

    public Boolean sonIguales(Motor otroMotor ){
        return this.modelo.equals(otroMotor.modelo);
    }

    public void tieneMasPotencia(Motor otroMotor ){
        if(this.potencia.compareTo(otroMotor.potencia)== 1 ){
            System.out.println("el motor "+ this.modelo + " es más potente" );
        }else{
            System.out.println("el motor "+ otroMotor.modelo  +
                    " es más potente o igual" );  }

    }

    @Override
    public String toString() {
        return "Motor{" +
                "potencia=" + potencia +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
