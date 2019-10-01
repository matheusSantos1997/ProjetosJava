package pct_arrays;

public class Multidimensionais {

	public static void main(String[] args) {
		//declaraçao de array multidimensional
		
		String cadastro [][] = { 
				                 {"Carlos", "444-4444"},
				                 {"Fernando", "999-9999"},
				                 {"Fabio", "777-77777"}
		                       };
		
		System.out.println(cadastro.length); //conta quantos elementos tem no array
		System.out.println(cadastro[0][0]); //pegou a primeira posiçao do array

	}

}
