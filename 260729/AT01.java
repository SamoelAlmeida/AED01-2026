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
        int[] idades;
        int i;

        idades = new int[8];

        for(i = 0; i < idades.length; i++){
            idades[i] = LerInt("Digite o valor: ");
        }

        System.out.println("================================");

        for(i = 0; i < idades.length; i++){
        System.out.println(idades[i]);
        }
    }
}