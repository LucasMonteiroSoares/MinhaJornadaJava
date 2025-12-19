package EstoqueLoja;

public class ItemPedido {
    private Produto p;
    private int quantidade;

    public ItemPedido(Produto p, int quantidade) {
        this.p = p;
        this.quantidade = quantidade;
    }

    public Produto getP() {
        return p;
    }

    public void setP(Produto p) {
        this.p = p;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularSubtotal(){
        return (p.getPreco()*quantidade);
    }

    @Override
    public String toString() {
        return "ItemPedido{" +
                "p=" + p +
                ", quantidade=" + quantidade +
                '}';
    }
}
