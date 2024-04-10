package estruturaCondicional;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int dom,seg,ter,qua,qui,sex,sab,dia,numero;
		
		System.out.println("Digite o numero do dia da semana: ");
		numero = ler.nextInt();
		
		if (numero == 1){ 
			System.out.println("O dia é Domingo");
		}
		else if (numero == 2) {
			System.out.println("O dia é segunda");
		}
		else if (numero == 3) {
			System.out.println("O dia é terça");
		}
		else if (numero == 4) {
			System.out.println("O dia é quarta");
		}
		else if (numero == 5) {
			System.out.println("O dia da é quinta");
		}
		else if (numero == 6) {
			System.out.println("O dia é sexta");
		}
		else if (numero == 7) {
			System.out.println("O dia é sabado");
		}
		else {
			System.out.println("O numero é invalido");
		}
	}

}
