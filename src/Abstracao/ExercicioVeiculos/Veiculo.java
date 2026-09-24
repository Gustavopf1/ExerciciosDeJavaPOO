package Abstracao.ExercicioVeiculos;

public abstract class Veiculo {

    private String marca;

    public Veiculo (String marca) {
        this.marca = marca;
    }

    public void mostrarMarca() {
        System.out.println("Marca: " + marca);
    }

    public abstract void mover();
}
