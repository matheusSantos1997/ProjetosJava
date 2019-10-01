package pct_estru;

public class SwitchCase {

	public static void main(String[] args) {
		
		int a = 15;
		int b = 2;
		
		switch(a % b) //MOD quer dizer resto da divisão	
		{ 	
		case 0:
			System.out.println("é par");
			break;
		case 1:
			System.out.println("é ímpar");
			break;
		}
		
		int idade = 20;
		
		switch(idade) {
		case 18:
			System.out.println("tem 18");
		    break;
		case 19:
			System.out.println("tem 19");
		    break;
		case 20:
			System.out.println("tem 20");
		    break; //break para a execuçao
		default:
			System.out.println("não tem 18, 19 e 20");
		 
		}
		

	}

}
