import java.util.Scanner;

public class Desafio2 {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os Pontos do Líder do Campeonato Brasileiro: ");
        int pontosLiderCampeonatoBrasileiro = scanner.nextInt();

        System.out.println("Digite os Pontos do Lanterna do Campeonato Brasileiro: ");
        int pontosLanternaCampeonatoBrasileiro = scanner.nextInt();

        double vitoriasNecessarias = (pontosLiderCampeonatoBrasileiro - pontosLanternaCampeonatoBrasileiro);

        double divisao = vitoriasNecessarias/3;

        int qtdVitoriasArredondadas = (int) Math.ceil((double) divisao);

        System.out.println("O Lanterna necessita de " + qtdVitoriasArredondadas + " Vitórias (" + qtdVitoriasArredondadas*3 + " pts ou mais) para ser Campeão Brasileiro");
	}
    
}
