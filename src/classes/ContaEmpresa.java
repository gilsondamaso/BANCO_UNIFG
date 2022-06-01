package classes;

public final class ContaEmpresa extends Conta {
    private double limiteEmprestimo;

    public ContaEmpresa(){
        super();
    }   

    public ContaEmpresa(int numero, String titular, double saldo, double limiteEmprestimo) {
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void Emprestimo(double valor){
        if (valor <= limiteEmprestimo) {
            saldo += valor - 10.00;    
        }        
    }

    @Override
    public final void Saque (double valor){
        super.Saque(valor);
        saldo -= 2.0;
    }

    @Override
    public String toString() {
        return "ContaEmpresa [limiteEmprestimo=" + limiteEmprestimo + "]";
    }     
}
