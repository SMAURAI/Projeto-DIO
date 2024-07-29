public abstract class Conta implements InterfaceConta{
        // Uma classe pode ser transformada em abstrata (abstract) para que nenhuma outra classe instancie ela em seu interior
        //Quando uma variável é definida na abstrata, para que seja acessada na classe herdeira ela precisa ser protegida

        //variáveis
        private static int AGENCIA_PADRAO = 1;
        private static int SEQUENCIAL = 1;

        protected int agencia;
        protected int conta;
        protected double saldo;
        protected Cliente cliente;
    
        //Construtor da conta
        public Conta(Cliente cliente) {
            this.agencia = Conta.AGENCIA_PADRAO;
            this.conta = Conta.SEQUENCIAL++;
            this.cliente = cliente;
        }

        //Getters
        public int getAgencia() {
            return agencia;
        }
        public int getConta() {
            return conta;
        }
        public double getSaldo() {
            return saldo;
        }
        
        public void sacar(double valor) {
            this.saldo -= valor;
        }
        
        public void depositar(double valor) {
            this.saldo += valor;
        }
        
        public void transferir(double valor, Conta contaDestino) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } 

        protected void imprimirInfoscomuns(){
            System.out.printf("Agencia: %d", this.agencia);
            System.out.printf("Conta: %d", this.conta);
            System.out.printf("Cliente: %s", this.cliente.getNome());
            System.out.printf("Saldo: %.2f", this.saldo);
        }
}
