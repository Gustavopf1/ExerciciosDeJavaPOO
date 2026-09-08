package VetoresMatrizes;

//4. Escreva um programa que leia uma matriz quadrada de ordem 4
//de números inteiros e imprima a matriz lida.

import java.util.Scanner;

public class Exercicio04 {
    void main() {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                IO.print("Informe um número inteiro: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                IO.print(matriz[i][j] + " ");
            }
            IO.println();
        }
    }
}
