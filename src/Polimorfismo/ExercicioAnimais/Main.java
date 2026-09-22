package Polimorfismo.ExercicioAnimais;

public class Main {
    void main(){
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        cachorro.emitirSom();
        gato.emitirSom();

        cachorro.emitirSom(3);
    }
}
