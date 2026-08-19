import java.util.Scanner; // Aula variável global, local e vetores

public class Aula01 {
    public static Scanner entrada = new Scanner(System.in);

    public static void mostrarVetor(int[] v){
        int i;
        for(i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    public static void alterarVetor(int[] v){
        v[5] = 0;
    }

    public static void alteraVarLocal(int x){
        x = 100;
    }

    public static void somarVetor(int[] v){
    
    }

    public static void definirValorVetor(int[] v, int valor){
        for(int i = 0; i < v.length; i++){
            v[i] = valor;
        }
    }    

    public static int obterPosicao(int[] v, int valor){
        for(int i = 0; i < v.length; i++){
            if(v[i] == valor){
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String []args){
        int[] numeros = {5, 8, 3, 2, 8, 2, 9, 3, 4, 9, 2};
        int varLocal;
        int valorBuscar;
        int valorPosicao;

        mostrarVetor(numeros);
        valorBuscar = 8;

        valorPosicao = obterPosicao(numeros, valorBuscar);

        System.out.println("O valor " + valorBuscar + " esta na posicao: " + valorPosicao);

        /*
        numeros = new int[10];
        numeros[0] = 3;
        numeros[1] = 5;
        numeros[2] = 1;

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = 20 + i;
        }
        */

        mostrarVetor(numeros);
        alterarVetor(numeros);
        mostrarVetor(numeros);

        varLocal = 50;
        System.out.println(varLocal);
        alteraVarLocal(varLocal);
        System.out.println(varLocal);
    }
}