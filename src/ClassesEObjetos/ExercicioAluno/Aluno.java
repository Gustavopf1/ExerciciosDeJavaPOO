package ClassesEObjetos.ExercicioAluno;

public class Aluno {

    private String aluno;
    private int matricula;
    private float nota;

    public Aluno(String aluno, int matricula, float nota) {
        this.aluno = aluno;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getNota() {
        return nota;
    }
    public void setNota(float nota) {
        if (nota < 0 || nota > 100) {
            System.out.println("Nota invalida, informe uma nota entre 0 e 100");
        }
        else {
            this.nota = nota;
        }
    }

    public boolean estaAprovado() {
        if (nota >= 70) {
            return true;
        }
        else {
            return false;
        }
    }
}
