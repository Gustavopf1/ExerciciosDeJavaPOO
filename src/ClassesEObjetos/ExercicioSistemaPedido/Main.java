package ClassesEObjetos.ExercicioSistemaPedido;

public class Main {
    void main(){

        Produto produto1 = new Produto("Teclado", 150, 10);
        Produto produto2 = new Produto("Mouse", 100, 5);

        ItemPedido item1 = new ItemPedido(produto1, 2);
        ItemPedido item2 = new ItemPedido(produto2, 3);

        ItemPedido[] itens = {item1, item2};

        Pedido pedido1 = new Pedido(itens);
        pedido1.mostrarPedido();
        pedido1.finalizarPedido();

        System.out.println(produto1.getEstoque());
        System.out.println(produto2.getEstoque());

        ItemPedido item3 = new ItemPedido(produto2, 5);
        ItemPedido[] itens2 = {item3};

        Pedido pedido2 = new Pedido(itens2);
        pedido2.finalizarPedido();

        System.out.println(produto2.getEstoque());
    }
}
