package Encapsulamento.ExercicioPlaylistDeMusica;

public class Playlist {

    private String nome;
    private String musicaAtual;
    private int quantidadeMusicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.quantidadeMusicas = 0;
        this.musicaAtual = "Nenhuma música tocando";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public String getMusicaAtual() {
        return musicaAtual;
    }

    public int getQuantidadeMusicas() {
        return quantidadeMusicas;
    }

    public void adicionarMusica() {
        quantidadeMusicas++;
    }

    public void removerMusica() {
        if (quantidadeMusicas > 0) {
            quantidadeMusicas--;
        }
    }

    public void tocarMusica(String musica) {
        if (!musica.isEmpty()) {
            musicaAtual = musica;
        }
    }
}
