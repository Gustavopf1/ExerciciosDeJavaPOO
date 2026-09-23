package Polimorfismo.ExercicioPersonagens;

public class Personagem {

    private String nome;

    public Personagem (String nome) {
        this.nome = nome;
    }

    public void atacar() {
        System.out.println("O personagem está atacando.");
    }

    public void atacar(int dano) {
        System.out.println(nome + " causou " + dano + " de dano.");
    }
}
