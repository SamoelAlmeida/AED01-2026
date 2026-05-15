import java.util.Scanner;//Sistema de login de senha

public class AT02 {
    public static Scanner entrada = new Scanner(System.in);

    public static int LerSenha(String mensagem) {
        System.out.println(mensagem);
            do {
                int senha = entrada.nextInt();
                if (senha == 2002) {
                    return senha;
                } else {
                    System.out.println("Senha incorreta.");
                }
            } while (true);
    }

    public static void main(String[] args) {
        int senha = LerSenha("Digite a senha: ");
        System.out.println("Senha correta: " + senha);
    }
}