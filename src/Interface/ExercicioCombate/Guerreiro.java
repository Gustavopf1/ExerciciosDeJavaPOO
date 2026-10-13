package Interface.ExercicioCombate;

public class Guerreiro implements Combatente {

    private String nome;

    public Guerreiro(String nome) {
        this.nome = nome;
    }

    @Override
    public void atacar() {
        System.out.println(nome + " atacou com uma espada.");
    }

    @Override
    public String getNome() {
        return nome;
    }
}
