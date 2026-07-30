import java.util.Scanner;
public class AT04 {

public static Scanner entrada = new Scanner(System.in);

    public static char LerChar(String mensagem) {
        char caracter;
        System.out.print(mensagem);
        caracter = entrada.next().charAt(0);
        return caracter;
    }

    public static void linha() {
        System.out.println("============");
    }

    public static void cabecalho(String nome, String sobrenome) {
        linha();
        System.out.println(nome + " " + sobrenome);
        linha();
    }

    public static int soma(int a, int b) {
        int valor_soma;
        valor_soma = a + b;
        return valor_soma;
    }

    public static void situacao(char conceito) {
        boolean aprovado = true;
        if(conceito == 'D') {
            aprovado = false;
        }
        if(aprovado) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

    public static int LerInt(String mensagem) {
        int valor;
        System.out.print(mensagem);
        valor = entrada.nextInt();
        return valor;
    }

    public static int fatorial(int x) {
        int valor_fatorial = 1;
        int i;

        for(i = 1; i <= x; i++) {
            valor_fatorial = valor_fatorial * i;
        }
        return valor_fatorial;
    }
    public static void main(String[] args) {

        int valor = LerInt("valor: ");
        System.out.println("Fatorial: " + fatorial(valor));

    }
}