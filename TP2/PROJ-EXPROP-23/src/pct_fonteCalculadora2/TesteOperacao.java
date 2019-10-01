package pct_fonteCalculadora2;

import java.util.Scanner;

public class TesteOperacao {
	
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	int num1;
    	int num2;
    	String resultado;
    	
    	Scanner leteclado = new Scanner(System.in); //permitir entrada via teclado
    	
    	System.out.println("Digite o primeiro Número: ");
    	num1 = leteclado.nextInt();
    	
    	System.out.println("Digite o segundo Número: ");
        num2 = leteclado.nextInt();
        
        System.out.println("Digite um operador matemático: ");
        resultado = leteclado.next();
        
        Operacao num = new Operacao(); //instanciou a classe Operacao
        
        switch(resultado) {
        case "+":
        System.out.println("Resultado da soma = " + num.adicao( num1 , num2));
        break;
        case "-":
        System.out.println("Resultado da subtração = " + num.subtracao( num1 , num2));
        break;
        case "*":
        System.out.println("Resultado da multiplicação = " + num.multiplicacao( num1 , num2));
        break;
        case "/":
        System.out.println("Resultado da divisão = " + num.divisao( num1 , num2));
        break;
        default:
        	System.out.println("digite somente operadores lógicos!! ");
        break;
        }
        
        
    	
    	leteclado.close();
	}

}
