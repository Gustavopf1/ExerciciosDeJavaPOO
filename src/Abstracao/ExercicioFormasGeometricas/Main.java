package Abstracao.ExercicioFormasGeometricas;

public class Main {
    void main(){

        Retangulo retangulo = new Retangulo(10, 5);
        Circulo circulo = new Circulo(5);

        System.out.println(retangulo.calcularArea());
        System.out.println(circulo.calcularArea());
    }
}
