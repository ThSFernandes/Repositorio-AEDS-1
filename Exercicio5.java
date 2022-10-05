/*
Crie um métodosque receba o nome de 2 times e o número de gols marcados na partida (para cada time)e retorneo nome do vencedor. 
Caso não haja vencedor deverá retornara palavra EMPATE. Não permita que o usuário escreva um número de 
gols negativoe imprima oresultado do métodona main. 
*/

package exercicios;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int time1Gols, time2Gols;
        String nomeTime1, nomeTime2;

        System.out.println("Digite o nome do primeiro time: ");
        nomeTime1 = input.next();
        System.out.println("Digite o nome do segundo time: ");
        nomeTime2 = input.next();

        do {
            System.out.println("Digite quantos gols " + nomeTime2 + " fez: ");
            time1Gols = input.nextInt();
            if (time1Gols < 0) {
                System.out.println("Número de gols inválido");
            }
        } while (time1Gols < 0);

        do {
            System.out.println("Digite quantos gols o " + nomeTime2 + "  fez: ");
            time2Gols = input.nextInt();
            if (time2Gols < 0) {
                System.out.println("Número de gols inválido");
            }
        } while (time2Gols < 0);

    }

    public static String definidor(int time1Gols, int time2Gols, String nomeTime1, String nomeTime2) {
        String vencedor  ;

        if (time1Gols == 0 && time2Gols == 0) {
            vencedor = " Empate ";
        } else if (time1Gols > time2Gols) {
            vencedor = nomeTime1;

        } else {
            vencedor = nomeTime2;
        }
        return vencedor;
    }
}
