package pct_metodo; //são os pacotes 

import java.util.Scanner;

public class Metodos {  //classe

	//é o método main					
	public static void main(String[] args) { 
		Scanner entrada = new Scanner(System.in);
		
		int escolher; //variavel global
		
		//loop infinito
		while(true) { 
		Mensagem("-------------------------------------");
	    Mensagem("digite 1 para somar e 2 para subtrair");
		escolher = entrada.nextInt();
		
		if(escolher == 1)//somar
		{
			Mensagem("Digite um número inteiro: ");
			int valor1 = entrada.nextInt();
	        
	        Mensagem("digite outro número inteiro: ");
			int valor2 = entrada.nextInt();
	        
	        int valorTotal = SomarDoisValores(valor1, valor2);
	        
	        Mensagem("O valor total da soma é: " + Integer.toString(valorTotal)); 
	        continue; //apos acabar ele continua de onde parou
	        //converteu a variavel int para string
	        
		}
		
		if(escolher == 2) 
		{

			Mensagem("Digite um número inteiro: ");
			int valor1 = entrada.nextInt();
	        
	        Mensagem("digite outro número inteiro: ");
			int valor2 = entrada.nextInt();
	        
	        int valorTotal = SubtrairDoisNumeros(valor1, valor2);
	        
	        Mensagem("O valor total da subtraçao é: " + Integer.toString(valorTotal)); 
	        //converteu a variavel int para string
	        continue;
		}
		entrada.close();
	  }
		
	}
    
	//criar um método void que não retorna valores
	static void Mensagem(String m) 
	{
	   System.out.println(m);
	}
	
	//criar um métodoint que retornará um valor inteiro sem passar valor
	static int SomarDoisValores(int a, int b) 
	{
		
		int c = a + b;
		return c;
	}
	static int SubtrairDoisNumeros(int a, int b) 
	{
		int c = a - b; //variavel local
		return c;
	}
	
}
