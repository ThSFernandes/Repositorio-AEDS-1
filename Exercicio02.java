package treinolista;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        ArrayList valorProduto = new ArrayList();
        ArrayList<Integer> quantProduto = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        int i = 0, valor, quant;

        System.out.println("Lista de valores iniciado, caso queira parar digite 0 !");
        do {
            System.out.println("Digite o valor do " + (i + 1) + "º produto:");
            valor = input.nextInt();

            if (valor != 0) {
                valorProduto.add(valor);
                System.out.println("Digite a quantidade " + (i + 1) + "º produto:");
                quant = input.nextInt();
                quantProduto.add(valor);
                i++;
            }

        } while (valor != 0);

        System.out.println("A lista possuí  " + quantProduto.size() + " itens !");
        System.out.println("E os valores são " + valorProduto);

    }

}
