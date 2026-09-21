package Heranca.ExercicioSistemaDeFuncionarios;

public class Gerente extends Funcionario {

    private String setor;

    public Gerente (String nome, float salario, String setor) {
        super(nome, salario);
        this.setor = setor;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Setor: " + setor);
    }
}
