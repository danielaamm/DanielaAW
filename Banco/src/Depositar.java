public class Depositar {
    public void ejecutar(Banco banco, double cantidad) {
        if (cantidad > 0) {
            banco.setSaldo(banco.getSaldo() + cantidad);
            System.out.println("Depósito realizado con éxito.");
            System.out.println("Su nuevo saldo actual es: $" + banco.getSaldo());
        } else {
            System.out.println("La cantidad debe ser mayor a 0.");
        }
    }
}

