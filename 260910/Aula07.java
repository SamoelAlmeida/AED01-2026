//import java.io.FileWriter; //Aula arquivos
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
public class Aula07 {
/*
    public static void ciclo(){
        try {
            FileWriter arq = new FileWriter("dados.txt", true);
            for (int i=1; i <= 5; i++){
            arq.write("Aula pós-true "+ i +"\n");
            }
             arq.close();
        } catch(IOException e) {
            System.err.println("Erro no arquivo");
        }
    }
*/    
    public static void lerArq(){
        try{
            FileReader arquivo = new FileReader("dados.txt");
            Scanner entrada = new Scanner(arquivo); 
        
            int valor;
        
            while(entrada.hasNext()){
                valor = entrada.nextInt();            
                System.out.println(valor);           
            }

            entrada.close();

        } catch(IOException e) {
            System.err.println("Erro no arquivo");
        }
    }

    public static void main(String []args){
        //ciclo();
        lerArq();
    }
}