import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Desafio1 {
	public static void main(String[] args) {

        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(streamReader);


        try {
                System.out.println("Digite o Valor do Produto: ");
                double valorProduto = Double.parseDouble(reader.readLine());
                
                System.out.println("Digite a Porcentagem de Desconto: ");
                double valorDesconto = Double.parseDouble(reader.readLine());

                double valorDescontoPorProduto = (valorProduto * valorDesconto) / 100;

                double valorFinal = valorProduto - valorDescontoPorProduto;
                System.out.println("O valor do Produto com o Desconto é de " + valorFinal + " R$");


        } catch (IOException e ){
                System.out.println("Ocorreu um erro na entrada de dados.");
        }

        

	}
    
}
