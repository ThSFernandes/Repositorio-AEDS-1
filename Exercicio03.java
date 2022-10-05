package exercicios;

import java.util.Scanner;
/*
Construa um método que 5 valores float e calcule e retorne a sua soma , 
construa um segundo métodoque calcule a media e receba como parâmetroa soma e a 
quantidade de dos valores e retorne o resultado da média.
*/


public class Exercicio03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidade;
        float nums[], soma, media ;

        System.out.println("Digite quantas notas você deseja inserir: ");
        quantidade = input.nextInt();
        
        nums = new float[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite a " + (i+1) + "º nota: ");
            nums[i] = input.nextFloat();
            
        }
        soma = somarNums(nums, quantidade);
        System.out.println("A soma é " + somarNums(nums, quantidade));
        media = fazerMedia(soma, quantidade);
        System.out.println("A media é " + fazerMedia(soma, quantidade));
        

    }

    public static float somarNums(float nums[], int quantidade) {
        int soma = 0;

        for (int i = 0; i < quantidade; i++) {
            soma += nums[i];

        }
        return soma;
    }

    public static float fazerMedia(float soma, int quantidade) {
        
        float media = soma / quantidade;
 
        return media;
    }
    
}
