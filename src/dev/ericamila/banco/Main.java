package dev.ericamila.banco;

public class Main {
    public static void main(String[] args) {

        Cliente erica = new Cliente();
        erica.setNome("Erica");

        Conta cc = new ContaCorrente(erica);
        Conta poupanca = new ContaPoupanca(erica);

        cc.depositar(500);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        Cliente camila = new Cliente();
        camila.setNome("Camila");

        Conta cp = new ContaPoupanca(camila);

        cc.transferir(50, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();





    }
}