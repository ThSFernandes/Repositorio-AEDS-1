/*
Construa um método que receba três valoresinteiros e passe de
parâmetro para um método que retorne o menor valor entreeles.
*/

package exercicios;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, menorNumero;
        System.out.println("Digite o primeiro número: ");
        num1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = input.nextInt();
        System.out.println("Digite o terceiro número: ");
        num3 = input.nextInt();

        System.out.println("O menor valor é " + verificaMenor(num1, num2, num3));

        menorNumero = verificaMenor(num1, num2, num3);
    }

    public static int verificaMenor(int num1, int num2, int num3) {
        int menor_valor;

        if (num1 < num2 && num1 < num3) {
            menor_valor = num1;
        } else if (num2 < num1 && num2 < num1) {
            menor_valor = num2;
        } else {
            menor_valor = num3;
        }
        
        return menor_valor;
    }
}
