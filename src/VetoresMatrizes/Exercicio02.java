package VetoresMatrizes;

//Escreva um programa que leia dez números inteiros e os armazene em um vetor. Em seguida, o programa deve:
//Imprimir os números na ordem inversa à que foram digitados;
//Calcular e imprimir a soma de todos os números pares presentes no vetor;
//Calcular e imprimir a média de todos os números lidos.

import java.util.Scanner;

public class Exercicio02 {
    void main(){
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++){
            IO.print("Informe um número inteiro: ");
            numeros[i] = sc.nextInt();
        }

        IO.print("Números em ordem inversa: ");
        for (int i = 9; i >= 0; i--){
            IO.print(numeros[i] + " ");
        }
        IO.println("");

        int somaPares = 0;
        for (int i = 0; i < 10; i++){
            if (numeros[i] % 2 == 0){
                somaPares += numeros[i];
            }
        }
        IO.println("Soma dos números pares: " + somaPares);

        int somaTotal = 0;
        for (int i = 0; i < 10; i++){
            somaTotal += numeros[i];
        }
        double media = (double) somaTotal / 10;
        IO.println("Média dos números: " + media);
    }
}
