package ComandosDeRepeticao;

//5. Escreva um programa que peça ao usuário um número inteiro
//positivo. Caso seja digitado 0 ou um número negativo, solicite novamente.
//O programa só deve terminar quando o usuário informar um número positivo.

import java.util.Scanner;

public class Exercicio05 {

    void  main(){
        Scanner sc = new Scanner(System.in);

        int numero;
        do {
            IO.print("Informe um número inteiro positivo: ");
            numero = sc.nextInt();
        }
        while (numero <= 0);
    }
}
