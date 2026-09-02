package DesviosCondicionais;

//4. Escreva um programa que leia o número de gols marcados pelo time da casa e o
//número de gols marcado pelo time visitante e verifique se o jogo foi vencido pelo time
//da casa, pelo time visitante ou se terminou empatado.

import java.util.Scanner;

public class Exercicio04 {

    void main(){
        Scanner sc = new Scanner(System.in);

        IO.print("Informe o número de gols marcados pelo time da casa: ");
        int golsTimeCasa = sc.nextInt();

        IO.print("Informe o número de gols marcados pelo time Visitante: ");
        int golsTimeVisitante = sc.nextInt();

        if (golsTimeCasa > golsTimeVisitante) {
            IO.print("O time da casa venceu de "+ golsTimeCasa +" x "+ golsTimeVisitante);
        }
        else if (golsTimeCasa < golsTimeVisitante) {
            IO.print("O time Vistante venceu de "+ golsTimeVisitante +" x "+ golsTimeCasa);
        }
        else {
            IO.print("O jogo empatou de "+ golsTimeCasa + " x "+ golsTimeVisitante);
        }
    }
}
