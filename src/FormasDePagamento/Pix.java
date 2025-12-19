package FormasDePagamento;

public class Pix implements Pagavel{
    @Override
    public void processarPagamento(double valor){
        System.out.println("Gerando QR code de R$ " + valor);
    }
}
