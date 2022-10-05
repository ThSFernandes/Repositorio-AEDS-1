/*
Construa um algoritmo que tenha um método que receba uma nota como parâmetro retorne uma String com a
palavra “aprovado” caso a nota seja maior ou igual a 60, caso contrario retorne a String 
“reprovado”. Imprima a string de retorno na main 
*/




package exercicios;

import java.util.Scanner;


public class Exercicio2 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float nota;
        String resultado;
        System.out.println("Digite a sua nota: ");
        nota = input.nextInt();
        
        resultado = mostrarResultado( nota);
        System.out.println("O aluno foi " + mostrarResultado(nota));

    }
    public static String mostrarResultado(float nota){
        if(nota >=60){
            return "aprovado !";
        }else{
            return "reprovado !";
        }
    }
    
}
