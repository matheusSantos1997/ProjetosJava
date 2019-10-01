package pct_fonte12;

import java.util.Scanner;

public class projeto12 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int idadeAnos; 
		int idadeMeses; 
		int idadeDias; 
		int idadeTotalDias;
		
		System.out.println("Calculadora de idade em meses, dias e anos");
		System.out.println("---------------------------------------------------------");
		
		System.out.print("Digite os anos: ");
		idadeAnos = input.nextInt();
		
		System.out.print("Digite os meses: ");
		idadeMeses = input.nextInt();

		System.out.print("Digite os dias: ");
		idadeDias = input.nextInt();


		idadeTotalDias = idadeAnos * 365 + idadeMeses * 30 + idadeDias;
		System.out.print("Idade total em dias = " + idadeTotalDias +"\n");
		
	   input.close();
	}
	

}
