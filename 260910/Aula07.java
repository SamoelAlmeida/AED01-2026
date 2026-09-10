import java.util.Scanner;//Aula arquivos
import java.io.FileWriter;
import java.io.IOException;

public class Aula07 {

    public static void ciclo(){
        try {
            FileWriter arq = new FileWriter("dados.txt");
            for (int i=1; i <= 25; i++){
            arq.write("Aula de AED "+ i +"\n");
            }
             arq.close();
        } catch(IOException e) {
            System.err.println("Erro no arquivo");
        }
    }

    public static void main(String []args){
        ciclo();
    }
}