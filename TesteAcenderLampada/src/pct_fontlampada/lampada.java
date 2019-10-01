package pct_fontlampada;
import java.util.Scanner;

public class lampada {

	public static void main(String[] args) {
		
		int porta1;
		int porta2;
		boolean acesa = true;
		boolean apagada = false;
        
		System.out.println("Teste de acender a lâmpada com operadores lógicos \nAND e OR");
		
		System.out.println("digite somente valores Lógicos 1 = true ou 0 = false");
		
		System.out.println("----------------------------------------");
		Scanner lerteclado = new Scanner(System.in); //permitindo a entrada de dados via teclado
		
		System.out.println("digite o primeiro valor da porta lógica: ");
		porta1 = lerteclado.nextInt(); //convertendo de String para int
		
		System.out.println("digite o segundo valor da porta lógica: ");
		porta2 = lerteclado.nextInt();
		
		System.out.println("----------------------------------------");
		
		//verificaçao de digitar apenas 1 e 0
    if((porta1 >= 0 && porta2 >= 0) && (porta1 <= 1 && porta2 <=1)) {
		//verificaçao se é falso ou verdadeiro
    	if((porta1 >= 0) && (porta2 >= 0) || (porta1 == 1) && (porta2 == 1)){
		   //caso as duas portas forem verdadeiras
			if((porta1 == 1) && (porta2 == 1)) { 
		    acesa = true;
			System.out.println("Lâmpada Acesa com sucesso!! \nOperador lógico: AND!!\n" + acesa);
		    } else {
			    apagada = false;
		    	System.out.println("Não foi possível acender a Lâmpada!!\nOperador lógico: OR!!\n" + apagada);
			  
		   } 
	   }
 
    } else {
	 System.out.println("os números digitados não correspondem as portas lógicas!!");
   }
		
	 lerteclado.close();
	}

}

