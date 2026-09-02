package EntradaESaida;

//10. Escreva um programa que leia o valor dos dois catetos
//de um triângulo retângulo e calcule o valor da hipotenusa.

import java.util.Scanner;

public class Exercicio10 {

    void main(){
        Scanner sc = new Scanner(System.in);

        IO.println("Informe o valor do cateto 1: ");
        double cateto1 = sc.nextDouble();
        IO.println("Informe o valor do cateto 2: ");
        double cateto2 = sc.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        IO.println("O valor da hipotenusa é " + hipotenusa);
    }
}
