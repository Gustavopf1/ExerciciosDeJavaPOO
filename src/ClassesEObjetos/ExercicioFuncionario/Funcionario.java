package ClassesEObjetos.ExercicioFuncionario;

public class Funcionario {

    private String nome;
    private float salario;
    private String cargo;

    public Funcionario(String nome, float salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void aumentarSalario(float percentual) {
        if (percentual > 0) {
            float aumento = (salario * percentual) / 100;
            salario = salario + aumento;
        }
        else {
            System.out.println("Percentual inválido!");
        }
    }

    public float calcularSalarioAnual() {
        return salario * 12;
    }
}
