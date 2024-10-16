public abstract class Cuenta {
    private Double saldo;
    private Cliente clienteAsociado;

    public Cuenta(Double saldo, Cliente clienteAsociado) {
        this.saldo = saldo;
        this.clienteAsociado = clienteAsociado;
    }


    // no sería necesario que fuera abstract
    public abstract void depositar(Double monto);

    public abstract Double extraer(Double monto);


    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
