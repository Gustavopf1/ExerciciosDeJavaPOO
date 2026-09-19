package Heranca.ExercicioContaBancaria;

public class Main {
    public static void main(String[] args) {

        ContaPoupanca poupanca = new ContaPoupanca("Gustavo", 1, 1000, 0.5f);
        System.out.println("--- Conta Poupança ---");
        System.out.println("Titular: " + poupanca.getTitular());
        System.out.println("Saldo inicial: " + poupanca.getSaldo());

        poupanca.depositar(500);
        System.out.println("Saldo após depósito de 500: " + poupanca.getSaldo());

        poupanca.renderJuros();
        System.out.println("Saldo após render juros (0.5%): " + poupanca.getSaldo());

        poupanca.sacar(2000);
        System.out.println("Saldo após tentar sacar 2000: " + poupanca.getSaldo());

        ContaCorrente corrente = new ContaCorrente("Ana", 2, 200, 300);
        System.out.println("\n--- Conta Corrente ---");
        System.out.println("Titular: " + corrente.getTitular());
        System.out.println("Saldo inicial: " + corrente.getSaldo());

        corrente.sacar(400);
        System.out.println("Saldo após sacar 400: " + corrente.getSaldo());

        corrente.sacar(200);
        System.out.println("Saldo após tentar sacar 200 além do limite: " + corrente.getSaldo());

        corrente.depositar(100);
        System.out.println("Saldo após depositar 100: " + corrente.getSaldo());
    }
}
