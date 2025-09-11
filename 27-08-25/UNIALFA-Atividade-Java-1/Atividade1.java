import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        int resultado = numero1 * numero2 * numero3;
        System.out.print("O resultado da multiplicação é: " + resultado);
    
        scanner.close();
    }
}