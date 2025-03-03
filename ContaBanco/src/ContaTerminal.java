import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        //Solitacação dos  Dados 

        System.out.println("Por favor , digite o numero da Agencia ");
        int agencia = scanner.nextLine();

        System.out.println("Por favor digite o número da conta: ");
        int numeroConta = scanner.nextLine();
        scanner.nextLine(); // Consumir a quebra de linha 

        System.out.println("Por favor, digite o nome do Cliente : ");
        String nomeClinte = scanner.nextLine();

        System.out.println("Por favor , Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        //Exibir mensagem 

        



    }
}
