package ClassesEObjetos.ExercicioAluno;

public class Main {
    void main(){
        Aluno aluno = new Aluno("Gustavo", 2026001, 70);

        System.out.println(aluno.getAluno());
        System.out.println(aluno.getMatricula());
        System.out.println(aluno.getNota());

        System.out.println(aluno.estaAprovado());

        aluno.setNota(50);
        System.out.println(aluno.estaAprovado());

        aluno.setNota(105);
        System.out.println(aluno.getNota());
    }
}
