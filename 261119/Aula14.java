public class Aula14 {

    // Troca dois elementos de posição no vetor (usado no Quick Sort)
    public static void troca(int[] v, int pos1, int pos2) {
        int aux = v[pos1];
        v[pos1] = v[pos2];
        v[pos2] = aux;
    }

    // Imprime o vetor sem usar java.util.Arrays
    public static void imprimeVetor(int[] v) {
        System.out.print("[");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);
            if (i < v.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // =========================================================================
    // 1. MERGE SORT (Divisão e Conquista)
    // Complexidade: O(n log n) em todos os casos | Usa memória extra O(n)
    // =========================================================================

    // Intercala dois vetores já ordenados (o seu método original)
    public static int[] mergeSort_intercalar(int[] va, int[] vb) {
        int i = 0, j = 0, k = 0;
        int[] vr = new int[va.length + vb.length];

        while (i < va.length && j < vb.length) {
            if (va[i] <= vb[j]) {
                vr[k] = va[i];
                i++;
            } else {
                vr[k] = vb[j];
                j++;
            }
            k++;
        }

        while (i < va.length) {
            vr[k] = va[i];
            i++;
            k++;
        }

        while (j < vb.length) {
            vr[k] = vb[j];
            j++;
            k++;
        }

        return vr;
    }

    // Divide o vetor recursivamente ao meio e intercala na volta
    public static int[] mergeSort(int[] v) {
        // Caso base: vetor com 0 ou 1 elemento já está ordenado
        if (v.length <= 1) {
            return v;
        }

        int meio = v.length / 2;
        int[] esquerda = new int[meio];
        int[] direita = new int[v.length - meio];

        // Copia a primeira metade para esquerda
        for (int i = 0; i < meio; i++) {
            esquerda[i] = v[i];
        }
        // Copia a segunda metade para direita
        for (int i = meio; i < v.length; i++) {
            direita[i - meio] = v[i];
        }

        // Ordena cada metade recursivamente e intercala
        esquerda = mergeSort(esquerda);
        direita = mergeSort(direita);

        return mergeSort_intercalar(esquerda, direita);
    }

    // =========================================================================
    // 2. QUICK SORT (Divisão e Conquista)
    // Complexidade: O(n log n) médio | O(n²) pior caso | Ordena in-place O(1)
    // =========================================================================

    public static void quickSort(int[] v) {
        quickSort(v, 0, v.length - 1);
    }

    private static void quickSort(int[] v, int inicio, int fim) {
        if (inicio < fim) {
            int posPivo = particionar(v, inicio, fim);
            quickSort(v, inicio, posPivo - 1); // Ordena subvetor à esquerda do pivô
            quickSort(v, posPivo + 1, fim);    // Ordena subvetor à direita do pivô
        }
    }

    // Coloca o pivô (último elemento) na posição correta:
    // menores à esquerda, maiores à direita
    private static int particionar(int[] v, int inicio, int fim) {
        int pivo = v[fim];
        int i = inicio - 1; // Índice do menor elemento

        for (int j = inicio; j < fim; j++) {
            if (v[j] <= pivo) {
                i++;
                troca(v, i, j);
            }
        }

        troca(v, i + 1, fim);
        return i + 1;
    }

    public static void main(String[] args) {
        int[] v1 = {64, 25, 12, 22, 11, 90, 3};
        v1 = mergeSort(v1); // Merge Sort retorna um novo vetor ordenado
        System.out.print("Merge Sort: ");
        imprimeVetor(v1);

        int[] v2 = {64, 25, 12, 22, 11, 90, 3};
        quickSort(v2);      // Quick Sort ordena o próprio vetor (in-place)
        System.out.print("Quick Sort: ");
        imprimeVetor(v2);
    }
}