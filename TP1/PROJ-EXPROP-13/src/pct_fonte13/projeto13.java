package pct_fonte13;

import java.util.Scanner;

public class projeto13 {

	public static void main(String[] args) {
		
		int primo;
		boolean isPrimo = true;
		int divisor = 0;
		
		Scanner leteclado = new Scanner(System.in );
		
		System.out.println("Verificação se o número digitado é primo");
		System.out.println("-----------------------------------------------");
		
		System.out.print("Digite um numero: ");
		primo = leteclado.nextInt();
	
		
		for (int cont = 2; cont <= primo; cont++) {
			if (((primo % cont) == 0) && (cont != primo)) {
				isPrimo = false;
				divisor = cont;
				break;
				
			}
		}
		if (isPrimo) { //se primo for verdadeiro ou seja divisivel por 1
			System.out.println( "o número digitado é Primo");
		} else {
			System.out.println( "Não é Primo!! --> 2 ");
		}
	leteclado.close();
	}

}
