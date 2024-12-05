package estrutura_repeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		// Variaveis
		String nome;
		int contador;
		
		// Leia
        Scanner leia = new Scanner(System.in);
             
        // Estrutura do laço de repetição FOR 
        // contador + 1 ou contador++
        for (contador = 1; contador < 4; contador = contador + 1) {
        	// Código que vai ser repetido:
        	// Entrada de dados
        	System.out.println("Digite o " + contador + "º nome: ");
            nome = leia.nextLine();
            // Saida de dados
            System.out.println("O " + contador + "º nome é: " + nome);
                   	
        }

	}

}
