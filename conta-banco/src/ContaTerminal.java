import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados

        //Exibir a mensagem conta criada

        //Criando o objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Entrar com os dados da conta bancária
        System.out.println("Digite a sua conta bancária");
        int numero = scanner.nextInt();
        //Entrar com os dados da agência
        System.out.println("Digite a sua agência bancária");
        String agencia = scanner.next();
        //Entrar com os dados do cliente
        System.out.println("Digite o seu nome");
        String nome = scanner.next();
        //Entrar com os dados do saldo
        System.out.println("Digite o seu saldo");
        double saldo = scanner.nextDouble();

        //Imprimindo os dados digitado pelo usuário

        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque");
    }
}
