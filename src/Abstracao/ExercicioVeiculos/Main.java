package Abstracao.ExercicioVeiculos;

public class Main {
    void main(){

        Veiculo carro = new Carro("Chevrolet");
        Veiculo bicicleta = new Bicicleta("Monarc");

        carro.mostrarMarca();
        carro.mover();

        bicicleta.mostrarMarca();
        bicicleta.mover();
    }
}
