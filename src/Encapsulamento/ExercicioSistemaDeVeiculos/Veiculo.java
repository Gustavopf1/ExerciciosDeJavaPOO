package Encapsulamento.ExercicioSistemaDeVeiculos;

public class Veiculo {

    protected String marca;
    protected String modelo;
    protected float velocidade;
    
    public Veiculo (String marca, String modelo, float velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }
    
    public void acelerar () {
        velocidade = velocidade + 10;
    }
    
    public void frear () {
        if (velocidade >= 10){
            velocidade = velocidade - 10;
        }
        else {
            System.out.println("O carro já está parado!");
        }
    }
    
    public void mostrarInformacoes () {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade: " + velocidade);
    }
}
