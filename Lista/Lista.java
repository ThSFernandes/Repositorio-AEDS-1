package aedsaprendendolista;

public class Lista {

    static int item[];
    static int primeiro, ultimo;

    // Cria uma lista vazia 
    public static void lista(int tam) {
        item = new int[tam];
        primeiro = 0;
        ultimo = primeiro;

    }

    // Insere um elemento ao final da lista
    public static void insere(int x) {
        if (ultimo >= item.length) {
            System.out.println("Erro: Lista esta cheia ");
            return;

        } else {

        }

        item[ultimo] = x;
        ultimo = ultimo + 1;

    }

    //Testa se há elementos no betor 'item' e retorna true(ou false)
    public static boolean vazia() {
        
        return (primeiro == ultimo);
        
    }

    //Imprime os elementos da lista do primeiro até(ultimo -1)
    public static void imprime() {
        for (int i = 0; i < ultimo; i++) {
            System.out.println(item[i]);
        }
    }
    /*
    //Pesquisa Insre mais um elemento no final da lista 
    public static Object pesquisa (int chave ){
        
    }
    //Busca um elemto igual à chave dna lista. Se existir retorna o elemento
    public static Object retira ( int chave ){
        
    }
    //Retorna o 1º elemento da, se esta não estiver vazia
    public static Object retiraPrimeiro(){
     */
}

