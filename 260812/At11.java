import java.util.Scanner;//Valores iguais

public class At11 {
    public static Scanner entrada = new Scanner(System.in);
    
    public static boolean valorIgual(int[] v1, int[] v2) {
        if (v1.length != v2.length) {
            return false;
        }

        for (int i = 0; i < v1.length; i++) {
            if (v1[i] != v2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] vetorA = {1, 2, 3, 4, 5};
        int[] vetorB = {1, 2, 3, 4, 5};
        int[] vetorC = {1, 2, 9, 4, 5};

        System.out.println("vetorA é igual a vetorB? " + valorIgual(vetorA, vetorB));
        System.out.println("vetorA é igual a vetorC? " + valorIgual(vetorA, vetorC));
        
        entrada.close();
    }
}