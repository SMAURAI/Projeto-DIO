public class Banco {
    public String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        Cliente samuel = new Cliente();
        samuel.setNome("Samuel");
        Conta cc = new ContaCorrente(samuel); //pode ser declarado como "IConta cc" ou "ContaCorrente cc", isso é polimorfismo
        cc.depositar(100);
        Conta poupanca = new ContaPoupanca(samuel);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}