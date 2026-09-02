package ComandosDeRepeticao;

//2. Escreva um programa que leia 10 números inteiros
//e informe, ao final, quantos são pares e quantos são ímpares.

import java.util.Scanner;

public class Exercicio02 {

    void main(){
        Scanner sc = new Scanner(System.in);

        int contadorPares = 0;
        int contadorImpares = 0;
        for (int i = 0; i < 10; i++) {
            IO.print("Informe um número inteiro: ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                contadorPares++;
            }
            else {
                contadorImpares++;
            }
        }
        IO.print("Voce informou "+ contadorPares +" numeros pares e "+ contadorImpares +" números impares");
    }
}
