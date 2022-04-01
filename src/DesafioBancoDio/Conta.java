package DesafioBancoDio;

public abstract class Conta implements IContas {

    private static final int CONTA_PADRAO = 0774;
    private static int SEQUENCIAL = 17537-6;

    protected int agencia;
    protected int numero;
    protected double saldo;


    public Conta() {
        this.agencia = Conta.CONTA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public void sacar() {

    }

    public void depositar() {

    }

    public void transferir() {

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    protected void ImprimirInfosComuns() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
