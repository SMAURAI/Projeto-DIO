public interface InterfaceConta {
    //Métodos
    //Criar uma interface é equivalente a definir contratos
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
