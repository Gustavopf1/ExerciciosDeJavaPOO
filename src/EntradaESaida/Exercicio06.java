package EntradaESaida;

import java.util.Scanner;

//6. Escreva um programa que leia um número inteiro e informe
//o seu antecessor e o seu sucessor.
public class Exercicio06 {

    void main(){
        Scanner sc = new Scanner(System.in);

        IO.println("Informe um número inteiro: ");
        int numero = sc.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        IO.println("O antecessor do numero é " + antecessor + " e o sucessor é " + sucessor);
    }
}
