package level1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Undo undo = Undo.getInstance();
        Scanner sc = new Scanner(System.in);
        String opcion;
        do {
            System.out.println("1. Añadir pedido\n2. Eliminar último pedido\n3. Listar pedidos\n0. Salir");
            opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    System.out.print("Introduce pedido: ");
                    undo.addPedido(sc.nextLine());
                    break;
                case "2":
                    undo.removePedido();
                    break;
                case "3":
                    undo.listarPedidos();
                    break;
            }
        } while (!opcion.equals("0"));
    }
}
