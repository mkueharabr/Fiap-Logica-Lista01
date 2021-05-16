import java.util.Scanner;

public class CalculaTempoHorasOuSegundos {

	public static void main(String[] args) {
		// Dado a duração de um filme em minutos, informe a duração do mesmo em horas e segundos
		Scanner leitor = new Scanner(System.in);
		double tempoMinuto, duracaoHora, duracaoSegundo;
		
		System.out.println("Informe a duração do filme em minutos: ");
		tempoMinuto = leitor.nextDouble();
		
		duracaoHora = tempoMinuto / 60;
		duracaoSegundo = tempoMinuto * 60;
		
		System.out.println("O filme tem duração de " + duracaoHora + 
				" hora(s) ou " + duracaoSegundo + " segundos");
		
		leitor.close();
	}

}
