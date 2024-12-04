package estrutura_decisao;

public class ExemploString {

	public static void main(String[] args) {
		// Variaveis
		String nome = "Turma 79";

		// equals => igual para String's
		if (nome.equals("Turma 79")) {
			System.out.println("Foi");
		}

		// equalsIgnoreCase => igual para String's que ignora letras maiusculas e
		// minusculas
		if (nome.equalsIgnoreCase("Turma 79")) {
			System.out.println("Foi");
		}

	}

}
