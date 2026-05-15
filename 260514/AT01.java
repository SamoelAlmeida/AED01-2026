import java.util.Scanner;//pirame de pontos *

public class AT01 {
    public static Scanner entrada = new Scanner(System.in);

    public static int LerInt(String mensagem){
        System.out.print(mensagem);
        int Valor_Int = entrada.nextInt();
        entrada.nextLine();
        return Valor_Int;
    }

    public static void main(String[] args){
        int i, k=0, j, n_i = 4;
        int n = LerInt("Valor: ");

        n_i = n - 1;
        while(k<n){
                for (i = 1; i <= n_i; i++) {
                    for (j = 0; j < n_i - i; j++) {
                    System.out.print("_");
                }
                for (k = 0; k < (2 * i - 1); k++) {
                    System.out.print("*");
                }
                for (j = 0; j < n_i - i; j++) {
                    System.out.print("_");
                }
                System.out.println();
            }
        }    
    }
}