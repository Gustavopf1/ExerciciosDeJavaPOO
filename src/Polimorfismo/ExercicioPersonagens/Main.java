package Polimorfismo.ExercicioPersonagens;

public class Main {
    void main(){

        Personagem personagem1 = new Guerreiro("Arthur");
        Personagem personagem2 = new Mago("Merlin");

        personagem1.atacar();
        personagem1.atacar(50);

        personagem2.atacar();
        personagem2.atacar(30);
    }
}
