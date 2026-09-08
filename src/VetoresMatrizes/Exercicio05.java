package VetoresMatrizes;

//5. Escreva um programa que leia uma matriz quadrada de ordem 5
//de números reais e calcule o valor da soma dos elementos de cada uma de suas linhas.

import java.util.Scanner;

public class Exercicio05 {
    void main(){
        Scanner sc = new Scanner(System.in);

        double[][] matriz = new double[5][5];
        for (int i = 0; i < 5; i++) {
            double soma = 0;
            for (int j = 0; j < 5; j++) {
                IO.print("Informe um número real: ");
                matriz[i][j] = sc.nextDouble();
                soma = soma + matriz[i][j];
            }
            IO.println("A soma da linha é: " + soma);
        }
    }
}
