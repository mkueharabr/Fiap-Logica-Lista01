import java.util.Scanner;

public class CalculaIdade {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		// Dado um ano de nascimento, calcule a idade que uma pessoa terá em 31/12/2021
		
		int idade, anoNascimento;
		System.out.println("Informe o ano de nascimento: ");
		anoNascimento = leitor.nextInt();
		
		if (anoNascimento <= 2021) {
			idade = 2021 - anoNascimento;
			System.out.println("Em 31/12/2021 você terá " + idade + " anos");
		} else {
			System.out.println("Por favor informe um ano de nascimento menor ou igual a 2021");
		}
		
		
		leitor.close();
		
	}

}
