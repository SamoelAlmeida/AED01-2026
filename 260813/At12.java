import java.util.Scanner;//Novo vetor de inteiros

public class At12 {
    public static Scanner entrada = new Scanner(System.in);

    public static int LerInt(String mensagem) {
        int valorInt;
        System.out.print(mensagem);
        valorInt = entrada.nextInt();
        return valorInt;
    }

    public static int[] alocarInteiros(int tamanho) {
        int[] v = new int[tamanho];
        return v;
    }

    public static void main(String[] args) {
        int[] resultado = alocarInteiros(LerInt("Digite o tamanho do vetor: "));
        
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
