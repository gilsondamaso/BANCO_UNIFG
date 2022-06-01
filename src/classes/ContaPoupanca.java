package classes;

public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(){
        super();
    }
    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }
    public double getTaxaJuros() {
        return taxaJuros;
    }
    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    
    public void AtualizaSaldo(){
            saldo += saldo * taxaJuros;
    }
    
    //Overryde é uma forma de garantir que você está sobrescrevendo um método e não criando um novo
    @Override
    public final void Saque(double valor){
        saldo -= valor;
    }
}
