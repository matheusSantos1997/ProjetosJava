package pct_tabuada;

import java.util.Scanner;
public class tabuada {

	public static void main(String[] args) {
		
		int numero;
		int resultado;
		
		
		Scanner leteclado = new Scanner(System.in);
         
	    System.out.println("Digite um número de 1 a 10: ");
	    numero = leteclado.nextInt();
	    
	    for(int cont = 0; cont <= 10; cont++) {
	    	resultado = numero * cont;
	    	System.out.println("a tabuada desejada é: " + numero + " x " + cont + " = " + resultado);
	    
	    }
	    leteclado.close();
	}

}
