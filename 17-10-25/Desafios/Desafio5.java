import javax.swing.JOptionPane;

public class Desafio5 {

	public static void main(String[] args) {

        String valor1 = JOptionPane.showInputDialog("Digite sua Idade: ");
        int idade = Integer.parseInt(valor1);

        String sexo = JOptionPane.showInputDialog("Informe seu sexo (com M/F): ");

        String valor2 = JOptionPane.showInputDialog("Digite seus Anos de Contribuição: ");
        int anosDeContribuicao = Integer.parseInt(valor2);

        if (sexo.equals("M")){
            if (idade < 65 && anosDeContribuicao < 35){
                int anosFaltando = 35 - anosDeContribuicao;
                JOptionPane.showMessageDialog(null, "Faltam " + anosFaltando + " anos para se aposentar.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Você já tem o direito a aposentadoria");
            }
        } 
        else if (sexo.equals("F")) {
            if (idade < 60 && anosDeContribuicao < 30){
                int anosFaltando = 30 - anosDeContribuicao;
                JOptionPane.showMessageDialog(null, "Faltam " + anosFaltando + " anos para se aposentar.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Você já tem o direito a aposentadoria");
            }
        } else {
            JOptionPane.showMessageDialog(null, "O Sexo Informado não é válido.");
        }

    }
}
