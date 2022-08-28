import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) {
       //todo: conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
       //exibir as mensagens para o nosso usuário e obter pela scanner os valores digitados no terminal
        System.out.println("Por favor, informe o seu nome");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o numero da sua Agência");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o numero da sua Conta");
        int conta = scanner.nextInt();

        System.out.println("Por favor, informe o saldo adicionado a sua Conta");
        float saldo = scanner.nextFloat();
       //exibir a mensagem de conta criada

        System.out.println("Olá " +nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta +" e seu saldo " + saldo +" já está disponível para saque");
        

    
    }
}
