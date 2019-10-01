package pct_fonteCalculadora;

import java.util.Scanner;

public class TesteOperacaoAritmetica {

	public int somar(int num1, int num2 ) { //método somar números
		 return num1 + num2;
    }
	public int subtrair(int num1, int num2 ) { //método subtrair números
		 return num1 - num2;    
	}
	public int multiplicar(int num1, int num2) {  //método multiplicar números
		return num1 * num2;
	}
	public int dividir(int num1, int num2) {  //método dividir números
		return num1 / num2;
	}
	
	public static void main(String[] args) {
		   
		int num1;
		int num2;
		String resultado;
		
		Scanner lerteclado = new Scanner(System.in );
		
		System.out.println("digite o primeiro número: ");
		num1 = lerteclado.nextInt();
		
		System.out.println("digite o segundo número: ");
		num2 = lerteclado.nextInt();
		
		System.out.println("digite a operação desejada: ");
		resultado = lerteclado.next();
		
		switch(resultado) {
		   case"+":
			   System.out.println("a soma dos dois números digitados é: " + (num1 + num2));
		   break;
		   case "-":
			   System.out.println("a subtração dos dois números digitados é: " + (num1 - num2));
		   break;
		   case "*":
			   System.out.println("a multiplicação dos dois números digitas é: " + (num1 * num2));
		   break;
		   case "/":
			   System.out.println("a divisão dos dois números digitados é: " + (num1 / num2));
		   break;
		   default:
			   System.out.println("só é aceitou somente operadores matemáticos!!");
		   break;
		} 
		
		lerteclado.close();
	}

}
