import java.util.Scanner;//Soma e diferença entre vetores

public class AT07 {
    public static Scanner entrada = new Scanner(System.in);

    public static int LerInt(String mensagem) {
        int valorInt;
        System.out.print(mensagem);
        valorInt = entrada.nextInt();
        return valorInt;
    }

    public static void main(String[] args) {
        int i;
        int[] va = new int[10];
        int[] vb = new int[10];
        int[] vc = new int[10];

        System.out.println("Digite os valores do vetor va:");
        for (i = 0; i < 10; i++) {
            va[i] = LerInt("va[" + i + "]: ");
        }

        System.out.println("\nDigite os valores do vetor vb:");
        for (i = 0; i < 10; i++) {
            vb[i] = LerInt("vb[" + i + "]: ");
        }

        for (i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                vc[i] = va[i] + vb[i];
            } else {
                vc[i] = va[i] - vb[i];
            }
        }

        System.out.print("\nva = [");
        for (i = 0; i < 10; i++) {
            System.out.print(va[i] + (i < 9 ? ", " : ""));
        }
        System.out.println("]");

        System.out.print("vb = [");
        for (i = 0; i < 10; i++) {
            System.out.print(vb[i] + (i < 9 ? ", " : ""));
        }
        System.out.println("]");

        System.out.print("vc = [");
        for (i = 0; i < 10; i++) {
            System.out.print(vc[i] + (i < 9 ? ", " : ""));
        }
        System.out.println("]");

        entrada.close();
    }
}