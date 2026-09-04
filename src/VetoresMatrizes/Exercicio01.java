package VetoresMatrizes;

//1. Escreva um programa que leia dez números inteiros e, após finalizar
//a leitura, imprima todos os números lidos na mesma ordem em que eles foram digitados.

import java.util.Scanner;

public class Exercicio01 {

    void main(){
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++){
            IO.print("Informe um número inteiro: ");
            numeros[i] = sc.nextInt();
        }

        for (int k = 0; k < 10; k++){
            IO.println(numeros[k]);
        }
    }
}
