package ClassesEObjetos.ExercicioBiblioteca;

public class Biblioteca {

    private Livro livro1;
    private Livro livro2;

    public Biblioteca(Livro livro1, Livro livro2){
        this.livro1 = livro1;
        this.livro2 = livro2;
    }

    public Livro getLivro1() {
        return livro1;
    }

    public void setLivro1(Livro livro1) {
        this.livro1 = livro1;
    }

    public Livro getLivro2() {
        return livro2;
    }

    public void setLivro2(Livro livro2) {
        this.livro2 = livro2;
    }

    public void mostrarLivros(){
        System.out.println(livro1.getTitulo() + " - Disponivel: " + livro1.isDisponivel());
        System.out.println(livro2.getTitulo() + " - Disponivel: " + livro2.isDisponivel());
    }
}
