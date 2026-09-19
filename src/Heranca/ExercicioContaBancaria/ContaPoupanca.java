package Heranca.ExercicioContaBancaria;

public class ContaPoupanca extends ContaBancaria {

    private float taxaRendimento;

    public ContaPoupanca(String titular, int numero, float saldo, float taxaRendimento) {
        super(titular, numero, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public float getTaxaRendimento() {
        return taxaRendimento;
    }

    public void renderJuros() {
        saldo = saldo + (saldo * taxaRendimento / 100);
    }
}
