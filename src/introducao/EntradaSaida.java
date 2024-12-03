package introducao;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		// Variaveis
		String nome;
		float temperatura;
		float fahrenheit;
		
		// Construindo o leio
		Scanner leia = new Scanner(System.in);
		
		// Inserir o nome, temperatura (entrada de dados)
		System.out.println("Insira o seu nome: ");
		nome = leia.next();
		
		System.out.println("Insira a temperatura em Celsius: ");
		temperatura = leia.nextFloat();
		
		// Processamento
		fahrenheit = temperatura * 1.8f + 32;
		
		// Saida dos dados
		System.out.println("Bom dia, " + nome);
		System.out.printf("A temperatura em Fahrenheit é: " + fahrenheit + "°F"); // Concatenação
		

	}

}
