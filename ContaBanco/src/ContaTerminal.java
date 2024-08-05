import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        double saldo;
        String agencia, nomeCliente;

        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Por favor, digite o Número: ");
        numero = input.nextInt();
        
        System.out.print("Por favor, digite o número da Agência: ");
        agencia = input.next();

        input.nextLine();
        System.out.print("Por favor, digite o seu Nome: ");
        nomeCliente = input.nextLine();
        
        System.out.print("Por favor, digite o seu Saldo: ");
        saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + 
                            agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
