package Abstracao.ExercicioVeiculos;

public class Bicicleta extends Veiculo {

    public Bicicleta (String marca) {
        super(marca);
    }

    @Override
    public void mover() {
        System.out.println("A bicicleta está pedalando.");
    }
}
