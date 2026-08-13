import java.util.Scanner;//Copiar trecho de vetor

public class At13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números serão no vetor? ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite a posição [" + i + "]: ");
            vetor[i] = scanner.nextInt();
        }

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

        System.out.println("\n--- " + posInicio +" "+ posFim + " ---");
        for (int i = posInicio; i <= posFim; i++) {
            System.out.println("Posição [" + i + "]: " + vetor[i]);
        }

        scanner.close();
    }
}
