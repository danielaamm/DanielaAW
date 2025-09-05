public class Retirar {
    public void ejecutar(Banco banco, double cantidad) {
        if (cantidad > 0 && cantidad <= banco.getSaldo()) {
            banco.setSaldo(banco.getSaldo() - cantidad);
            System.out.println("Retiro realizado con éxito.");
            System.out.println("Su nuevo saldo actual es: $" + banco.getSaldo());
        } else {
            System.out.println("Cantidad inválida.");
        }
    }
}

