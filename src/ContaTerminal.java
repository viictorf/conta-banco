import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
   
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nomeCliente = scanner.next();

            System.out.println("Por favor, digite o número da Agência! ");
            String numeroAgencia = scanner.next();

            System.out.println("Digite o número da conta e pressione Enter");
            int numeroConta = scanner.nextInt();

            System.out.println("Realize um deposito: ");
            double saldoConta = scanner.nextDouble();
            scanner.close();
                System.out.println("olá, "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua Agencia é: " + numeroAgencia + ", Conta: " + numeroConta + " Saldo atual: " + saldoConta + " já disponivel para saque");
    }
}
