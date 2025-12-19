package SistemaBancario;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    public void renderJuros(){
        double novoSaldo = getSaldo() + getSaldo()*0.05;
        setSaldo(novoSaldo);
        System.out.println("Seu novo saldo é de "+getSaldo()+" reais.");
    }

}
