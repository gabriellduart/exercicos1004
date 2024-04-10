package estruturaCondicional;

import java.util.Scanner;

public class NotaAluno {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota1,nota2,nota3,nota4,media;
		
		System.out.println("Informe primeira nota ");
		nota1 = ler.nextDouble();
		
		System.out.println("Informe segunda nota ");
		nota2 = ler.nextDouble();
		
		System.out.println("Informe terceira nota ");
		nota3 = ler.nextDouble();
		
		System.out.println("Informe quarta nota ");
		nota4 = ler.nextDouble();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		String msg = media >=6 ? "Você esta aprovado, sua média é: " + media : "Você esta reprovado, sua média é: " + media;
		System.out.println(msg); // "Você esta reprovado!"

		ler.close();
	}

}
