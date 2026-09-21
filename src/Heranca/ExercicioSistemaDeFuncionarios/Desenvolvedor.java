package Heranca.ExercicioSistemaDeFuncionarios;

public class Desenvolvedor extends Funcionario {

    private String linguagem;

    public Desenvolvedor (String nome, float salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Linguagem: " + linguagem);
    }
}
