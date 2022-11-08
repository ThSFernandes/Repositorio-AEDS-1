
public class ListaNumero03 {

    private float item[];
    private int primeiro, ultimo;

    // Cria uma lista vazia 
    public void lista(int tam) {
        item = new float[tam];
        primeiro = 0;
        ultimo = primeiro;

    }

    // Insere um elemento ao final da lista
    public void insere(float nota) {

        if (ultimo >= item.length) {
            System.out.println("Erro: Lista esta cheia ");
            return;
        } else if (nota < 0) {

            System.out.println("Não é permitido o nota menor que 0 !");
            return;
        } else if (nota > 100) {
            System.out.println("Não é permitido nota maior que 100 !");
            return;
        } else {

            item[ultimo] = nota;
            ultimo = ultimo + 1;
        }

    }

//Testa se há elementos no betor 'item' e retorna true(ou false)
    public boolean vazio() {

        return (primeiro == ultimo);

    }

    //Imprime os elementos da lista do primeiro até(ultimo -1)
    public void imprime() {
        for (int i = 0; i < ultimo; i++) {
            System.out.println(item[i]);
        }
    }

    public void imprime(float[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println(item[i]);
        }
    }

    //Pesquisa Insere mais um elemento no final da lista 
    public Object pesquisa(float chave) {

        if (vazio()) {
            System.out.println("Lista vazia");
            return null;
        }
        int aux = 0;
        for (int i = primeiro; i < ultimo; i++) {
            if (chave == item[i]) {
                aux++;
            }
        }
        return aux;
    }

    public Object media() {
        if (vazio()) {
            System.out.println("Erro! Lista vazia");
            return null; //Elemento não encontrado (null é POO)
        }
        float media, soma = 0;
        for (int i = primeiro; i < ultimo; i++) {
            soma = soma + item[i];
        }
        media = soma / (ultimo - 1);
        return media;
    }


    public void divisaoValores() {
        float[] acima = new float[ultimo - 1];
        float[] abaixo = new float[ultimo - 1];
        int contAcima = 0, contAbaixo = 0;
        for (int i = primeiro; i < ultimo; i++) {
            if (item[i] >= 60) {
                acima[contAcima] = item[i];
                contAcima++;
            } else {
                abaixo[contAbaixo] = item[i];
                contAbaixo++;
            }
        }
        System.out.println("valores acima da media");
        imprime(acima);
        System.out.println("valores abaixo da media");
        imprime(abaixo);
    }

//Busca um elemento igual à chave na lista. Se existir retorna o elemento
    public Object retira(float chave) {
        if (vazio()) {
            System.out.println("Erro! Lista vazia");
            return null; //Elemento não encontrado (null é POO)
        }
        int p = 0;
        while (p < ultimo && item[p] != chave) {
            p++;
        }
        if (p >= ultimo) {
            return null; // 'it' não está no vetor!
        }//'it' foi encontrado na posição p
//Salvamos 'it' para retornar
        Object elem = item[p]; //essa atribuição é permitida,
//mais adiante iremos retornar um registro!
//Todas os demais elementos (indices de p à ultimo-1)
//serão deslocados uma posição para frente para ocupar
//a posição p de 'it' (retirado)
        ultimo = ultimo - 1;
        for (int aux = p; aux < ultimo; aux++) {
            item[aux] = item[aux + 1];
        }
        return elem;
    }
    
//Retira e retorna o 1º elemento da lista, se esta não estiver vazia

    public Object retiraPrimeiro() {
        if (vazio()) {
            System.out.println("Erro! Lista vazia");
            return null;
        }
//Salva o item[0] para retornar
        Object elem = item[0];
//Todas os demais elementos (indices de 1 à ultimo-1)
//serão deslocados uma posição para frente para ocupar
//a posição 0
        ultimo = ultimo - 1;
        for (int aux = 0; aux < ultimo; aux++) {
            item[aux] = item[aux + 1];
        }
        return elem;
    }
}
