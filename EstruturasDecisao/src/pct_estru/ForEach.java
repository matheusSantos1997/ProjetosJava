package pct_estru;

public class ForEach {

	public static void main(String[] args) {
		//for(each)
		
		int [] vetor = {1,2,3,4,5};
		
		//System.out.println(vetor.length);
		for(int i : vetor) {
		      System.out.println(i);
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]); 
		}
	}

}
