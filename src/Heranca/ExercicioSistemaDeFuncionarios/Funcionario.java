package Heranca.ExercicioSistemaDeFuncionarios;

public class Funcionario {

    private String nome;
    private float salario;

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
    }
}
