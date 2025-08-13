package level1;

import java.util.ArrayList;

import java.util.List;

public class Undo {
    private static Undo instance;
    private final List<String> pedidos = new ArrayList<>();

    private Undo() {
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addPedido(String pedido) {
        pedidos.add(pedido);
    }

    public void removePedido() {
        if (!pedidos.isEmpty()) {
            pedidos.remove(pedidos.size() - 1);
        }
    }

    public void listarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos.");
        } else {
            pedidos.forEach(System.out::println);
        }
    }
}
