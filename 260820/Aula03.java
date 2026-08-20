import java.util.Scanner;//2°Aula de String 

public class Aula03 {
    public static Scanner entrada = new Scanner(System.in);

    public static boolean validarSenha(String s) {
        boolean tam = s.length() >= 6 && s.length() <= 12;
        boolean maiuscula = false, digito = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') maiuscula = true;
            if (c >= '0' && c <= '9') digito = true;
        }

        return tam && maiuscula && digito;
    }

    public static void main(String[] args) {
        String senha = "Java123";
        System.out.println(validarSenha(senha));







    }
}