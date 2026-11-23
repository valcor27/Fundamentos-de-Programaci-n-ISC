public class CuentaBancaria {
    // Estado interno del objeto
    double saldo = 500.0;

    // Actúa como MÉTODO: modifica las características de ESTA cuenta específica
    public void retirarDinero(double cantidad) {
        saldo = saldo - cantidad;
        System.out.println("Retiro exitoso. Te quedan: $" + saldo);
    }

    public void ingresarDinero(double dinero) {
        saldo = saldo + dinero;
        System.out.println("Deposito exitoso, El nuevo saldo de la cuenta es de: " + saldo);
    }

    public static void main(String[] args) {
        // Necesitamos CREAR el objeto (el coche) antes de usar su método (el
        // acelerador)
        CuentaBancaria miCuenta = new CuentaBancaria();

        // El método se llama "a través" del objeto usando un punto
        miCuenta.retirarDinero(100.0);
        // llamamos al metodo ingresarDinero
        miCuenta.ingresarDinero(250.33);

    }
}