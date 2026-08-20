import java.util.Scanner;//1°Aula de String

public class Aula02 {
    public static Scanner entrada = new Scanner(System.in);

    public static int contarVogal(String s){
        int qtdeVogal=0;
        for (int i=0; i<s.length(); i++){  
            switch(s.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    qtdeVogal++;
                break;
            }
            
            
            /*metodo diferente,  resultado igual ao metodo anterior
            if (s.charAt(i) == 'a'|
                s.charAt(i) == 'e'|
                s.charAt(i) == 'i'|
                s.charAt(i) == 'o'|
                s.charAt(i) == 'u'){
                qtdeVogal++;
            }
            */
        }

        return qtdeVogal;
    }

    public static String inverter(String s){
        String invertida = "";

        for (int i = s.length()-1; i >= 0; i--){
            invertida = invertida + s.charAt(i);
        }

        return invertida;
    }

    public static String removerEspacos(String s){
        String resultado = "";

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) !=  ' '){
                resultado = resultado + s.charAt(i); 
            }
        }

        return resultado;
    }

    public static boolean testarPalindromo(String s){
        boolean palindromo = true;

        s = removerEspacos(s).toLowerCase();

        int inicio = 0;
        int fim = s.length() - 1;

        while (inicio < fim) {
            if (s.charAt(inicio) != s.charAt(fim)) {
                palindromo = false;
                break;
            }
            inicio++;
            fim--;
        }

        return palindromo;
    }
    public static void main(String []args) {
        String palavra = "o lobo ama o bolo";
        int nVogal;

        System.out.println(palavra);//Apenas fala a palavra   

        nVogal = contarVogal(palavra);//Conta as vogais da palavra
        System.out.println(palavra + " possui " + nVogal + " vogais");

        for(int i=0; i<palavra.length(); i++){//Soletra a palavra 
            System.out.println(palavra.charAt(i));
        }                                                             

        System.out.println(palavra.toUpperCase());//String com texto completo em maiusculo
        System.out.println(palavra.toLowerCase());//String com texto completo em minusculo      

        System.out.println(palavra.substring(0,6));//Flitro de apartir e quantas letras falar
        
        System.out.println(inverter(palavra));//Inverte a palavra
        
        System.out.println(removerEspacos(palavra));//tira espaços
        
        System.out.println("A palavra " + palavra + " é palindromo? " + testarPalindromo(palavra));//Teste para palavras palindromas

    }
}