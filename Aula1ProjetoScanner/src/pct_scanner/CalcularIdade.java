package pct_scanner;

import java.util.Scanner;
import java.util.Calendar; //importando a biblioteca calendário

public class CalcularIdade {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Calendar calendario = Calendar.getInstance(); //chamando a biblioteca calendario
        
		System.out.println("-----------------------------------");
		System.out.println("digite a sua idade: ");
	    int idade = entrada.nextInt();
		int anoAtual = calendario.get(Calendar.YEAR); //instanciando o calendario do ano atual
		int anoNascimento = anoAtual - idade;
		
		System.out.println("você nasceu em: " + anoNascimento);
		
		System.out.println("-----------------------------------");
		
		entrada.close();
		
	}

}
