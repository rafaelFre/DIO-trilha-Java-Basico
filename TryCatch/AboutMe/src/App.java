import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try {
            // Entrada de dados pelo usuário...
            System.out.println("Digite seu nome: ");
            String nome = scanner.next(); // Leitura do nome

            System.out.println("Digite seu Sobrenome: ");
            String Sobrenome = scanner.next(); // Leitura do nome

            // Limpeza do buffer para a próxima entrada
            scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt(); // Leitura da idade

            System.out.println("Digite sua altura: ");
            Double altura = scanner.nextDouble(); // Leitura da altura

            // Imprimindo os dados obtidos pelo usuário
            System.out.println("\nOlá, me chamo " + nome.toUpperCase() + Sobrenome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é: " + altura + " cm");

        } catch (InputMismatchException e) {
            System.out.println("O campos idade e altura prescisam ser numericos");
        } finally {
            scanner.close();
        }

    }
}
