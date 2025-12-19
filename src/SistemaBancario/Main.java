package SistemaBancario;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean rodar = true;
        ArrayList<ContaBancaria> listaContas = new ArrayList<>();

        do{
            System.out.println("1. Criar uma ContaBancaria \n 2. Criar uma ContaPoupanca \n 3. Criar uma ContaEspecial");
            System.out.println("4. Visualizar todas as contas \n 5. Sacar \n 6. Depositar \n 7. Render Juros \n 8. Encerrar");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1, 2, 3:
                    criarConta(opcao, sc, listaContas);
                    break;
                case 4:
                    listarContas(listaContas);
                    break;
                case 5:
                    sacarDinheiro(listaContas, sc);
                    break;
                case 6:
                    depositarDinheiro(listaContas, sc);
                    break;
                case 7:
                    renderDinheiro(listaContas,sc);
                    break;
                case 8:
                    System.out.println("Programa encerrado.");
                    rodar = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(rodar);



        sc.close();
    }

    public static void criarConta(int opcao, Scanner sc, ArrayList<ContaBancaria> listaContas){
        System.out.println("Informe o numero da conta: ");
        String numeroConta = sc.nextLine();
        System.out.println("Informe o titular da conta: ");
        String titular = sc.nextLine();
        System.out.println("Informe o saldo da conta: ");
        double saldo = sc.nextDouble();
        sc.nextLine();

        switch(opcao){
            case 1:
                ContaBancaria contaBancaria = new ContaBancaria(numeroConta, titular, saldo);
                listaContas.add(contaBancaria);
                System.out.println("Conta bancária criada com sucessso!");
                break;
            case 2:
                ContaBancaria contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo);
                listaContas.add(contaPoupanca);
                System.out.println("Conta poupança criada com sucessso!");
                break;
            case 3:
                System.out.println("Informe o limite desta conta: ");
                double limite = sc.nextDouble();
                sc.nextLine();
                ContaBancaria contaEspecial = new ContaEspecial(numeroConta, titular, saldo, limite);
                listaContas.add(contaEspecial);
                System.out.println("Conta especial criada com sucessso!");
                break;
        }
    }

    public static void listarContas(ArrayList<ContaBancaria> listaContas){
        System.out.println("Lista de contas: ");
        for(ContaBancaria contaBancaria : listaContas){
            System.out.println(contaBancaria);
        }
    }

    public static void sacarDinheiro(ArrayList<ContaBancaria> listaContas, Scanner sc){
        System.out.println("Informe o numero da conta: ");
        String numeroConta = sc.nextLine();
        System.out.println("Informe o valor do saque: ");
        double valor = sc.nextDouble();
        sc.nextLine();

        for (ContaBancaria listaConta : listaContas) {
            if (listaConta.getNumeroConta().equals(numeroConta)) {
                listaConta.sacar(valor);
                return;
            }
        }
        System.out.println("Não foi possível encontrar uma conta com esse número");
    }

    public static void depositarDinheiro(ArrayList<ContaBancaria> listaContas, Scanner sc){
        System.out.println("Informe o numero da conta: ");
        String numeroConta = sc.nextLine();
        System.out.println("Informe o valor do deposito: ");
        double valor = sc.nextDouble();
        sc.nextLine();

        for (ContaBancaria listaConta : listaContas) {
            if (listaConta.getNumeroConta().equals(numeroConta)) {
                listaConta.depositar(valor);
                return;
            }
        }
        System.out.println("Não foi possível encontrar uma conta com esse número");
    }

    public static void renderDinheiro(ArrayList<ContaBancaria> listaContas, Scanner sc){
        System.out.println("Informe o numero da conta: ");
        String numeroConta = sc.nextLine();

        for (ContaBancaria listaConta : listaContas) {
            if (listaConta instanceof ContaPoupanca cp && listaConta.getNumeroConta().equals(numeroConta)) {
                cp.renderJuros();
                return;
            }
        }
        System.out.println("Não foi possível encontrar uma ContaPoupanca com esse número");
    }
}
