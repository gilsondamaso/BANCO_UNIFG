import classes.Conta;
import classes.ContaEmpresa;
import classes.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //UPCASTING - CONVERTER SUBCLASSE(FILHA) PARA SUPERCLASSE(PAI)
        ContaPoupanca accPou = new ContaPoupanca(1212, "THIAGO", 3000.0, 0.007);
        ContaEmpresa accEmpr = new ContaEmpresa(1234, "GILSON", 1220, 300.00);
        Conta acc1 = new Conta(4321, "GILSON2", 2000);

        //UPCASTING - CONVERTE SUPERCLASSE PARA A SUBCLASSE
        Conta acc2 = new ContaEmpresa(3434, "PEDRO LTDA", 7000, 10000);
        Conta acc3 = new ContaPoupanca(3434, "PEDRO LTDA", 7000, 0.006);

        Conta accConta3 = new Conta(1003, "MAURO", 10000);
        //accPoupanca1 = accConta3;
        if(acc3 instanceof ContaEmpresa){
            ContaEmpresa acc5 = (ContaEmpresa) acc3;
            acc5.Emprestimo(200);
            System.out.println("Valor Emprestado");            
        }

        if (acc3 instanceof ContaPoupanca) {
            ContaPoupanca acc6 = (ContaPoupanca) acc3;
            acc6.AtualizaSaldo();
            System.out.println("Saldo Atualizado.");                        
        }
    }
}
