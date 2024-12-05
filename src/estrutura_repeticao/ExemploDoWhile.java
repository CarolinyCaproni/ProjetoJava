package estrutura_repeticao;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		// Variaveis
		int numero, resultado, contador = 3;
		
		// Leia
        Scanner leia = new Scanner(System.in);
        
        //Bloco de repetição (garante que o codigo seja executado pelo menos uma vez)
        do {
        	// Entrada de dados
            System.out.println("\nDigite um número inteiro: ");
            numero = leia.nextInt();

            // Processamento
            resultado = numero * 5;
            
            // Saida de dados
            System.out.println("\nO resultado da multiplicação é: " + resultado);

        } while (contador <= 2); // O contador ja vale 3 por isso não repete

	}

}
