package Heranca.ExercicioContaBancaria;

public class ContaCorrente extends ContaBancaria {

    private float limiteChequeEspecial;

    public ContaCorrente(String titular, int numero, float saldo, float limiteChequeEspecial) {
        super(titular, numero, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public float getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    @Override
    public void sacar(float valor) {
        if (valor <= saldo + limiteChequeEspecial) {
            saldo = saldo - valor;
        } else {
            System.out.println("Limite insuficiente!");
        }
    }
}
