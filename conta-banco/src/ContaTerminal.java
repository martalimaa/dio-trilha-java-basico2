import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) { 
            try (//criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale. US)) {
            double saldo = 237.48;
            
                System.out.println("Olá, seja bem-vindo ao Metal Bank!");
                   //Solicita o nome completo
                   
                System.out.println("Por favor, digite seu nome completo: ");
                String nomeCompletoCliente = scanner.nextLine();
                    //Solicita o número da Agência
                 System.out.println("Por favor, digite o número da Agência: ");
                  int numeroAgencia = scanner.nextInt();
                   //Solicita o número da conta
                 System.out.println("Digita o número da sua conta: ");
                  int numeroConta = scanner.nextInt();   
                   //imprimindo os dados obtidos pelo usuário
            System.out.println("Olá, " +  nomeCompletoCliente + " obrigado por criar uma conta em nosso banco");
            System.out.println("sua agência é " + numeroAgencia + " , conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque. ");
        }

       
        






    }
}
