package treino.de.matriz;

import java.util.Scanner;

public class TreinoDeMatriz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float notas[][] = new float[3][4];
        float soma = 0, nums = 10, somal;
        float resultadoLinha[] = new float[3], resultadoColuna[] = new float[4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Digite" + (j+1) +"º nota do " + (i+1) +"º aluno");
                notas[i][j] = input.nextFloat();
                //notas[i][j] = (int) nums;
            }
            nums++;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(notas[i][j] + " ");

            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {

                soma += notas[i][j];
            }
            resultadoLinha[i] = soma;

            soma = 0;

        }
        System.out.println("\nA soma das linhas");
        for (int i = 0; i < 3; i++) {
            System.out.print(  resultadoLinha[i] + " ");

        }
        for (int i = 0; i < 4; i++) {
            somal = 0;
            for (int j = 0; j < 3; j++) {

                somal += notas[j][i];
            }
            resultadoColuna[i] = somal;

        }
            System.out.println("\nA soma das colunas ");
        for (int i = 0; i < 4; i++) {
            
            System.out.print(resultadoColuna[i] + " ");
            
        }
        System.out.println("");

    }
}


