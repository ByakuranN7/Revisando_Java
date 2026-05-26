import java.util.ArrayList;

interface PedidoRestaurante {

    void adicionarItem(String item, double preco);

    double calcularTotal();
}

class Pedido implements PedidoRestaurante {

    ArrayList<String> itens = new ArrayList<>();

    ArrayList<Double> precos = new ArrayList<>();

    @Override
    public void adicionarItem(String item, double preco) {

        itens.add(item);

        precos.add(preco);
    }

    @Override
    public double calcularTotal() {

        double total = 0;

        for(double preco : precos) {
            total += preco;
        }

        return total;
    }
}

public class ExercicioInterface {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        pedido.adicionarItem("Hambúrguer", 25.0);
        pedido.adicionarItem("Batata Frita", 15.0);
        pedido.adicionarItem("Refrigerante", 8.0);

        System.out.println(
            "Valor total: R$ " + pedido.calcularTotal()
        );
    }
}