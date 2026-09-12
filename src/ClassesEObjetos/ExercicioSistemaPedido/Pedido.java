package ClassesEObjetos.ExercicioSistemaPedido;

public class Pedido {

    private ItemPedido[] itens;

    public Pedido(ItemPedido[] itens) {
        this.itens = itens;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }

    public float calcularTotal() {
        float total = 0;

        for (int i = 0; i < itens.length; i++) {
            total = total + itens[i].calcularSubtotal();
        }
        return total;
    }

    public void mostrarPedido() {
        for (int i = 0; i < itens.length; i++) {
            System.out.println(itens[i].getProduto().getNome() + " - Quantidade: " + itens[i].getQuantidade() + " - Subtotal: R$ " + itens[i].calcularSubtotal());
        }

        System.out.println("Total: R$ " + calcularTotal());
    }

    public void finalizarPedido() {
        boolean estoqueSuficiente = true;

        for (int i = 0; i < itens.length; i++) {
            if (!itens[i].getProduto().temEstoque(itens[i].getQuantidade())) {
                estoqueSuficiente = false;
            }
        }

        if (estoqueSuficiente) {
            for (int i = 0; i < itens.length; i++) {
                itens[i].getProduto().diminuirEstoque(itens[i].getQuantidade());
            }
            System.out.println("Pedido finalizado!");
        }
        else {
            System.out.println("Estoque insuficiente!");
        }
    }
}
