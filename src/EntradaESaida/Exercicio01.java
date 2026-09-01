package EntradaESaida;
import java.util.Scanner;

//1. Escreva um programa que leia três números inteiros e calcule a sua média aritmética.

public class Exercicio01 {

    void main(){
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        for(int i = 0; i < 3; i++){
            IO.println("Informe um numero inteiro: ");
            int numero = sc.nextInt();
            soma = soma + numero;
        }

        float media = soma / 3.0f;

        IO.println("A media da soma dos numeros é: " + media);
    }
}

