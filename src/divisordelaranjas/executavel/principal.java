package divisordelaranjas.executavel;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {

		/* Strings com as perguntas */

		String laranjas = JOptionPane.showInputDialog("Quantas laranjas serão dividas?");
		String pessoas = JOptionPane.showInputDialog("Quantas pessoas são no total?");

		/* Converte os valores recebido pelas strings em números */

		double totalLaranjas = Double.parseDouble(laranjas);
		double totalPessoas = Double.parseDouble(pessoas);

		/* Opeção matemática, pega o total de laranjas e divide pelo total de pessoas */

		int resultado = (int) (totalLaranjas / totalPessoas);

		/* Operação responsável pela resto da divisão(%) */

		double resto = totalLaranjas % totalPessoas;

		/*
		 * Essa linha é responsável pela pergunta se é para realmente continuar a operação
		 */

		int resposta = JOptionPane.showConfirmDialog(null, "Você realmente deseja realizar essa operação?");
		/*
		 * Esse IF ele confere se a RESPOSTA for igual a 0,  continua, se não a operação não é realizada
		 * 0 no JOptionPane é SIM 
		 * Caso a opção selecionada seja NÃO a operação não é realizada
		 */

		if (resposta == 0) {

			JOptionPane.showMessageDialog(null, "O total para cada pessoa(s) é: " + resultado + " laranja(s)");

		} else {
			
			JOptionPane.showMessageDialog(null, "Operação não realizada!");

		}

		/*
		 * Essa linha é responsável pela pergunta se é para realmente continuar a operação
		 */
		
		int respostaResto = JOptionPane.showConfirmDialog(null, "Você deseja realmente ver o resto da divisão?");

		/*
		 * Esse IF ele confere se a RESPOSTA for igual a 0,  continua, se não a operação não é realizada
		 * 0 no JOptionPane é SIM 
		 * Caso a opção selecionada seja NÃO a operação não é realizada
		 */
		
		if (respostaResto == 0) {

			JOptionPane.showMessageDialog(null, "O resto da divisão é de: " + resto + " laranja(s)");
		
		} else {
		
			JOptionPane.showMessageDialog(null, "Operação não realizada!");
		}

	}

}
