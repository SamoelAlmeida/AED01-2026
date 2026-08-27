import java.util.Scanner;//2°Aula vetores e matrizes;

public class Aula05 {
    public static Scanner entrada = new Scanner(System.in);

    public static void PreencherMatriz(int [][] matriz/*, int valor */){
        int contador=1;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = contador;
                contador++;
            }
        }
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

    public static int[][] obterMatrizIdentidade(int ordem){
        int[][] matriz;
        matriz =  new int[ordem][ordem];

        PreencherMatriz(matriz/*, 0*/);

        for (int i=0; i <ordem; i++){
            matriz[i][i] = 1;
        }
        return matriz;
    }

    public static int[][] obterMatrizComBordaUm(int n_linhas, int n_colunas){
        int[][] matriz;

        matriz = new int[n_linhas][n_colunas];

        for(int j=0; j < n_colunas; j++){
            matriz[0][j] = 1;
            matriz[n_linhas-1][j] = 1;
        }

        for(int i=0; i < n_linhas; i++){
            matriz[i][0] = 1;
            matriz[i][n_colunas-1] = 1;
        }

        return matriz;
    }

    public static void main(String []args){

        int[][] m;

        m = new int[4][8];

        //int valor = 18;
        int n = 5;

        //PreencherMatriz(m/* , valor*/);

        //m = obterMatrizIdentidade(n);

        m = obterMatrizComBordaUm(m.length, m[0].length);

        mostrarMatriz(m);
        
        /*
        int[][] m;       
        m = new int[8][5];
        int valor = 45;
        m[0][0] = 10;
        m[0][1] = 11;
        m[1][0] = 20;
        m[1][1] = 21;
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                m[i][j] = valor;
            }
        }
        for (int i = 0; i < m.length; i++){
            System.out.print("[");
            for (int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j]);
                if (j < m[i].length - 1){
                    System.out.print(", "); 
                }
            }
            System.out.println("]");
        }
        */
    }
}