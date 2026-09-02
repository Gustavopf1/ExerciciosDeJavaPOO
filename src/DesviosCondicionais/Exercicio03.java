package DesviosCondicionais;

//3. Escreva um programa que leia dois números inteiros
//M e N e verifique se N é múltiplo de M.

import java.util.Scanner;

public class Exercicio03 {

    void main(){
        Scanner sc = new Scanner(System.in);

        IO.print("Informe um numero inteiro: ");
        int numero1 = sc.nextInt();

        IO.print("Informe um numero inteiro: ");
        int numero2 = sc.nextInt();

        if (numero1 % numero2 == 0) {
            IO.print("O número "+ numero1 +" é multiplo de "+ numero2);
        }
        else {
            IO.print("O número "+ numero1 +" não é  multiplo de "+ numero2);
        }
    }
}
