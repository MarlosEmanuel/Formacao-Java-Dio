public class Main {
    public static void main(String[] args) {
        Cliente marlos = new Cliente();
        marlos.setNome("Marlos");

        Conta cc = new ContaCorrente(marlos);
        Conta poupanca = new ContaPoupanca(marlos);

        cc.depositar(100);
        cc.transferir(poupanca,10);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
