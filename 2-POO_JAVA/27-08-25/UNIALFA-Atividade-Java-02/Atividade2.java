import java.util.Scanner;

public class Atividade2 {
public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu Peso (em Quilos): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua Altura (em Metros): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.print("Seu IMC é: " + imc);

        scanner.close();
    }
}
