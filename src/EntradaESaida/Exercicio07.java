package EntradaESaida;

//7. Escreva um programa que leia o valor da base
//e da altura de um triângulo e calcule a sua área.

import java.util.Scanner;

public class Exercicio07 {

    void main(){
        Scanner sc = new Scanner(System.in);

        IO.println("Informe o valor da base do triangulo: ");
        double base = sc.nextDouble();

        IO.println("Informe o valor da altura do triangulo: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;
        IO.println("O valor da área do triangulo é " + area);

    }
}
