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
        } else {
            if (!montoDisponible.equals(limiteMontoDescubierto)) {
                Double diferencia = limiteMontoDescubierto - montoDisponible;
                this.montoDisponible += diferencia;
                // restamos al deposito lo utilizado
                monto -= diferencia;
                // ahora guardamos lo restante en saldo que estaba en cero...
                this.setSaldo(monto);
                System.out.println("saldo actual después de depositar" + this.getSaldo());

            } else {
                Double nuevoSaldo = this.getSaldo() + monto;
                this.setSaldo(nuevoSaldo);
                System.out.println("saldo actual después de depositar " + this.getSaldo());
            }
        }
    }

    @Override
    public Double extraer(Double monto) {
        // primero vemos si el saldo alcanza
        if (monto <= this.getSaldo()) {
            setSaldo(this.getSaldo() - monto);
            System.out.println("saldo actual después de extraer " + this.getSaldo());
            return monto;
        } else if (monto <= (this.getSaldo() + this.montoDisponible)) {
            // sino sumamos el descubierto
            setSaldo(0.0);
            Double nuevoMontoDisponible = monto - this.getSaldo();
            this.montoDisponible = this.montoDisponible - nuevoMontoDisponible;
            System.out.println("monto disponible actual después de extraer " + this.montoDisponible);
            return monto;

        }
        // sino error
        System.out.println("supera el límite");
        return null;

    }

    // otra opción sin el atributo montoDisponible
    // el método depositar en este caso seria igual a la última opción del actual...
    public Double extraer2(Double monto) {
        if (monto <= this.getSaldo()) {
            setSaldo(this.getSaldo() - monto);
            System.out.println("saldo actual después de extraer " + this.getSaldo());
            return monto;
        } else if (monto - this.getSaldo() <= limiteMontoDescubierto) {
            setSaldo(this.getSaldo() - monto);
            System.out.println("Al utilizar el descubierto el saldo quedo en " + this.getSaldo());
            return monto;

        }
        System.out.println("no hay saldo suficiente");
        return null;

    }

}
