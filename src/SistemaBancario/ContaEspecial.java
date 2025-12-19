package SistemaBancario;

public class ContaEspecial extends ContaBancaria{

    private double limite;

    public ContaEspecial(String numeroConta, String titular, double saldo, double limite){
        super(numeroConta,titular,saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor){
        if (valor<=limite && getSaldo()>=0){
            double novoSaldo = getSaldo() - valor;
            setSaldo(novoSaldo);
            System.out.println("Você sacou "+valor+" reais.");
        } else{
            System.out.println("Esse saque não pode ser feito pois ultrapassa seu limite ou você já está negativo!");
        }
    }

    @Override
    public String toString(){
        return super.toString() + " | Limite: " + this.limite;
    }
}
