import java.util.Scanner;//Copiar trecho de vetor

public class At13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números serão no vetor? ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("\n--- Preenchimento do Vetor ---");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número para a posição [" + i + "]: ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("\nO seu vetor foi criado. As posições válidas vão de 0 a " + (tamanho - 1) + ".");

        int posInicio, posFim;

        while (true) {
            System.out.print("Digite a posição inicial desejada: ");
            posInicio = scanner.nextInt();

            System.out.print("Digite a posição final desejada: ");
            posFim = scanner.nextInt();

            if (posInicio >= 0 && posFim < tamanho && posInicio <= posFim) {
                break;
            }
            
            System.out.println("O início deve ser menor ou igual ao fim.\n");
        }

        System.out.println("\n--- " + posInicio + posFim + " ---");
        for (int i = posInicio; i <= posFim; i++) {
            System.out.println("Posição [" + i + "]: " + vetor[i]);
        }

        scanner.close();
    }
}
