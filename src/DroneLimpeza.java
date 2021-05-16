import java.util.Scanner;

public class DroneLimpeza {

	public static void main(String[] args) {
		// Dado 3 lixos, informar ao drone de limpeza qual o lixo de menor peso que deve ser carregado
		Scanner leitor = new Scanner(System.in);
		double pesoLixo1, pesoLixo2, pesoLixo3, pesoCarregar;
		
		System.out.println("Informe o peso do lixo 1: ");
		pesoLixo1 = leitor.nextDouble();
		
		System.out.println("Informe o peso do lixo 2: ");
		pesoLixo2 = leitor.nextDouble();
		
		System.out.println("Informe o peso do lixo 3: ");
		pesoLixo3 = leitor.nextDouble();
		
		if (pesoLixo1 <= pesoLixo2 && pesoLixo1 <= pesoLixo3) {
			System.out.println("Carregar o lixo 1");
		} else if (pesoLixo2 <= pesoLixo1 && pesoLixo2 <= pesoLixo3) {
			System.out.println("Carregar o lixo 2");
		} else {
			System.out.println("Carregar o lixo 3");
		}
		
		leitor.close();
	}

}
