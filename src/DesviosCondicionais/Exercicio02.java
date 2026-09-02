package DesviosCondicionais;

//2. Escreva um programa que leia dois números e determine
//se o segundo número é menor, igual ou maior que o primeiro.

import java.util.Scanner;

public class Exercicio02 {

    void main(){
        Scanner sc = new Scanner(System.in);

        IO.print("Informe um numero inteiro: ");
        int numero1 = sc.nextInt();

        IO.print("Informe um numero inteiro: ");
        int numero2 = sc.nextInt();

        if (numero2 > numero1) {
            IO.println("O numero "+ numero2 +" é maior que o numero "+ numero1);
        }
        else if (numero2 < numero1) {
            IO.println("O numero "+ numero2 +" é menor que o numero "+ numero1);
        }
        else {
            IO.println("O numero "+ numero2 +" é igual ao numero "+ numero1);
        }
    }
}
