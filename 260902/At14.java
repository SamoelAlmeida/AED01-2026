import java.util.Scanner;//Matriz transposta

public class At14 {
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
    public static void mostrarMatrizBool(boolean[][] matriz){
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

    public static int[][] matrizTransporInt(int[][] A){
        int linhas = A.length;
        int colunas = A[0].length;
        int[][] Atrns = new int[colunas][linhas];

        for (int i=0; i < linhas; i++){
            for (int j=0; j < colunas; j++){
                Atrns[j][i] = A[i][j];
            }
        }
        return Atrns;
    }
    public static float[][] matrizTransporFloat(float[][] A){
        int linhas = A.length;
        int colunas = A[0].length;
        float[][] Atrns = new float[colunas][linhas];

        for (int i=0; i < linhas; i++){
            for (int j=0; j < colunas; j++){
                Atrns[j][i] = A[i][j];
            }
        }
        return Atrns;
    }
    public static boolean[][] matrizTransporBool(boolean[][] A){
        int linhas = A.length;
        int colunas = A[0].length;
        boolean[][] Atrns = new boolean[colunas][linhas];

        for (int i=0; i < linhas; i++){
            for (int j=0; j < colunas; j++){
                Atrns[j][i] = A[i][j];
            }
        }
        return Atrns;
    }
    public static void main(String []args){

        int[][] matriz_A = {{1, 2, 3},
                            {4, 5, 6}};
        int[][] m_At = matrizTransporInt(matriz_A);
        mostrarMatrizInt(m_At);

        float[][] matriz_B = {{1, 2, 3},
                              {4, 5, 6}};
        float[][] m_Bt = matrizTransporFloat(matriz_B);
        mostrarMatrizFloat(m_Bt);

        boolean[][] matriz_C = {{true, true, false},
                                {true, false, true}};
        boolean[][] m_Ct = matrizTransporBool(matriz_C);
        mostrarMatrizBool(m_Ct);
    }
}
