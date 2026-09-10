package ClassesEObjetos.ExercicioContaBancaria;

public class ContaBancaria {

    private String titular;
    private int numeroDaConta;
    private float saldo;

    public ContaBancaria(String titular, int numeroDaConta, float saldo) {
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }
    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float valor) {
        saldo = saldo + valor;
    }

    public void sacar(float valor) {

        if (valor <= saldo){
            saldo = saldo - valor;
        }
        else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
