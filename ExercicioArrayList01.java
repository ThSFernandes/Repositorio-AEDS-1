package treinolista;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        int idade, verifica = 18, contMaiorIdade=0, contMenorIdade=0, menorIdade = 10000, maiorIdade =0;
        

        System.out.println("Seja bem vindo ao programa !");
        System.out.println("Caso você digite 0 o programa finalizará !");
        do {
            System.out.println("Digite a sua idade ");
            idade = input.nextInt();

            if (idade != 0) {
                lista.add(idade);
            }

        } while (idade != 0);
        
        System.out.println("O número de pessoas que são maior de idade é " + verificaMaiorDeIdade(lista, idade,contMaiorIdade,verifica));
        System.out.println("O número de pessoas que são menores de idade é " + verificaMenorDeIdade(lista, idade, contMenorIdade, verifica));
        System.out.println("A maior idade é " + verificaMaiorIdade(lista, idade, maiorIdade));
        System.out.println("A menor idade é " + verificaMenorIdade(lista, idade, menorIdade));
        
    }

    public static int  verificaMaiorDeIdade(  ArrayList <Integer> lista, int idade, int contMaiorIdade, int verifica) {
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i)>= verifica){
                contMaiorIdade ++;
                
            }
        }
        return contMaiorIdade;
        
        
    }
    public static int  verificaMenorDeIdade(  ArrayList <Integer> lista, int idade, int contMenorIdade, int verifica) {
        for (int i = 0; i < lista.size(); i++) {
            if(  lista.get(i) < verifica){
                contMenorIdade ++;
                
            }
        }
        return contMenorIdade;
        
        
    }
    public static int verificaMaiorIdade (ArrayList <Integer> lista, int idade, int MaiorIdade){
        for (int i = 0; i < lista.size(); i++) {
            if( lista.get(i) > MaiorIdade ){
                MaiorIdade = lista.get(i);
                
            }
            
        }
        return MaiorIdade;
    }
    public static int verificaMenorIdade (ArrayList <Integer> lista, int idade, int MenorIdade){
        for (int i = 0; i < lista.size(); i++) {
            if( lista.get(i) < MenorIdade ){
                MenorIdade = lista.get(i);
                
            }
            
        }
        return MenorIdade;
    }
    
    
}


