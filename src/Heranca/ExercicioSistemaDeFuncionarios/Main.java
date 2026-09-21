package Heranca.ExercicioSistemaDeFuncionarios;

public class Main {
    void main() {
        Gerente gerente = new Gerente("Carlos", 5000, "Tecnologia");
        Desenvolvedor desenvolvedor = new Desenvolvedor("Gustavo", 3500, "Java");

        gerente.mostrarInformacoes();

        System.out.println();

        desenvolvedor.mostrarInformacoes();
    }
}
