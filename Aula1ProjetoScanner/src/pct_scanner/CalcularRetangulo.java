package pct_scanner;

import java.util.Scanner; //importou a classe Scanner

public class CalcularRetangulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float ladoA;
		float ladoB;
		float profundidade;
		
		System.out.println("----------------------------------");
		System.out.println("Calcula a Área do triangulo");
		System.out.println("----------------------------------");
        System.out.println("Digite o lado A do retângulo em cm: ");
        ladoA = entrada.nextFloat(); 
        System.out.println("----------------------------------");
        System.out.println("Digite o lado B do retângulo em cm: ");
        ladoB = entrada.nextFloat();
        System.out.println("----------------------------------");
       
        float area = ladoA * ladoB;
        System.out.println("A área do retângulo é: " + area + "cm²");
        System.out.println("----------------------------------");
        System.out.println("Digite a profundidade do retângulo em cm: ");
        profundidade = entrada.nextFloat();
        
        float volume = area * profundidade;
        System.out.println("----------------------------------");
        System.out.println("o volume do retângulo é: " + volume + "cm³");
        
        //Alt Gr para colocar ao 2 e ao 3
        entrada.close();
	}

}
