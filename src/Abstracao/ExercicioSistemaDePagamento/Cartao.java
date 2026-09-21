package Abstracao.ExercicioSistemaDePagamento;

public class Cartao extends Pagamento {

    public Cartao (double valor) {
        super(valor);
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento realizado via Cartao!");
    }
}
