package EstoqueLoja;

import java.util.ArrayList;

public class Pedido {

    private ArrayList<ItemPedido> listaItens;

    public Pedido(ArrayList<ItemPedido> listaItens) {
        this.listaItens = listaItens;
    }

    public ArrayList<ItemPedido> getListaItens() {
        return listaItens;
    }

    public void adicionarItens(Produto p, int quantidade){
        ItemPedido item = new ItemPedido(p, quantidade);
        listaItens.add(item);
    }

    public double calcularTotalPedido(){
        double totalPedido = 0;
        for (ItemPedido item : listaItens) {
            totalPedido += item.calcularSubtotal();
        }
        return totalPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "listaItens=" + listaItens +
                '}';
    }
}
