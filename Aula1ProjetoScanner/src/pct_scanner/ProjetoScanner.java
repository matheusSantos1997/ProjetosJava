package pct_scanner;

import java.util.Scanner; //importou a classe Scanner

public class ProjetoScanner {

	public static void main(String[] args) {
		

	System.out.println("-------------------------------------");
	System.out.println("------------Menu Principal-----------");
	System.out.println("-------------------------------------");
	System.out.println("-- Opções --");
	System.out.println("- Abrir -");
	System.out.println("- Salvar -");
	System.out.println("- Fechar -");
	System.out.println("--------------------------------------");
	
	Scanner entrada = new Scanner(System.in); //permitiu entrada via teclado
	
	
	
	System.out.println("digite o número da opçao desejada: ");
	int numeroOpcao = entrada.nextInt();
	
	System.out.println("                                      ");
	System.out.println("--------------------------------------");
	System.out.println("o número desejado foi: " + numeroOpcao);
	System.out.println("--------------------------------------");
	
	entrada.close();
	}//fim do método main

}//fim da classe 
