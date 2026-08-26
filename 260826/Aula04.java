import java.util.Scanner;//vetores;

public class Aula04 {
    public static Scanner entrada = new Scanner(System.in);



    public static void main(String []args){
    int[][] m;       

    m = new int[2][2];

    m[0][0] = 10;
    m[0][1] = 11;
    m[1][0] = 20;
    m[1][1] = 21;


    for (int i=0; i < m.length; i++){
        System.out.print("[");

        for (int j=0; j < m[i].length; j++){
            System.out.print(m[i][j]);

            if (j < m[i].length - 1){
                System.out.print(", "); 
            }
        }
        System.out.println("]");
    }
    }
}



    

