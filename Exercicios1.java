/*Construa um método que receba como parâmetro um número e calcule e 
retorne o valor do seu fatorial e o imprima na main.
*/

package exercicios;

import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, fatorial;
        System.out.println("Digite um número: ");
        numero = input.nextInt();
        
        fatorial = fazerFatorial(numero) ;
        System.out.println("O fatorial é " + fatorial);
    }

    public static int fazerFatorial(int numero) {
        int fatorial=1;
        
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
            
        }
        
        return fatorial;
        
    }
    

}
