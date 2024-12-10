package metodos;

public class ExemploMetodos {

	public static void main(String[] args) {
		
		int resultado = somar(2,5);
		System.out.println("O primeiro resultado é: " + resultado);
		
		System.out.println("O segundo resultado é: " + somar(8,3));
		
		falar("Pode ser, Bom dia");
		falar("O gato amarelo");
		
		ExemploMetodoExterno.mensagem();

	}
	
	// Definição do Método somar - Método Com Retorno e Com Parametro
	public static int somar(int x, int y) {
		return x + y;
	}
	
	// Defiição de Método Falar - Método Sem Retorno e Com Parametro
	public static void falar(String mensagem) {
		System.out.println(mensagem);
	}

}
