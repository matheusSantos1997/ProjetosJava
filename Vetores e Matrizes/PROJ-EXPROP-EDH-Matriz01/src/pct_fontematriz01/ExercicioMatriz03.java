package pct_fontematriz01;

import java.io.IOException;

import java.util.Scanner;

public class ExercicioMatriz03 {

	public static void main(String[] args) throws IOException 
	{
		Scanner lerteclado = new Scanner(System.in);
		
		System.out.println("Nome: Matheus Jardim da Costa Santos");
		System.out.println("RA: D1943D-7");
		
		int i, j;
		int geral = 0;
		int compare = 0;
		int compMes = 0;
		int lucroLojas[][];
		
		for(i = 0; i < 5; i++) 
		{
			
			lucroLojas = new int [5][12];
			int soma = 0;
			
			for(j = 0; j < 12; j++) 
			{
				System.out.println("Insira o lucro da loja " + (i + 1) + 
						" no mês " + (j + 1));
				int num = lerteclado.nextInt();
				lucroLojas[i][j] = num;
				soma += lucroLojas[i][j];
				geral += lucroLojas[i][j];
				
				if(compare < soma) {
					compare = soma;
					compMes = (i + 1);
				}
			}
		System.out.println("Lucro total no mes: " + soma + "\n");
		if(i == 4) 
		{
			switch(compMes) 
			{
			case 1:
			 System.out.println("O maior lucro foi na loja: " + compMes + "de: " + compare);
			 break;
			case 2:
			 System.out.println("O maior lucro foi na loja: " + compMes + "de: " + compare);
			 break;
			case 3:
			 System.out.println("O maior lucro foi na loja: " + compMes + "de: " + compare);
			 break;
			case 4:
			 System.out.println("O maior lucro foi na loja: " + compMes + "de: " + compare);
			case 5:
			 System.out.println("O maior lucro foi na loja: " + compMes + "de: " + compare);
			 break;
			}
			System.out.println("O lucro geral das 5 Empresas foi de: " + geral);
		}
	}
        lerteclado.close();
		System.gc(); 
	}

}
