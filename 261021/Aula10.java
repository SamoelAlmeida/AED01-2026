import java.util.LinkedList;
import java.util.Queue;

public class Aula10 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
 
        // -------------------------
        // inserir(x): adiciona no final
        // -------------------------
        fila.add("A"); // inserir("A")
        fila.add("B"); // inserir("B")
        fila.add("C"); // inserir("C")
        System.out.println("Após inserir: " + fila); // [A, B, C]

        // -------------------------
        // consultar(): retorna o início sem remover
        // -------------------------
        System.out.println("consultar(): " + fila.peek()); // A

        // -------------------------
        // retirar(): remove o início
        // -------------------------
        String removido = fila.poll(); // retirar()
        System.out.println("retirar(): " + removido);
        System.out.println("Após retirar: " + fila); // [B, C]

        // -------------------------
        // estaVazia(): verifica se a fila está vazia
        // -------------------------
        System.out.println("estaVazia(): " + fila.isEmpty()); // false

        // -------------------------
        // Retira todos os elementos da fila
        // -------------------------
        while(!fila.isEmpty()){
            System.out.println("retirar(): " + fila.poll());
        }

        // -------------------------
        // estaVazia(): verifica se a fila está vazia
        // -------------------------
        System.out.println("estaVazia(): " + fila.isEmpty()); // false
        
    }
}