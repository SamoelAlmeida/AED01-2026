import java.util.Scanner;

public class At02 {
    public static Scanner entrada = new Scanner(System.in);

    public static int LerInt(String mensagem) {
        System.out.print(mensagem);
        return entrada.nextInt();
    }

    public static void main(String[] args) {
        int i, k, j;
        int n = LerInt("Valor: ");

        int n_i = n - 1;

        for (i = 1; i <= n; i++) {
            
            for (j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}