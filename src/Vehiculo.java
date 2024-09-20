public class Vehiculo {

    private String patente; //  private final String PATENTE; ejemplo ficticio constante
    private String marca;
    private Integer modelo;
    private Motor motor;
    private static String seguro;


    public Vehiculo(String patente, String marca, Integer modelo, Motor motor) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public static void cambiarSeguro(String seguroNuevo){
        seguro= seguroNuevo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", motor=" + motor +
                '}';
    }

    public String getPatente(){
        return  patente;
    }
    public void setPatente(String patente ){
        patente=patente;
    }

    public Motor getMotor(){
        return motor;
    }
    public void setMotor(Motor nuevoMotor ){
        motor=nuevoMotor;
    }
/* No lo vimos todavia
    @Override
    public boolean equals(Object obj) {
        return this.patente.equals(((Vehiculo)obj).patente );
    }
*/

    public boolean equals(Vehiculo vehiculo ){
        return  this.patente.equals( vehiculo.patente);
    }

}
