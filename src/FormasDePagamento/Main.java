package FormasDePagamento;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pagavel pagamentoAtual;

        System.out.println("1. Para pagamento no PIX\n 2. Para pagamento no cartão de crédito");
        int opcao = sc.nextInt();
        sc.nextLine();

        if(opcao==1){
            pagamentoAtual = new Pix();
            pagamentoAtual.processarPagamento(100);
        } else if(opcao==2){
            pagamentoAtual = new CartaoDeCredito();
            pagamentoAtual.processarPagamento(100);
        } else {
            System.out.println("Opção inválida!");
        }
    }
}