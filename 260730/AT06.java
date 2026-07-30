import java.util.Scanner;//Contagem acima da média

public class AT06 {
    public static Scanner entrada = new Scanner(System.in);

    public static int LerInt(String mensagem) {
        int valorInt;
        System.out.print(mensagem);
        valorInt = entrada.nextInt();
        return valorInt;
    }

    public static void main(String[] args) {
        int i, soma;
        double media;

        int[] valores = new int[5];

        for (i = 0; i < valores.length; i++) {
            valores[i] = LerInt("digite um valor: ");
        }
        
        soma = 0;
        for (i = 0; i < valores.length; i++) {
            soma += valores[i];
        }

        media = (double) soma / (double) valores.length;

        int quant = 0;
        for (i = 0; i < valores.length; i++) {
            if (valores[i] > media) {
                quant++;
            }
        }
        System.out.println(quant);
        entrada.close();
    }
}