package pct_fonte1;

public class ExercicioPratico01 {

	public static void main(String[] args) {
		
		int vetorA [] = new int[15]; //criando o vetorA
		int vetorB [] = new int[15]; //criando o vetorB
		
		System.out.println("Resultado");
	    System.out.println(" Vetor A ----------- Vetor B");
	    
	    for (int i = 0; i < 15; i++)
	    	 {
	    	 vetorB[i] = vetorA[i] * vetorA[i];
	    	System.out.println(" vetorA[" + i + "]"+ " = " + vetorA[i]+ " //vetorB[" + i + "]"+ " = " +
	    	 vetorB[i]);
	    	 }
	    
	     System.gc();
	}   

}
