package VetoresMatrizes;

//Escreva um programa que leia dez números inteiros e, após finalizar a leitura, leia um
//número inteiro N (entre 1 e 10) e imprima qual foi o enésimo número digitado pelo
//usuário.

import java.util.Scanner;

public class Exercicio03 {
    void main(){
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            IO.print("Informe um número inteiro: ");
            numeros[i] = sc.nextInt();
        }

        IO.print("Informe um número inteiro entre 1 e 10: ");
        int n = sc.nextInt();

        IO.print("O enésimo número informado foi: " + numeros[n - 1]);
    }
}
