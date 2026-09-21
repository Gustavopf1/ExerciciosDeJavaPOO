package Abstracao.ExercicioSistemaDePagamento;

public abstract class Pagamento {

    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public abstract void realizarPagamento();
}
