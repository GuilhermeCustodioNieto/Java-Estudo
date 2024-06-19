import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) {

            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
              limiteDiario -= valorSaque;
              System.out.printf("Saque realizado. Limite restante: %.1f", limiteDiario);
                // TODO: Atualizar o limite diário e imprimir a saída no formato dos exemplos.
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}