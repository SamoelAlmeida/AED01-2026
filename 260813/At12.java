import java.util.Scanner;//Novo vetor de inteiros

public class At12 {
    public static Scanner entrada = new Scanner(System.in);

    public static int[] alocarInteiros(int tamanho) {
        int[] v = new int[tamanho];
        return v;
    }

    public static void main(String[] args) {
        int[] resultado = alocarInteiros(5);
        
        System.out.print("[");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]);
            if (i < resultado.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
