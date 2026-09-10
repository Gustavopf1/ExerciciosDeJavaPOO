package ClassesEObjetos.ExercicioContaBancaria;

public class Main {
    void main(){
        ContaBancaria contaBancaria = new ContaBancaria("Gustavo", 12, 1000);

        System.out.println(contaBancaria.getTitular());
        System.out.println(contaBancaria.getNumeroDaConta());
        System.out.println(contaBancaria.getSaldo());

        contaBancaria.depositar(2000);
        System.out.println(contaBancaria.getSaldo());

        contaBancaria.sacar(500);
        System.out.println(contaBancaria.getSaldo());

        contaBancaria.sacar(3000);
        System.out.println(contaBancaria.getSaldo());
    }
}
