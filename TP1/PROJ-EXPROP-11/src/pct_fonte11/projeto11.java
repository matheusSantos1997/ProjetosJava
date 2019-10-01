package pct_fonte11;

import java.util.Scanner;

public class projeto11 {

	public static void main(String[] args) {
	    
		 int nota1;
		 int nota2;
		 float mg;
		 String nome = "Matheus";
		 String RA = "D1943D7";
		 String turma = "CC-2S";
		 
		 System.out.println("Calculo da média geral de alunos");
		 
		 System.out.println("----------------------------------------");
		 
		 Scanner input = new Scanner(System.in );
		 
		 System.out.println("Seu nome é: " + nome);
		 
		 System.out.println("Seu RA é: " + RA);
		 
		 System.out.println("Sua turma eh: " + turma);
	
		System.out.print("Entre com a nota1: ");
		nota1 = input.nextInt();
		
		System.out.println("----------------------------------------");
		
	    System.out.print("entre com a nota2: ");
	    nota2 = input.nextInt();
	    	    
	    mg = (nota1 + nota2) / 2;
	    
	    
	    if ((nota1 > 0 && nota2 > 0) && (nota1 <= 10 && nota2 <=10)) {
	    
	      if(mg >= 7) {
	    	  
	       System.out.println("Média geral é: " + mg + "\nVocê foi Aprovado!!");
	       
	    } else {
	    	System.out.println("você foi reprovado!!");
	    	System.out.print("fim do programa!!");
	     }
	    }

	    input.close();
	}

}
