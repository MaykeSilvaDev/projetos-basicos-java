import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Solicitando informações dos Usuários //

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        String numeroStr = scanner.nextLine();
        int numero = Integer.parseInt(numeroStr);

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.print("Por favor, digite o saldo: ");
        String saldoStr = scanner.nextLine();
        double saldo = Double.parseDouble(saldoStr);

        // Exibição da mensagem com as informações fornecidas //
        String mensagem = "Olá, " + nomeCliente + ". Obrigado por criar uma conta em nosso banco. Sua agência é: " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        scanner.close();
    }
}

