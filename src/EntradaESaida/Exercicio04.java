package EntradaESaida;
import java.util.Scanner;

//4. Escreva um programa que leia o número inteiro positivo e calcule
//o seu dobro, o seu triplo, o seu quadrado, o seu cubo e a sua raiz quadrada.

public class Exercicio04 {

    void main(){
        Scanner sc = new Scanner(System.in);

        IO.println("Informe um numero inteiro positivo: ");
        int numero = sc.nextInt();

        int dobro = numero * 2;
        int triplo = numero * 3;
        double quadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);
        double raiz = Math.sqrt(numero);

        IO.println("O dobro do numero é " + dobro + " o triplo é " + triplo + " o quadrado é " + quadrado + " o cubo é " + cubo + " e a raiz quadrada é " + raiz);
    }
}
