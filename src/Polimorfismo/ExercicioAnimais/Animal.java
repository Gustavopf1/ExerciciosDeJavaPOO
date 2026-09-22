package Polimorfismo.ExercicioAnimais;

public class Animal {

    public void emitirSom() {
        System.out.println("O animal está emitindo um som");
    }

    public void emitirSom(int vezes) {
        for (int i = 0; i < vezes; i++) {
            System.out.println("O animal está emitindo um som");
        }
    }
}
