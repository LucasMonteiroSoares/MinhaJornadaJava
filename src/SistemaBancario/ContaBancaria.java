package SistemaBancario;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void depositar(double saldo){
        this.saldo += saldo;
        System.out.println("Seu novo saldo é: "+getSaldo());
    }

    public void sacar(double valor){
        if(valor<getSaldo()){
            this.saldo -= valor;
            System.out.println("Você fez um saque de " + valor + " reais.");
        } else {
            System.out.println("Não foi possível fazer esse saque, você ficará negativo.");
        }
    }

    @Override
    public String toString(){
        return "Numero conta: " + this.numeroConta + "| Titular: " + this.titular + "| Saldo: " + this.saldo;
    }
}
