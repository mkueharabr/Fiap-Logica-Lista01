import java.util.Scanner;

public class RoboCombate {

	public static void main(String[] args) {
		// O robo deve ativar a arma se o inimigo estiver a uma distância menor de 70 cm
		Scanner leitor = new Scanner(System.in);
		double distancia;

		System.out.println("Informe a distância em centimetros do inimigo: ");
		distancia = leitor.nextDouble();
		
		if (distancia < 70) {
			System.out.println("ATIVADO");
		} else {
			System.out.println("DESATIVADO");
		}
		
		leitor.close();
				
	}

}
