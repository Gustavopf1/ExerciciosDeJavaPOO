package EntradaESaida;

import java.util.Scanner;

//2. Escreva um programa que leia três números e seus respectivos pesos e calcule a sua média ponderada.

public class Exercicio02 {

    void main(){
        Scanner sc = new Scanner(System.in);

        float somaPeso = 0;
        float multiplicacao = 0;
        for(int i = 0; i < 3; i++){
            IO.println("Informe um número: ");
            float numero = sc.nextFloat();

            IO.println("Informe o peso: ");
            float peso = sc.nextFloat();
            somaPeso = somaPeso + peso;

            multiplicacao = multiplicacao + (numero * peso);
        }
        float mediaPonderada = multiplicacao / somaPeso;

        IO.println("A média ponderada é: " + mediaPonderada);

    }
}
