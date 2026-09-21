package Abstracao.ExercicioSistemaDePagamento;

public class Main {
    void main() {
        Pix pix = new Pix(500);
        Cartao cartao = new Cartao(800);

        pix.realizarPagamento();
        cartao.realizarPagamento();
    }
}
