import java.util.Scanner;

public class PraticaTabuadaEMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Tabuada ---");
        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = scanner.nextInt();

        int multiplicador = 1;
        while (multiplicador <= 10) {
            System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
            multiplicador++;
        }

        int opcao;
        do {
            System.out.println("\n--- Menu de Opções ---");
            System.out.println("1: Continuar");
            System.out.println("2: Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Escreva uma palavra ou frase: ");
                String texto = scanner.nextLine();
                System.out.println("Você digitou: " + texto);
            } else if (opcao == 2) {
                System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 2);

        scanner.close();
    }
}
