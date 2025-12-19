package FormasDePagamento;

public class CartaoDeCredito implements Pagavel{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Validando limite...");
        System.out.println("Compra de R$ " +valor+ " aprovada no crédito!");
    }
}
