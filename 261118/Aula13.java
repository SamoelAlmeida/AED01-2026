public class Aula13 {

    // Troca dois elementos de posição no vetor
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

    // 1. INSERTION SORT (com troca - o seu original)
    // Complexidade: O(n) no melhor caso | O(n²) no pior caso
    public static void insertionSort(int[] v) {
        int i, j;
        for (j = 1; j < v.length; j++) {
            i = j;
            while (i > 0 && v[i] < v[i - 1]) {
                troca(v, i, i - 1);
                i--;
            }
        }
    }

    // 2. INSERTION SORT OTIMIZADO (por deslocamento, evita várias trocas)
    public static void insertionSortOtimizado(int[] v) {
        for (int j = 1; j < v.length; j++) {
            int chave = v[j];
            int i = j - 1;
            while (i >= 0 && v[i] > chave) {
                v[i + 1] = v[i];
                i--;
            }
            v[i + 1] = chave;
        }
    }

    // 3. SELECTION SORT
    // Complexidade: O(n²) em todos os casos | Máximo de (n - 1) trocas
    public static void selectionSort(int[] v) {
        int i, j, menor_val, menor_pos;

        for (i = 0; i < v.length - 1; i++) {
            menor_val = v[i];
            menor_pos = i;

            for (j = i + 1; j < v.length; j++) {
                if (v[j] < menor_val) {
                    menor_val = v[j];
                    menor_pos = j;
                }
            }

            if (menor_pos != i) {
                troca(v, i, menor_pos);
            }
        }
    }

    public static void main(String[] args) {
        int[] v1 = {64, 25, 12, 22, 11};
        insertionSort(v1);
        System.out.print("Insertion Sort:           ");
        imprimeVetor(v1);

        int[] v2 = {64, 25, 12, 22, 11};
        insertionSortOtimizado(v2);
        System.out.print("Insertion Sort Otimizado: ");
        imprimeVetor(v2);

        int[] v3 = {64, 25, 12, 22, 11};
        selectionSort(v3);
        System.out.print("Selection Sort:           ");
        imprimeVetor(v3);
    }
}