public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Misael");
        Cliente cliente2 = new Cliente("Danilo");
        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente2);

        cc.depositar(100);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cc.transferir(50, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
