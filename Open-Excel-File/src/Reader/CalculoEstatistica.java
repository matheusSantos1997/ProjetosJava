package Reader;

import java.util.Arrays;

public class CalculoEstatistica {

	public static void main(String[] args) {
		
		int[] vetor = {5,3,2,5,2,5,758,345,32,231,5,5,5,2,2};

	  //media
		
	  int num = 0;
	  
	  for(int n: vetor) {
		  
		  num += n;
	  }
		
	System.out.println("a Média do vetor é: " + ((float)num/vetor.length));
	
	//mediana
	
	Arrays.sort(vetor);
	
	if(vetor.length % 2 != 0) {
		 
		System.out.println("a Mediana do vetor é: " + ((float)vetor[vetor.length/2]));
	} 
	else 
	{
		System.out.println("a Mediana do vetor é: " + ((float)vetor[vetor.length/2] + vetor[vetor.length/2-1]) / 2.0);
	}
	
	//moda
	
	int maxNumbers = -1;
	int maxAppearances = -1;
	
	for (int i = 0; i < vetor.length; i++)
	{
		int count = 0;
	
		for (int j = 0; j < vetor.length; j++)
		{
			if(vetor[i] == vetor[j])
			
				count++;
			}
		if(count > maxAppearances) {
			maxNumbers = vetor[i];
			maxAppearances = count;
		}
			
	}
	  System.out.println("a Moda é: " + ((float)maxNumbers));
	
	
	
	}

}
