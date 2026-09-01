package EntradaESaida;

//3. Escreva um programa que leia o valor do lado
//de um quadrado e calcule a sua área e o seu perímetro.

import java.util.Scanner;

public class Exercicio03 {

    void main(){
        Scanner sc = new Scanner(System.in);

        IO.println("Informe o valor do lado do quadrado: ");
        int lado = sc.nextInt();

        int area = lado * lado;
        int perimetro = 4 * lado;

        IO.println("O valor da area do quadrado é " + area + " e o valor do perimetro é " + perimetro);
    }
}
