package treinolista;

import java.util.ArrayList;
import java.util.Scanner;

public class ImplementarLista {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList lista = new ArrayList();
        String aluno;
        String verifica = "parar";

        System.out.println("Se desejar finalizar o programa digite parar");
        do {
            System.out.println("Digite o nome do aluno: ");
            aluno = input.next();

            if (!aluno.equals(verifica)) {
                lista.add(aluno);
            }

        } while (!aluno.equals(verifica));

        if (lista.size() == 0) {
            System.out.println("Não existe registro na lista");
        } else {
            if (lista.size() == 1) {
                System.out.println("O nome é: ");
                System.out.println(lista);
                System.out.println("E a lista possui " + lista.size() + " elemento !");
            } else {
                System.out.println("Os nomes são ");

                System.out.println(lista);

                System.out.println("E a lista possui " + lista.size() + " elementos ! ");
                
            }
                System.out.println("A Lista foi esvaziada");
                lista.clear();
                if (lista.size() == 0) {
            System.out.println("Não existe registro na lista");

            }
        }
    }
}