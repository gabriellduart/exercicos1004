package estruturaCondicional;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double valor1,valor2,valor3,valor4,som,result,div;
		
		System.out.println("Informe primeiro valor:");
		valor1 = ler.nextDouble();
		System.out.println("Informe segundo valor:");
		valor2 = ler.nextDouble();
		System.out.println("Informe terceiro valor:");
		valor3 = ler.nextDouble();
		System.out.println("Informe quarto valor:");
		valor4 = ler.nextDouble();
		
		som = valor1 + valor2 + valor3 + valor4;
		div = som/4;
		
		if(div >= 6) {
			System.out.println("você foi aprovado, média: " + div);
		}	
		
		else {
			System.out.println("você foi reprovado, média:" + div);
		}
		
		
		
		
	
		

	}

}
