public class BreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 10; numero++) { // Declaração da variável 'numero'
            if (numero == 5) {
                System.out.println("Número 5 encontrado, pulando a iteração com continue.");
                continue; // Pula a iteração atual quando numero for 5
            }
            
            if (numero == 8) {
                System.out.println("Número 8 encontrado, saindo do loop com break.");
                break; // Sai do loop quando numero for 8
            }

            System.out.println("Número: " + numero);
        }
    }
}
