public class CajaAhorro extends Cuenta {
    private Double tasaInteres;

    public CajaAhorro(Double saldo, Cliente clienteAsociado) {
        super(saldo, clienteAsociado);

    }

    @Override
    public void depositar(Double monto){
        if (monto <= 0 ){
            System.out.println("ingrense un monto válido");
        }else{
     //this.saldo= this.saldo + monto;
            Double nuevoSaldo= this.getSaldo()+monto;
            this.setSaldo(nuevoSaldo);
        }

    }

    @Override
    public Double extraer(Double monto){
        if( getSaldo()>= monto ){
            Double nuevoSaldo= getSaldo()-monto;
            setSaldo(nuevoSaldo);
            System.out.println("su nuevo saldo es "+ nuevoSaldo);
            return monto;
        }
        System.out.println(" ingrese un monto válido");
     return null;
    }

}
