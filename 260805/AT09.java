import java.util.Scanner;//Cópia separando pares e ímpares
 
public class AT09 {
    public static Scanner entrada = new Scanner(System.in);

    public static int LerInt(String mensagem) {
        int valorInt;
        System.out.print(mensagem);
        valorInt = entrada.nextInt();
        return valorInt;
    }

    public static void main(String[] args){
        int[] va = new int [10];
        int[] vb = new int [10];
        int indiceVb = 0;

        System.out.println("Digite 10 valores inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "° numero: ");
            va[i] = entrada.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (va[i] % 2 == 0) {
                vb[indiceVb] = va[i];
                indiceVb++; 
            }
        }

        for (int i = 0; i < 10; i++) {
            if (va[i] % 2 != 0) {
                vb[indiceVb] = va[i];
                indiceVb++; 
            }
        }

        System.out.println("\nVb:");
        System.out.print("[ ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vb[i] + " ");
        }
        System.out.println("]");

        entrada.close();
    }
}