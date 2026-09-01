import java.util.Scanner;//3°Aula de vetores e matrizes

public class Aula06 {
    public static Scanner entrada = new Scanner(System.in);

    public static int[][] somaMatriz(int[][] A, int[][] B){
        int linhas = A.length;
        int colunas = A[0].length;
        int[][] C = new int[A.length][B.length];

        for (int i=0; i < linhas; i++){
            for (int j=0; j < colunas; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    public static int[][] multiplicarMatrizEscalar(int[][] A, int escalar){
        int linhas = A.length;
        int colunas = A[0].length;
        int[][] C = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                C[i][j] = A[i][j] * escalar;
            }
        }
        return C;
    }

    public static int[][] multiplicarMatriz(int[][] A, int[][] B){
        int linhas = A.length;
        int colunas = B[0].length;
        int[][] C = new int[linhas][colunas];

        for (int i=0; i < linhas; i++){
            for (int j=0; j < colunas; j++){
                for (int k=0; k < A[0].length; k++){
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
                }
            }
        }    
        return C;
    }

    public static void mostrarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++){
            System.out.print("[");
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]);
                if (j < matriz[i].length - 1){
                    System.out.print(", "); 
                }
            }
            System.out.println("]");
        }
    }
    public static void main(String []args){

        int[][] matriz_A = {{1, 2},
                            {3, 4},
                            {5, 6}};
        
        int[][] matriz_B = {{5, 6, 7},
                            {8, 9, 10}};
        //int[][] matriz_C;
        //int[][] matriz_D;
        int[][] matriz_E;
        //int escalar = 5;
        /* 
        System.out.println("Soma (A + B):");
        matriz_C = somaMatriz(matriz_A, matriz_B);
        mostrarMatriz(matriz_C);

        System.out.println("\nMultiplicação por Escalar (A * 5):");
        matriz_D = multiplicarMatrizEscalar(matriz_A, escalar);
        mostrarMatriz(matriz_D);
        */
        System.out.println("\nMultiplicação de Matrizes (A * B):");
        matriz_E = multiplicarMatriz(matriz_A, matriz_B);
        mostrarMatriz(matriz_E);
    }
}