package Encapsulamento.ExercicioSistemaDeVeiculos;

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", "Corolla", 0);

        carro.acelerar();
        carro.acelerar();

        carro.ligarTurbo();

        carro.frear();

        carro.mostrarInformacoes();
    }
}
