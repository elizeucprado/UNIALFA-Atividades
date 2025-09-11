import static java.lang.Math.sin;
import java.util.Scanner;

public class Atividade5 {
    private static final double G = 9.8;

    public static double selecionarVelocidade(Scanner scanner) {
        while (true) {
            System.out.println("\nEscolha o tanque:");
            System.out.println("1 - M1 Abrams (~1700m/s)");
            System.out.println("2 - Obuseiro M109 (~600m/s)");
            System.out.println("3 - Schwerer Gustav (~820m/s)");
            System.out.print("Digite o número da opção desejada: ");
            String opcao = scanner.nextLine().trim();

            switch (opcao) {
                case "1": return 1700.0;
                case "2": return 600.0;
                case "3": return 820.0;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static double lerAngulo(Scanner scanner) {
        while (true) {
            System.out.print("Digite o ângulo de lançamento (0 a 90 graus): ");
            if (scanner.hasNextDouble()) {
                double angulo = scanner.nextDouble();
                scanner.nextLine(); // Limpa o buffer
                if (angulo > 0 && angulo < 90) {
                    return angulo;
                } else {
                    System.out.println("Ângulo deve ser entre 0 e 90 graus (exclusivo).");
                }
            } else {
                System.out.println("Valor inválido. Digite um número.");
                scanner.nextLine(); // Limpa o buffer
            }
        }
    }

    public static double calcularAlcance(double v0, double angulo) {
        double rad = Math.toRadians(angulo); // Converte para radianos
        return (v0 * v0 * sin(2 * rad)) / G;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            double v0 = selecionarVelocidade(scanner);
            double angulo = lerAngulo(scanner);
            double alcance = calcularAlcance(v0, angulo);

            System.out.printf(
                "Para velocidade inicial = %.1f m/s e ângulo = %.1f°, o alcance é de %.2f km.%n",
                v0, angulo, alcance / 1000.0
            );

            System.out.print("Deseja calcular novamente? (s/n): ");
        } while (scanner.nextLine().trim().equalsIgnoreCase("s"));

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}