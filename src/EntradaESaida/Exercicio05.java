package EntradaESaida;

//5. Escreva um programa que leia o valor do raio de uma circunferência
// e calcule a sua área e o seu comprimento.

import java.util.Scanner;

public class Exercicio05 {

    void main(){
        Scanner sc = new Scanner(System.in);

        IO.println("Informe o valor do raio de uma circunferencia: ");
        double raio = sc.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        double comprimento = 2 * Math.PI * raio;

        IO.println("O valor da area é %.2f e o valor do comprimento é %.2f".formatted(area,comprimento));
    }
}
