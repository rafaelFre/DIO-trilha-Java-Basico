public class App {
    public static void main(String[] args) throws Exception {
        int nota = 9;

        if (nota == 10) {
            System.out.println("Parabéns Nota Muito alta");
        } else if (nota >= 9) {
            System.out.println("quase tirou um 10 - Apro.");
        } else if (nota >= 6) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}