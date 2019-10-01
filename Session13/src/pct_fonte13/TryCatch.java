package pct_fonte13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatch {

	public static void main(String[] args) {
		
		String a = "Matheus";
		
		try { //tratamento de exceçoes e erros
			
			Integer i = new Integer(a);
			System.out.println(" a variável i vale: " + i);
			
		} catch(NumberFormatException nfe) {
			System.out.println("nao é possivel atribuir a string: " + a + " a um objeto Inteiro \n "+ nfe.getMessage());
		}
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("casa.txt");
			
		}catch(FileNotFoundException e) {
			
			e.printStackTrace();
		}
		finally {
			
		}

	}

}
