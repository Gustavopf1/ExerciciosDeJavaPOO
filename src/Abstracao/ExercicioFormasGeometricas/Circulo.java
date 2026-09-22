package Abstracao.ExercicioFormasGeometricas;

public class Circulo extends Forma {

    private double raio;

    public Circulo (double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }
}
