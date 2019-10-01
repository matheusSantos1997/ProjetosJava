package pct_fonte21;

import java.util.Scanner;

public class projeto21 {

	public static void main(String[] args) {
		
		float salario_anterior;
		int salario_reajustado;
		String nomefuncionario;
		String cargo;
		String nome = "Matheus";
		String RA = "D1943D7";
		System.out.println("Meu nome é: " + nome);
		System.out.println("Meu ra é: " + RA);
		
		Scanner lerteclado = new Scanner(System.in );
		
		System.out.println("-------------------------------");
		
		System.out.println("Entre com o nome do funcionário: ");
		nomefuncionario = lerteclado.next();
	    
		System.out.println("Entre com o cargo do funcionario");
		cargo = lerteclado.next();
		
		System.out.println("Digite o salário anterior: ");
		salario_anterior = lerteclado.nextFloat();
		
		System.out.println("Digite o salário reajustado: ");
		salario_reajustado = lerteclado.nextInt();
		
		System.out.println("--------------------------------");
		
		switch(salario_reajustado) {
	    	case 5: 
	    		System.out.println("o seu nome é: " + nomefuncionario);
	    		System.out.println("o seu salário anterior era: " + salario_anterior);
	    		System.out.println("o seu cargo é: " + cargo);
	    		System.out.println("o seu salário foi reajustado para: 5%");
	        break;
	    	case 7:
	    		System.out.println("o seu nome é: " + nomefuncionario);
	    		System.out.println("o seu salário anterior era: " + salario_anterior);
	    		System.out.println("o seu cargo é: " + cargo);
	    		System.out.println("o seu salário foi reajustado para: 7.5%");
	        break;
	    	case 10:
	    		System.out.println("o seu nome é: " + nomefuncionario);
	    		System.out.println("o seu salário anterior era: " + salario_anterior);
	    		System.out.println("o seu cargo é: " + cargo);
	    		System.out.println("este salário foi reajustado para: 10%");
	    	break;
	    	case 4:
	    		System.out.println("o seu nome é: " + nomefuncionario);
	    		System.out.println("o seu salário anterior era: " + salario_anterior);
	    		System.out.println("o seu cargo é: " + cargo);
	    		System.out.println("este salário foi reajustado para: 4%");
	    	break;
	    	default:
	    	System.out.println("o número digitado não corresponde a um percentual não existente");
	    	break;
	    }
		
		lerteclado.close();
	}

}
