package ClassesEObjetos.ExercicioBiblioteca;

public class Main {
    void main(){
        Livro livro1 = new Livro("Harry Potter", "Joanne Rowling", true);
        Livro livro2 = new Livro("O Senhor dos Anéis", "John Ronald Reuel Tolkien", true);

        Biblioteca biblioteca = new Biblioteca(livro1, livro2);

        biblioteca.mostrarLivros();

        livro1.emprestar();
        biblioteca.mostrarLivros();

        livro1.devolver();
        biblioteca.mostrarLivros();
    }
}
