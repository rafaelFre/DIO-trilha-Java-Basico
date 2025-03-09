import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Entrada de dados pelo usuario...
        System.out.println("Digite seu nome ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome ");
        String Sobbrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        String idade= scanner.next();

        System.out.println("Digite sua Altura ");
        String altura = scanner.next();

        // imprimindo os dados obtidos pelo usuario

        System.out.println("\nOlá,  me chamo, " + nome.toUpperCase() + "");
        System.out.println("Tenho " + idade + " Anos");
        System.out.println("Minha altura é: " + altura + " cm");
        scanner.close();

    }
}
