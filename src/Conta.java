public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 001; 
    protected static int SEQUENCIAL = 1;

    private int agencia;
    private int conta;  
    private Double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
        this.saldo = 0.00;
        
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Agencia: %d" , this.agencia));
        System.out.println(String.format("Conta: %d" , this.conta));
        System.out.println(String.format("Titular: %s" , this.cliente.getNome()));
        System.out.println(String.format("Saldo: R$%.2f" , this.saldo));
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    } 

}
