package pct_fonte14;

import java.util.Scanner;

public class projeto14 {

	public static void main(String[] args) {
		  
		int numero1 = 2;
		int numero2 = 4;
		int resultado;
		
		Scanner input = new Scanner(System.in );
		
		System.out.println("Verificação de dois números múltiplos!");
		System.out.println("------------------------------------------------");
		
		System.out.print("digite o primeiro número: ");
		numero1 = input.nextInt();
		
		System.out.println("------------------------------------------------");
		
		System.out.print("digite o segundo número: ");
		numero2 = input.nextInt();
		
		resultado = (numero1 * numero2);
		
		if((resultado == 2 * 4) != false) {
			System.out.println("o resultado é: " + resultado + "\nos números são multiplos!!");
		} 
		else {
			System.out.println("o resultado não é multiplo!!");
			
		}
		
		input.close();

	}

}
