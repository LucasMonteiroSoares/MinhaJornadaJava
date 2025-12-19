package EstoqueLoja;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean rodar = true;
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        ArrayList<ItemPedido> listaItens = new ArrayList<>();
        Pedido pedido = new Pedido(listaItens);

        do{
            System.out.println("""
                    1. Adicionar produto\s
                     2. Listar produtos\s
                     3. Adicionar item ao pedido\s
                    4. Visualizar pedido\s
                     5. Encerrar programa""");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    adicionarProduto(produtos, sc);
                    break;
                case 2:
                    listarProdutos(produtos);
                    break;
                case 3:
                    boolean rodar2 = true;

                    do{
                        System.out.println("1. Para adicionar novo item \n 2. Para finalizar");
                        int opcao2 = sc.nextInt();
                        sc.nextLine();

                        if(opcao2 == 1){
                            pedido.getListaItens().add(adicionarAoPedido(produtos, sc));
                        } else{
                            rodar2 = false;
                        }
                    } while (rodar2);

                    break;
                case 4:
                    visualizarPedido(pedido);
                    System.out.println(pedido.toString());
                    break;
                case 5:
                    rodar = false;
                    System.out.println("Programa encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (rodar);

        sc.close();
    }

    public static void adicionarProduto(ArrayList<Produto> produtos, Scanner sc){
        System.out.println("Informe o nome do produto: ");
        String nome = sc.nextLine();
        System.out.println("Informe o preco do produto: ");
        double preco = sc.nextDouble();
        System.out.println("Informe a quantidade do produto: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        Produto produto = new Produto(nome, preco, quantidade);
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso");
    }

    public static void listarProdutos(ArrayList<Produto> produtos){
        for (Produto produto : produtos) {
            System.out.println(produto);
            System.out.println("Valor total em estoque: "+ produto.valorTotalEmEstoque());
        }
    }

    public static ItemPedido adicionarAoPedido(ArrayList<Produto> produtos, Scanner sc){
        int count = 0;
        System.out.println("Opções disponíveis");
        for (Produto p: produtos){
            System.out.println("Item "+ count +" " + p.toString());
            ++count;
        }

        System.out.println("Informe o número referente ao item que deseja: ");
        int opcao = sc.nextInt();
        sc.nextLine();
        System.out.println("Informe a quantidade que deseja: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        int novaQuantidade = produtos.get(opcao).getQuantidade()-quantidade;
        produtos.get(opcao).setQuantidade(novaQuantidade);

        return new ItemPedido(produtos.get(opcao), quantidade);
    }

    public static void visualizarPedido(Pedido pedido) {
        System.out.println("Valor total do seu pedido: " + pedido.calcularTotalPedido());
        for (ItemPedido item : pedido.getListaItens()) {
            System.out.println("Item: " + item.getP().getNome() + " Quantidade: " + item.getQuantidade());
        }
    }
}
