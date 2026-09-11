package ClassesEObjetos.ExercicioBiblioteca;

public class Livro {

    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor, boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar(){
        if (disponivel) {
            disponivel = false;
        }
        else {
            System.out.println("Livro indisponivel!");
        }
    }

    public void devolver(){
        if (disponivel == false) {
            disponivel = true;
        }
        else {
            System.out.println("O livro já está disponivel!");
        }
    }
}
