package pct_fonte2;

import java.util.Scanner;

public class ExercicioPratico02 {

	public static void main(String[] args) {
		

		int vetorA [] = new int[15]; //criando o vetorA
		int vetorB [] = new int[15]; //criando o vetorB	
     
		
	    Scanner input = new Scanner(System.in);
	    
	    for (int i = 0; i < 15; i++)
	    	{
	    	 System.out.print("Digite o elemento "+ i + ": ");
	    	 vetorA[i] = input.nextInt( );
	    	 }
	    for (int i = 0; i < 15; i++)
	    	 {
	    	 if ( i % 2 == 0)
	    	 vetorB[i] = vetorA[i] * 5;
	    	 else
	    	 vetorB[i] = vetorA[i] + 10;
	    	 }  	

	    System.out.println();
	    System.out.println("Resultado");
	    System.out.println(" Vetor A ----------- Vetor B");
	    
	    for (int i = 0; i < 15; i++)
	    	 {
	    	 System.out.println(" vetorA[" + i + "]"+ " = " + vetorA[i]+ " // vetorB[" + i + "]"+ " = " +
	    	 vetorB[i]);
	    	 }
	      
	   
	
	  input.close();
	}

}
