import java.util.Scanner;

public class main {
public static Scanner entrada = new Scanner(System.in);

public static int LerInt(String mensagem){
    System.out.print(mensagem);
    int Valor_Int = entrada.nextInt();
    entrada.nextLine();
    return Valor_Int;
}

    public static void main(String[] args){
        int i, j, k=0, n;

        for(j=0; j<1; j++){
            System.out.print("*");
        }

        for(i=0; i<4; i++){
            System.out.print("_");
        }
        System.out.println();
    }
}