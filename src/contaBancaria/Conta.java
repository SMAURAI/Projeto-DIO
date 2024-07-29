package contaBancaria;

public class Conta {
    double saldo = 10.0;

    public void sacar(Double valor){
        double novoSaldo = saldo - valor;
        System.out.println(novoSaldo);
    }

    public void imprimirSaldo(){
        System.out.println(saldo);
       
    }
}
