package Fundamentos.VetoresMatrizes;

import java.util.Scanner;

public class Exercicio06 {
    void main(){
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[6];
        for (int i = 0; i < 6; i++) {
            IO.print("Informe um número inteiro: ");
            numeros[i] = sc.nextInt();
        }
        IO.print("Informe qual número voce deseja substituir: ");
        int numeroX = sc.nextInt();

        IO.print("Informe o novo valor: ");
        int numeroY = sc.nextInt();

        boolean encontrou = false;
        for (int j = 0; j < 6; j++) {
            if (numeros[j] == numeroX) {
                numeros[j] = numeroY;
                encontrou = true;
            }
        }
        if (encontrou == false) {
            IO.print("Número nao encontrado!");
        }

        for (int k = 0; k < 6; k++) {
            IO.println(numeros[k]);
        }
    }
}
