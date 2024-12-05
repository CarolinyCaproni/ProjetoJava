package estrutura_repeticao;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		// Variaveis
		String continua = "s";
		int numero1, numero2, resultado;
		
		// Leia
		Scanner leia = new Scanner(System.in);

		// Estrutura de repetição While
		// ! é no não, quando a gente quer inverter a condição
		while (!continua.equals("n")) {
			// Entrada de dados
			System.out.println("Digite primeiro valor: ");
			numero1 = leia.nextInt();

			System.out.println("Digite segundo valor: ");
			numero2 = leia.nextInt();
			
			// Processamento
			resultado = numero1 + numero2;
			
			// Saida de dados
			System.out.println("O resultado da soma é: " + resultado);

			// Menu de S ou N para estruturar a repetição
			System.out.println("\n++++++++++++++++MENU++++++++++++++++++");
			System.out.println("\nDeseja somar dois valores?");
			System.out.println("\nDigite S para sim OU digite N para não: ");
			continua = leia.next();
			System.out.println("++++++++++++++++++++++++++++++++++");
		}
	}

}
