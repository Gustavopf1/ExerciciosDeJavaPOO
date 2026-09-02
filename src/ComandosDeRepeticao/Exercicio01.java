package ComandosDeRepetição;

//1. Escreva um programa que leia 5 números inteiros
//e, ao final, mostre a soma de todos os números digitados.

import java.util.Scanner;

public class Exercicio01 {

    void main(){
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        for (int i = 0; i < 5; i++) {
            IO.print("Informe um número inteiro: ");
            int numero = sc.nextInt();

            soma = soma + numero;
        }
        IO.print("A soma de todos os números é: "+ soma);
    }
}
