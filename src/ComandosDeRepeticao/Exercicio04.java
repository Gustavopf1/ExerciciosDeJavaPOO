package ComandosDeRepeticao;

//4. Escreva um programa que solicite uma senha numérica
//ao usuário. Enquanto a senha digitada for diferente de 1234,
//informe "Senha incorreta" e solicite novamente. Quando acertar, mostre "Acesso permitido".

import java.util.Scanner;

public class Exercicio04 {

    void main(){
        Scanner sc = new Scanner(System.in);

        IO.print("Informe a sua senha: ");
        int senha = sc.nextInt();

        while (senha != 1234) {
            IO.print("SENHA INCORRETA! INFORME NOVAMENTE SUA SENHA: ");
            senha = sc.nextInt();
        }

        IO.print("Acesso permitido!");
    }
}
