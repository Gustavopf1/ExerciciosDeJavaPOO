package ClassesEObjetos.ExercicioProduto;

public class Main {
    void main() {
        Produto produto = new Produto("Teclado", 150.0f, 4);

        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());
        System.out.println(produto.getQuantidade());

        System.out.println(produto.calcularValorEstoque());

        produto.setPreco(170.0f);
        System.out.println(produto.getPreco());

        System.out.println(produto.calcularValorEstoque());
    }
}
