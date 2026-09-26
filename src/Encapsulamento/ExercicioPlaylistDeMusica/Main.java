package Encapsulamento.ExercicioPlaylistDeMusica;

public class Main {

    public static void main(String[] args) {

        Playlist playlist = new Playlist("Minhas músicas");

        playlist.adicionarMusica();
        playlist.adicionarMusica();
        playlist.adicionarMusica();

        playlist.tocarMusica("Poesia Acústica");

        playlist.removerMusica();

        System.out.println("Nome: " + playlist.getNome());
        System.out.println("Música atual: " + playlist.getMusicaAtual());
        System.out.println("Quantidade de músicas: " + playlist.getQuantidadeMusicas());
    }
}
