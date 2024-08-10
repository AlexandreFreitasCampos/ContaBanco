import java.util.Scanner;

public class ContaTerminal {
    private static int numero;
    private static String agencia;
    private static String nomeCliente;
    private static double saldo;

    public static void main(String[] args) throws Exception {
        ContaTerminal terminal = new ContaTerminal();
        terminal.cadastrarInformacoes();
        terminal.exibirCadastro();
    }

    public void cadastrarInformacoes(){
        System.out.println("Olá seja bem vindo, vamos iniciar seu cadastro!!!");

        System.out.println("Por favor, digite o número da conta:");
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Por favor, digite a agência no formato 000-0:");
        agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o seu nome:");
        nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o seu saldo:");
        saldo = scanner.nextDouble();
        scanner.nextLine();
        scanner.close();
    }

    public void exibirCadastro(){
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, seguem os dados:");
        System.out.println("Agência: " + agencia + "\nConta número: " + numero + "\nSaldo: " + saldo + " já está disponível para saque.");
    }
}
