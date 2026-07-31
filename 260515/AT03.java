import java.util.Scanner;//Corrida de lesmas
  
public class AT03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("=== CORRIDA DE LESMAS ===");
        System.out.print("Quantas lesmas você quer no grupo? ");
        int L = entrada.nextInt();
        
        if (L <= 0) {
            System.out.println("Número inválido de lesmas. Encerrando o programa.");
            entrada.close();
            return;
        }

        int maiorVelocidade = 0;
        System.out.print("Velocidades sorteadas: ");

        for (int i = 0; i < L; i++) {
            int velocidadeAtual = (int) (Math.random() * 50) + 1;
            System.out.print(velocidadeAtual + " ");
            
            if (velocidadeAtual > maiorVelocidade) {
                maiorVelocidade = velocidadeAtual;
            }
        }
        
        System.out.println("\n-------------------------------------------");
        System.out.println("A lesma mais veloz corre a: " + maiorVelocidade + " cm/h");
        
        if (maiorVelocidade < 10) {
            System.out.println("Nível da mais rápida: 1");
        } else if (maiorVelocidade < 20) {
            System.out.println("Nível da mais rápida: 2");
        } else {
            System.out.println("Nível da mais rápida: 3");
        }
        System.out.println("===========================================");

        entrada.close();
    }
}