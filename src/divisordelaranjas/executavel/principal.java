package divisordelaranjas.executavel;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {

		/* Strings com as perguntas */

		String laranjas = JOptionPane.showInputDialog("Quantas laranjas ser�o dividas?");
		String pessoas = JOptionPane.showInputDialog("Quantas pessoas s�o no total?");

		/* Converte os valores recebido pelas strings em n�meros */

		double totalLaranjas = Double.parseDouble(laranjas);
		double totalPessoas = Double.parseDouble(pessoas);

		/* Ope��o matem�tica, pega o total de laranjas e divide pelo total de pessoas */

		int resultado = (int) (totalLaranjas / totalPessoas);

		/* Opera��o respons�vel pela resto da divis�o(%) */

		double resto = totalLaranjas % totalPessoas;

		/*
		 * Essa linha � respons�vel pela pergunta se � para realmente continuar a opera��o
		 */

		int resposta = JOptionPane.showConfirmDialog(null, "Voc� realmente deseja realizar essa opera��o?");
		/*
		 * Esse IF ele confere se a RESPOSTA for igual a 0,  continua, se n�o a opera��o n�o � realizada
		 * 0 no JOptionPane � SIM 
		 * Caso a op��o selecionada seja N�O a opera��o n�o � realizada
		 */

		if (resposta == 0) {

			JOptionPane.showMessageDialog(null, "O total para cada pessoa(s) �: " + resultado + " laranja(s)");

		} else {
			
			JOptionPane.showMessageDialog(null, "Opera��o n�o realizada!");

		}

		/*
		 * Essa linha � respons�vel pela pergunta se � para realmente continuar a opera��o
		 */
		
		int respostaResto = JOptionPane.showConfirmDialog(null, "Voc� deseja realmente ver o resto da divis�o?");

		/*
		 * Esse IF ele confere se a RESPOSTA for igual a 0,  continua, se n�o a opera��o n�o � realizada
		 * 0 no JOptionPane � SIM 
		 * Caso a op��o selecionada seja N�O a opera��o n�o � realizada
		 */
		
		if (respostaResto == 0) {

			JOptionPane.showMessageDialog(null, "O resto da divis�o � de: " + resto + " laranja(s)");
		
		} else {
		
			JOptionPane.showMessageDialog(null, "Opera��o n�o realizada!");
		}

	}

}
