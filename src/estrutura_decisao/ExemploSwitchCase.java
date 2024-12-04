package estrutura_decisao;

import java.util.Scanner;

public class ExemploSwitchCase {

	public static void main(String[] args) {
		// Variaveis
		int opcao;

		// Leia
		Scanner leia = new Scanner(System.in);

		// Enradas de dados
		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
		System.out.println("\n--Digite 1 para ver Indicação de um Livro--");
		System.out.println("--Digite 2 para ver ler uma Frase Motivacional--");
		System.out.println("--Digite 3 para receber uma Indicação de música--");
		opcao = leia.nextInt();

		// Processamento de dados
		switch (opcao) {
		
		case 1:
			// Saida de dados 1
			System.out.println("Livro: Guia do Mochileiro das Galáxias - Douglas Adams");
			break;
		
		case 2:
			// Saida de dados 2
			System.out.println("Frase motivacional: Se você cair, levante! Não dá para andar deitado.");
			break;
		
		case 3:
			// Saida de dados 3
			System.out.println("Música: Follow You - Bring Me The Horizon");
			break;
		
		default: 
			// Saida caso todas as outras opções forem inválidas
			System.out.println("Opção Inválida");
		}

		leia.close();

	}

}
