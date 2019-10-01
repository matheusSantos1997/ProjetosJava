package pct_fontematriz01;

import java.io.IOException;

import java.util.Scanner;

public class ExercicioMatriz02 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Nome: Matheus Jardim da Costa Santos");
		System.out.println("RA: D1943D-7");
		
		Scanner lerteclado = new Scanner(System.in);
	     
	     int notasAlunos[][];
	     
	     for(int nl = 0; nl < 6; nl++) {
	    	 
	    	 notasAlunos = new int [6][16];
	    	 int soma = 0;
	    	 int media = 0;
	    	 int acharMed = 0;
	    	 
	     for(int nc = 0; nc < 6; nc++) {
	    	 
	    	System.out.println("Insira o valor da coluna: " + nc + 
	    			 " na linha: " + nl);
	    	 int numero = lerteclado.nextInt();
	    	 notasAlunos[nl][nc] = numero;
	    	 soma += notasAlunos[nl][nc];
	    	 media = soma/3;
	     }
	     if (media >= 7) 
	     {
	    	 System.out.println("\nParabéns - Aprovado a Média é: " + media);
	     }
	     else {
	    	 System.out.println("\nReprovado, precisa fazer o exame, a Média é: " + media);
	    	 acharMed += media;
	      }
	     
	     if((nl == 5) && (acharMed >= 7)){
	    	  
	    	 System.out.println("\nMedia Geral da Turma: " + acharMed + ", Aprovados");
	    	 
	    }
	     else {
	    	 System.out.println("Média Geral da turma é: " + acharMed + ", Reprovados");
	     }
	   }
	     lerteclado.close();
	     System.gc();

	}

}
