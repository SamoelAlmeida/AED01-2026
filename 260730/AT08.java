import java.util.Scanner;//Contagem de pares e ímpares
 
public class AT08 {
    public static Scanner entrada = new Scanner(System.in);

    public static int LerInt(String mensagem) {
        int valorInt;
        System.out.print(mensagem);
        valorInt = entrada.nextInt();
        return valorInt;
    }

    public static void main(String[] args) {
        int n =  LerInt("Digite quantos seram: ");

        int[] valores =  new int[n];
        int[] pares =  new int[n];
        int[] impares =  new int[n];

        int qtdPares = 0;
        int qtdImpares = 0;

        for (int i = 0; i < n; i++) {
            valores[i] = LerInt("Digite o " + (i + 1) + "º valor: ");

            if (valores[i] % 2 == 0) {
                pares[qtdPares] = valores[i];
                 qtdPares++;
            } else {
                impares[qtdImpares] = valores[i];
                qtdImpares++;
            }
        }

        System.out.println("Par: " + qtdPares);
        System.out.print("[");
        for (int i = 0; i < qtdPares; i++) {
            System.out.print(pares[i] + (i < qtdPares - 1 ? ", " : ""));
        }
        System.out.println("]");

        System.out.println("Ímpar: " + qtdImpares);
        System.out.print("[");
        for (int i = 0; i < qtdImpares; i++) {
            System.out.print(impares[i] + (i < qtdImpares - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}