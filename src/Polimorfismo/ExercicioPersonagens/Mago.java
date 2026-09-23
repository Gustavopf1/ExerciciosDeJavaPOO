package Polimorfismo.ExercicioPersonagens;

public class Mago extends Personagem {

    public Mago (String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println("O mago lança uma magia.");
    }

    @Override
    public void atacar(int dano) {
        super.atacar(dano);
    }
}
