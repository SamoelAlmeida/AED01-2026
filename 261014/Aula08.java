class No {
    int valor;
    No prox;
}

class Lista {
    No inicio;
}

public class Aula08 {
    public static void MostrarLista(Lista l){
        No atual;
        atual = l.inicio;

        while (atual != null){
            System.out.println(atual.valor);
            atual = atual.prox;
        }
    } 

    public static void AdicionarNaLista(Lista l, int x){
        No novo = new No();
        novo.valor = x;
        novo.prox = null;

        if (l.inicio == null){
            l.inicio = novo;
        } else {
            No atual = l.inicio;
            while (atual.prox != null){
                atual = atual.prox;
            }
            atual.prox = novo;
        }
    }

    public static void RemoverDaLista(Lista l, int pos){
        No atual;
        int pos_count = 0;

        atual = l.inicio;
        while (pos_count < pos-1){
            atual = atual.prox;
            pos_count ++;
        }

        atual.prox = atual.prox.prox;
    }   

    public static void main(String[] args) {
        Lista lista;
        No novo;
        No atual;

        lista = new Lista();

        novo = new No();
        novo.valor = 15;
        lista.inicio = novo;

        atual = novo;
        novo = new No();
        novo.valor = 18;
        atual.prox = novo;

        atual = novo;
        novo = new No();
        novo.valor = 97;
        atual.prox = novo;

        atual = novo;
        novo = new No();
        novo.valor = 16;
        atual.prox = novo;

        /* 
        System.out.println(lista.inicio.valor);
        System.out.println(lista.inicio.prox.valor);
        System.out.println(lista.inicio.prox.prox.valor);
        System.out.println(lista.inicio.prox.prox.prox.valor);
        */

        MostrarLista(lista);

        AdicionarNaLista(lista, 28);
        
        System.out.println("==<ADD-5°N>==");
        MostrarLista(lista);

        RemoverDaLista(lista, 4);

        System.out.println("==<DEL-5°N>==");
        MostrarLista(lista);
    }
}