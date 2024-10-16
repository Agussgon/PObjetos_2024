public class CuentaCorriente extends Cuenta{

    private static Double limiteMontoDescubierto= 50000.0;

    private Double montoDisponible= limiteMontoDescubierto;

    public CuentaCorriente(Double saldo, Cliente clienteAsociado) {
        super(saldo, clienteAsociado);

    }

    @Override
    public void depositar(Double monto){
        if (monto <= 0 ){
            System.out.println("ingrese un monto válido");
        }else{
            //this.saldo= this.saldo + monto;
            Double nuevoSaldo= this.getSaldo()+monto;
            this.setSaldo(nuevoSaldo);
        }

    }

    @Override
    public Double extraer(Double monto){
       // primero vemos si el saldo alcanza
        if(monto <= this.getSaldo()){
            setSaldo(this.getSaldo()-monto);
            System.out.println("saldo actual después de extraer "+ this.getSaldo());
            return monto;
        } else if( monto <= (this.getSaldo()+ this.montoDisponible)){
            // sino sumamos el descubierto
            setSaldo(0.0);
            Double nuevoMontoDisponible= monto-this.getSaldo();
            this.montoDisponible= this.montoDisponible - nuevoMontoDisponible;
            System.out.println("monto disponible actual después de extraer "+ this.montoDisponible);
            return monto;

        }
        // sino error
        System.out.println("supera el límite");
       return null;

    }

}
