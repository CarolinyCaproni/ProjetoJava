package estrutura_decisao;

import java.util.Scanner;

public class ExemploIfEleseEncadeado {

	public static void main(String[] args) {
		// Variaveis
		float media;

		// Leia
		Scanner leia = new Scanner(System.in);

		// Entrada de dados
		System.out.println("Digite a sua média: ");
		media = leia.nextFloat();

		// Processamento
		if (media >= 6) {
			// Saida de dados
			System.out.println("Parabéns, você foi aprovade!");
		} else if (media >= 5){
			// Saida de dados alternativa
			System.out.println("Participante de Exame");
		} else {
			System.out.println("Infelizmente, você foi reprovade...");
		}

		leia.close();

	}

}
