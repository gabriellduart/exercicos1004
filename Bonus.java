package estruturaCondicional;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		double anos,bonus,salario;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe quantos anos você trabalha na empresa: ");
		anos = ler.nextDouble();
		
		if (anos >3) {
			System.out.println("Você deve receber 7% de bonus");
			
		}
		else {
			System.out.println("Você deve receber 5% de bonus");
		}
	}

}
