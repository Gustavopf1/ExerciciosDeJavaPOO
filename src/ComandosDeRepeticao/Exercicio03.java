package ComandosDeRepeticao;

//3. Escreva um programa que leia números inteiros
//enquanto o usuário não digitar 0. Ao final, mostre
//a soma de todos os números digitados. O 0 serve
//apenas para encerrar e não deve alterar a soma.

import java.util.Scanner;

public class Exercicio03 {

    void main(){
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        IO.print("Informe um número inteiro: ");
        int numero = sc.nextInt();

        while (numero != 0) {
            soma = soma + numero;

            IO.print("Informe um número inteiro: ");
            numero = sc.nextInt();
        }
        IO.print("A soma dos números é "+ soma);
    }
}
