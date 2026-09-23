package Polimorfismo.ExercicioPersonagens;

public class Guerreiro extends Personagem {

    public Guerreiro (String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println("O guerreiro ataca com uma espada.");
    }

    @Override
    public void atacar(int dano) {
        super.atacar(dano);
    }
}
