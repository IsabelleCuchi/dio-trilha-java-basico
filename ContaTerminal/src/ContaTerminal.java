import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Informe seu nome: ");
        String cliente = scanner.next();
        scanner.nextLine();

        System.out.println("Informe o número de sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Informe o saldo atual: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}