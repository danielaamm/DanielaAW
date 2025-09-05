import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco(2000);
        int opcion;
        double cantidad;
        do {
            System.out.println("\n--- Banco ---");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    cantidad = sc.nextDouble();
                    new Depositar().ejecutar(banco, cantidad);
                    break;

                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    cantidad = sc.nextDouble();
                    new Retirar().ejecutar(banco, cantidad);
                    break;

                case 3:
                    new Consultar().ejecutar(banco);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
        sc.close();
    }
}

