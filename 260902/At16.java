import java.util.Scanner;//Permutação de colunas

public class At16 {
    public static Scanner entrada = new Scanner(System.in);
    public static void mostrarMatrizInt(int[][] matriz){
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
    public static void mostrarMatrizFloat(float[][] matriz){
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

    public static int[][] matrizPermutacaoColunasInt(int[][] A, int col1, int col2){
        if (A.length > 0 && col1 >= 0 && col1 < A[0].length && col2 >= 0 && col2 < A[0].length) {
            for (int i = 0; i < A.length; i++) {
                int temp = A[i][col1];
                A[i][col1] = A[i][col2];
                A[i][col2] = temp;
            }
        }
        return A;
    }
    public static float[][] matrizPermutacaoColunasFloat(float[][] A, int col1, int col2){
        if (A.length > 0 && col1 >= 0 && col1 < A[0].length && col2 >= 0 && col2 < A[0].length) {
            for (int i = 0; i < A.length; i++) {
                float temp = A[i][col1];
                A[i][col1] = A[i][col2];
                A[i][col2] = temp;
            }
        }
        return A;
    }

    public static void main(String []args){

        int[][] matriz_A = {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};
        int[][] m_At = matrizPermutacaoColunasInt(matriz_A, 0, 2);
        mostrarMatrizInt(m_At);

        float[][] matriz_B = {{1, 2, 3},
                              {4, 5, 6},
                              {7, 8, 9}};
        float[][] m_Bt = matrizPermutacaoColunasFloat(matriz_B, 0, 2);
        mostrarMatrizFloat(m_Bt);
    }
}
