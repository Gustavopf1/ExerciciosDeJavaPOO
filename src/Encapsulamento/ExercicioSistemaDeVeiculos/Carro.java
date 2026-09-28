package Encapsulamento.ExercicioSistemaDeVeiculos;

public class Carro extends Veiculo {

    public Carro (String marca, String modelo, float velocidade) {
        super(marca, modelo, velocidade);
    }

    public void ligarTurbo () {
        velocidade = velocidade + 20;
    }
}
