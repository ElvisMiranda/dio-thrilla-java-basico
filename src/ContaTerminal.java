import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Por favor, digite o número da Agência!:");
            String Agencia = scanner.nextLine();
            
            System.out.println("Por favor, digite o número do Usuario!:");
            int Numero = scanner.nextInt();

            System.out.println("Por favor, digite o Nome do Cliente!:");
            String NomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o Saldo!:");
            float Saldo = scanner.nextFloat();

            
            System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque"
                , NomeCliente, Agencia, Numero, Saldo));
        }
    }
}
