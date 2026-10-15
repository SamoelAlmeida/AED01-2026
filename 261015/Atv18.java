import java.util.LinkedList;
import java.util.Scanner;

public class Atv18 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String []args){
        LinkedList<String> lista = new LinkedList<>();
        boolean V1=true;

        while (V1) {
            int opc;

            System.out.println("\n=====");
            System.out.println("Add(1)");
            System.out.println("Del(2)");
            System.out.println("Fechar(3)");
            System.out.println("=====");
            System.out.print("\nOpção: ");

            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    System.out.print("\nNome a ser adicionado: ");
                    String nome = sc.nextLine();
                    lista.add(nome);
                    break;

                case 2:
                    if (lista.isEmpty()){
                        System.out.println("\nA lista está vazia");
                    }
                    else {
                        System.out.println(lista);
                        System.out.print("\nNome a ser removido: ");
                        String Remover = sc.nextLine();
                        boolean removido = lista.remove(Remover);
                        
                        if (removido) {
                            System.out.println("\n'" + Remover + "' foi removido");
                        } else {
                            System.out.println("\nNome não encontrado");
                        }
                    }
                    break;

                case 3:
                    V1 = false;
                    break;

                default:
                    System.out.println("\nInválido");
                    break;
            }
        }
    }
}