package pct_fonte41;

import java.util.Scanner;
public class Exercicio41 {

	public static void main(String[] args) {
		
		int numero;
		
		
        
		Scanner leteclado = new Scanner(System.in);
		
		
	    
		
		
		do {
			System.out.println("digite um número de 0 a 12: ");
			numero = leteclado.nextInt();
			
			switch(numero) {
			
				case 0:
					System.out.println("O PROGRAMA VAI PARAR!!");
				break;
				case 1:
				    System.out.println("janeiro");
				break;
				case 2:
					System.out.println("Fevereiro");
				break;
				case 3:
					System.out.println("Março");
				break;
				case 4:
					System.out.println("Abril");
				break;
				case 5:
					System.out.println("Maio");
				break;
				case 6:
					System.out.println("Junho");
				break;
				case 7:
					System.out.println("Julho");
				break;
				case 8:
					System.out.println("Agosto");
				break;
				case 9:
					System.out.println("Setembro");
				break;
				case 10:
					System.out.println("Outubro");
				break;
				case 11:
					System.out.println("Novembro");
				break;
				case 12:
					System.out.println("Dezembro");
				break;
				default:
					System.out.println("mês indefinido");
					break;
					
			}
			
			
		} while(numero != 0);
		
		leteclado.close();
	}

}
