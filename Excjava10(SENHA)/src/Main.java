import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int senhaCorreta = 2002;

		Scanner sc = new Scanner(System.in);

		int tentativa = 3;

		while (tentativa > 0) {
			System.out.println("Por favor, digite a senha: ");
			int senhaDigitada = sc.nextInt();

			if (senhaDigitada == senhaCorreta) {
				System.out.println("\nBem-Vindo, Wendel :D");
				break;
			} 
			else {
				tentativa = tentativa - 1;
				System.out.println("\nSenha Invalida. " + tentativa + " tentativa(s) restante(s)");
			}

		}

		if (tentativa == 0) {
			System.out.println("\nLimite de tentativas excedido. Acesso negado.");
		}
		else {
			System.out.println("\nAcesso Permitido");
		}
		

		sc.close();

	}

}
