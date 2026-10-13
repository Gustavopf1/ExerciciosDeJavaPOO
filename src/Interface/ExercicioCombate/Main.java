package Interface.ExercicioCombate;

public class Main {
    public static void main(String[] args){
        Guerreiro guerreiro = new Guerreiro("Gustavo");

        guerreiro.atacar();
        System.out.println(guerreiro.getNome());
    }
}
