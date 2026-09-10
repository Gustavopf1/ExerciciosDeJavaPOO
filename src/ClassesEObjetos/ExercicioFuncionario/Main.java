package ClassesEObjetos.ExercicioFuncionario;

public class Main {
    void main(){
        Funcionario funcionario = new Funcionario("Gustavo", 7000, "Programador");

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getSalario());
        System.out.println(funcionario.getCargo());

        funcionario.aumentarSalario(10);
        System.out.println(funcionario.getSalario());

        System.out.println(funcionario.calcularSalarioAnual());

        funcionario.aumentarSalario(-5);
    }
}
