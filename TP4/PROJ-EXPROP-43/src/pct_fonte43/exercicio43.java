package pct_fonte43;

import java.util.Scanner;
public class exercicio43 {

	public static void main(String[] args) {

         int saldo_medio;
         int valor_credito;
         float resultado;
      
        
         Scanner lerteclado = new Scanner(System.in);
         
         System.out.println("Nome: Matheus J. da Costa Santos");
 		
 		System.out.println("RA: D1943D-7");
 		
 		System.out.println("----------------------------");
         
         System.out.println("Digite o saldo médio: ");
         saldo_medio = lerteclado.nextInt();
         
         
         System.out.println("Digite o valor do crédito: ");
         valor_credito = lerteclado.nextInt();
         
         resultado = saldo_medio * valor_credito;
        
         if((saldo_medio >= 0 && saldo_medio <= 250 && valor_credito == 0) || (saldo_medio >= 251 && saldo_medio <= 500 && valor_credito == 15) 
        		 ||(saldo_medio >= 501 && saldo_medio <= 1000 && valor_credito == 30) || (saldo_medio >= 1001 && valor_credito == 50)) {
        	 System.out.println("o saldo médio é: " + saldo_medio + "\no valor de crédito é: " + resultado);
         }
         else {
        	 System.out.println("Saldo não existente!!");
         }
         lerteclado.close();
	}

}
