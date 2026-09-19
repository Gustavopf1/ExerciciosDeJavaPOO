package Heranca.ExercicioContaBancaria;

public class ContaBancaria {

    protected  String titular;
    protected int numeroDaConta;
    protected float saldo;

    public ContaBancaria(String titular, int numeroDaConta, float saldo) {
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void depositar(float valor) {
        saldo = saldo + valor;
    }

    public void sacar(float valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
        }
        else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
