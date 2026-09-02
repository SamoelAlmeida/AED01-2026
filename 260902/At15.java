import java.util.Scanner;//Permutação de linhas

public class At15 {
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

    public static int[][] matrizPermutacaoLinhasInt(int[][] A, int linha1, int linha2){
        if (linha1 >= 0 && linha1 < A.length && linha2 >= 0 && linha2 < A.length) {
            int[] temp = A[linha1];
            A[linha1] = A[linha2];
            A[linha2] = temp;
        }
        return A;
    }
    public static float[][] matrizPermutacaoLinhasFloat(float[][] A, int linha1, int linha2){
        if (linha1 >= 0 && linha1 < A.length && linha2 >= 0 && linha2 < A.length) {
            float[] temp = A[linha1];
            A[linha1] = A[linha2];
            A[linha2] = temp;
        }
        return A;
    }

    public static void main(String []args){

        int[][] matriz_A = {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};
        int[][] m_At = matrizPermutacaoLinhasInt(matriz_A, 0, 2);
        mostrarMatrizInt(m_At);

        float[][] matriz_B = {{1, 2, 3},
                              {4, 5, 6},
                              {7, 8, 9}};
        float[][] m_Bt = matrizPermutacaoLinhasFloat(matriz_B, 0, 2);
        mostrarMatrizFloat(m_Bt);
    }
}
