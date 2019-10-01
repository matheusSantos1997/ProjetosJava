package pct_fonte15;

import java.util.Scanner;

public class projeto15 {

	public static void main(String[] args) {
		
		
		int semana;
		String nome = "Matheus"; 
		String RA = "D1943D7"; 
		String turma = "CC-2S";
		
		System.out.println("Dias da semana com Switch Case");
		
		System.out.println("-----------------------------------------");
		
		System.out.println("Meu nome eh: " + nome);
		
		System.out.println("Meu RA eh: " + RA);
		
		System.out.println("Minha turma eh: " + turma);
		
		System.out.println("-----------------------------------------");
		
		Scanner leteclado = new Scanner(System.in );
		
		System.out.printf("digite um número da semana: ");
		semana = leteclado.nextInt();
		
		System.out.println("-----------------------------------------");
		
		switch(semana)
		{
		case 1:
		System.out.println( "Segunda Feira");
		break;
		case 2:
		System.out.println("Terça Feira");
		break;
		case 3:
		System.out.println("Quarta Feira");
		break;
		case 4:
			System.out.println("Quinta Feira");
			break;
		case 5:
			System.out.println("Sexta Feira");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
		System.out.println("só é permitido números de 1 até 7!!");
		break;
		}
		
		leteclado.close();

	}

}
