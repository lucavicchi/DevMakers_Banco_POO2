package br.com.ada.poo2.banco.models.contas;

public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, int senha, double saldo, double taxaRendimento) {
        super(numero, senha, saldo, taxaRendimento);
    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

    }

    @Override
    public void checarSaldo() {

    }
}