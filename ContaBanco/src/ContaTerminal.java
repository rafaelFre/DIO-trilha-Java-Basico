import java.util.Scanner;
import java.util.Locale;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        //Solitacação dos  Dados 

        System.out.println("Por favor , digite o numero da Agencia ");
        String agencia = scanner.nextLine();

        

        System.out.println("Por favor digite o número da conta: ");
        String  numeroConta = scanner.nextLine();
       

        System.out.println("Por favor, digite o nome do Cliente : ");
        String nomeClinte = scanner.nextLine();

        System.out.println("Por favor , Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        //Exibir mensagem 

        String mensagem  = "Olá " + nomeClinte + ", obrigado por criar uma conta em nosso banco , sua Agencia é :" +  agencia + "e numero da conta : "+ numeroConta +"aldo atual:  " + saldo + "Ja esta disponivel para saque.";
        

        System.out.println(mensagem);
        scanner.close();


    }
}
