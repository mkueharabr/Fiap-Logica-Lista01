import java.util.Scanner;

public class TrocaValorEntreDuasVariaveis {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int varA, varB;
		
		System.out.println("Digite o valor da variável A: ");
		varA = leitor.nextInt();
				
		System.out.println("Digite o valor da variável B: ");
		varB = leitor.nextInt();
		
		varA = varB + varA;
		varB = varA - varB;
		varA = varA - varB;
		
		System.out.println("Valor de A: " + varA);
		System.out.println("Valor de B: " + varB);
		
		
		leitor.close();
	}

}
