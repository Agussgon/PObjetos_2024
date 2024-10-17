public class CuentaCorriente extends Cuenta {

    private static Double limiteMontoDescubierto = 50000.0;

    private Double montoDisponible = limiteMontoDescubierto;

    public CuentaCorriente(Double saldo, Cliente clienteAsociado) {
        super(saldo, clienteAsociado);

    }


    @Override
    public void depositar(Double monto) {
        if (monto <= 0) {
            System.out.println("ingrese un monto válido");
        } else if (!montoDisponible.equals(limiteMontoDescubierto)) {
            Double diferencia = limiteMontoDescubierto - montoDisponible;
            if (monto >= diferencia) {
                //
                this.montoDisponible = this.montoDisponible + diferencia;
                // restamos al deposito lo utilizado
                monto -= diferencia; // ver el otro if
                // ahora guardamos lo restante en saldo que estaba en cero...
                this.setSaldo(monto);
                System.out.println("saldo actual después de depositar" + this.getSaldo());

            } else {
                this.montoDisponible = this.montoDisponible + monto;
                System.out.println("saldo actual después de depositar" + this.getSaldo() +
                        " descubierto quedó en" + this.montoDisponible);
            }
        } else {
            Double nuevoSaldo = this.getSaldo() + monto;
            this.setSaldo(nuevoSaldo);
            System.out.println("saldo actual después de depositar " + this.getSaldo());
        }
    }


@Override
public Double extraer(Double monto) {
        //falta la validación para valores menores a cero
    // primero vemos si el saldo alcanza
    if (monto <= this.getSaldo()) {
        setSaldo(this.getSaldo() - monto);
        System.out.println("saldo actual después de extraer " + this.getSaldo());
        return monto;
    } else if (monto <= (this.getSaldo() + this.montoDisponible)) {
        // sino sumamos el descubierto
        Double nuevoMontoDisponible = monto - this.getSaldo();
        setSaldo(0.0);
        this.montoDisponible = this.montoDisponible - nuevoMontoDisponible;
        System.out.println("monto disponible actual después de extraer " + this.montoDisponible);
        return monto;
    }
    // sino error
    System.out.println("supera el límite");
    return null;

}

// otra opción sin el atributo montoDisponible rever
// el método depositar en este caso seria igual a la última opción del actual...
public Double extraer2(Double monto) {
    if (monto <= this.getSaldo()) {
        setSaldo(this.getSaldo() - monto);
        System.out.println("saldo actual después de extraer " + this.getSaldo());
        return monto;
    } else if (monto - this.getSaldo() <= limiteMontoDescubierto) { // cuando el saldo es (-)
        // le sumamos el monto comparando si podemos deber esa plata
        setSaldo(this.getSaldo() - monto);
        System.out.println("Al utilizar el descubierto el saldo quedo en " + this.getSaldo());
        return monto;

    }
    System.out.println("no hay saldo suficiente");
    return null;

}

}
