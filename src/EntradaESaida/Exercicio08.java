package EntradaESaida;

//8. Escreva um programa que leia o valor de uma temperatura
//em Celsius e calcule o seu valor correspondente em Fahrenheit e em Kelvin.

import java.util.Scanner;

public class Exercicio08 {

    void main(){
        Scanner sc = new Scanner(System.in);

        IO.println("Informe o valor da temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        IO.println("O valor em de Celsius para Fahrenheit é " + fahrenheit + " e o valor para Kelvin é " + kelvin);
    }
}
