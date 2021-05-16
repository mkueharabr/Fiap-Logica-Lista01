import java.util.Scanner;

public class CalculaCompra {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double valorDesconto = 3.0;
		double valorCompra, valorFinal;
		String cupomDesconto;
		
		System.out.println("Informe o valor total da compra: ");
		valorCompra = leitor.nextDouble();
		
		System.out.println("Informe o cupom: ");
		cupomDesconto = leitor.next();
		
		if(cupomDesconto.equalsIgnoreCase("DIADEFESTA")) {
			valorFinal = valorCompra * ((100 - valorDesconto)/100);
		} else {
			valorFinal = valorCompra;
		}
		
		System.out.println("Valor a pagar: " + valorFinal);
		
		leitor.close();
			
	}

}
