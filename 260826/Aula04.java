import java.util.Scanner;//Aula vetores e matrizes;

public class Aula04 {
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



    public static void main(String []args){

        int[][] m;

        m = new int[3][3];

        //int valor = 18;

        PreencherMatriz(m/* , valor*/);

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