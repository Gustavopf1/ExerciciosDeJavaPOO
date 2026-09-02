package DesviosCondicionais;

//5. Escreva um programa que leia um número inteiro
//e verifique se ele é positivo, negativo ou neutro.

import java.util.Scanner;

public class Exercicio05 {

    void main(){
        Scanner sc = new Scanner(System.in);

        IO.print("Informe um número inteiro: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            IO.print("O número "+ numero +" é positivo");
        }
        else if (numero < 0) {
            IO.print("O número "+ numero +" é negativo");
        }
        else {
            IO.print("O número "+ numero +" é neutro");
        }
    }
}
