import java.util.Scanner;

public class AT01 {
    public static Scanner entrada = new Scanner(System.in);

        public static int LerInt(String mensagem){
        int Valor_Int;
        System.out.print(mensagem);
        Valor_Int = entrada.nextInt();
        return Valor_Int;
        }

    public static void main(String[] args) {
        int i, soma;
        double media;

        int[] valores;
        valores = new int[5];

        for(i = 0; i < valores.length; i++) {
            valores[i] = LerInt("digite um valor: ");
        }
        
        soma = 0;
        for(i = 0; i < valores.length; i++) {
            soma = soma + valores[i];
    }

    media = soma/valores.length;

    int quant = 0;
    for(i = 0; i < valores.length; i++) {
        if(valores[i] > media) {
            quant++;
        }
    }
    System.out.println(quant);
    }
}