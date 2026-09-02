package EntradaESaida;

//9. Escreva um programa que leia o valor de uma distância
//percorrida em km e o tempo gasto em horas e calcule a velocidade média em m/s.

import java.util.Scanner;

public class Exercicio09 {

    void main(){
        Scanner sc = new Scanner(System.in);

        IO.println("Informe o valor da distancia em km: ");
        double distanciaKm = sc.nextDouble();

        IO.println("Informe o tempo gasto em horas: ");
        double tempo = sc.nextDouble();

        double distanciaMetros = distanciaKm * 1000;
        double tempoSegundos = tempo * 3600;
        double velocidadeMedia = distanciaMetros / tempoSegundos;

        IO.println("A velocidade média percorrida em m/s foi " + velocidadeMedia);
    }
}
