package DesviosCondicionais;

//1. Escreva um programa que leia um número inteiro
//e verifique se ele é par ou ímpar.

import java.util.Scanner;

public class Exercicio01 {

    void main(){
        Scanner sc = new Scanner(System.in);

        IO.print("Informe um numero inteiro: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            IO.print("O numero " + numero + " é par");
        }
        else {
            IO.print("O numero " + numero + " é impar");
        }
    }
}
