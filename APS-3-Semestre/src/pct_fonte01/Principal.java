package pct_fonte01;
import java.util.Arrays;

public class Principal 
{

	public static void main(String[] args) 
	{
		
		//ARRAYS
			
			double Dados[] = {358.0, 360.0, 361.0, 363.0, 364.0, 366.0, 367.0, 369.0, 370.0, 370.0, 
					  		  371.0, 372.0, 373.0, 374.0, 375.0, 377.0, 378.0, 379.0, 380.0, 382.0, 
					  		  383.0, 384.0, 386.0, 387.0, 389.0, 390.0, 392.0, 393.0, 395.0, 396.0, 
					  		  398.0, 400.0, 402.0, 404.0, 405.0, 407.0, 409.0, 410.0, 412.0, 413.0, 
					  		  415.0, 417.0, 418.0, 420.0, 421.0, 423.0, 424.0, 426.0, 427.0, 427.0, 
					  		  427.0, 428.0, 428.0, 428.0, 428.0, 429.0, 429.0, 429.0, 429.0, 430.0, 
					  		  430.0, 431.0, 431.0, 431.0, 431.0, 431.0, 432.0, 432.0, 432.0, 433.0, 
					  		  433.0, 433.0, 433.0, 433.0, 434.0, 434.0,434.0,434.0, 435.0, 436.0, 
					  		  436.0, 436.0, 437.0, 438.0, 438.0, 439.0, 439.0, 440.0, 440.0, 440.0, 
					  		  441.0, 441.0};
			
		
			
			double DadosOrganizados[] = new double [92];
			double XK[]= new double[7];
			double ICMX[]= {370.0, 382.0, 394.0, 406.0, 418.0, 430.0, 442.0};
			double ICMN[]= {358.0, 370.0, 382.0, 394.0, 406.0, 418.0, 430.0};
			double FK[]= new double[7];
			double XK_FK[]=new double[7];
			double XK_X[]=new double[7];
			double XK_X2[]=new double[7];
			double XK_X4[]=new double[7];
			double FAC[]=new double[7];
			
			
		// VARIÁVEIS
			
			double totalFK=0,totalXK_FK = 0, TotalXK_X2,TotalXK_X4,c=0,Li,cond;
			double media=0,mediana=0,moda=0, S, S2, VMPmax, VMPmin; 	


		//criando OBJETOS

		Operacoes OP = new Operacoes();
		Operacoes2 OP2 = new Operacoes2();
		//Operacoes3 OP3 = new Operacoes3();
		
		/* Atribuindo valores para os Arrays e variaveis, vindas 
		de outras classes para a Principal, através de objetos*/
		
		OP.setOperacoes(DadosOrganizados);
		XK = OP2.getXK();
		FK = OP2.getFK();
		XK_X = OP2.getXK_X();
		XK_X2= OP2.getXK_X2();
		XK_X4= OP2.getXK_X4();
		XK_FK = OP2.getXK_FK();
		totalFK = OP2.gettotalFK();
		TotalXK_X2 = OP2.getTotalXK_X2();
		TotalXK_X4 = OP2.getTotalXK_X4();
		totalXK_FK = OP2.gettotalXK_FK();
		
		//Organizar o elementos e add em uma nova variavel 

		Arrays.sort(Dados);

		for (int i = 0; i < Dados.length; i++) 
		{
			DadosOrganizados[i]=Dados[i];
		}
		
		
		// CONTAS
		
		media=totalXK_FK/totalFK; // Média
		
		S2= TotalXK_X2/(totalFK-1.0); // Variância
		
		S = Math.sqrt(S2); // Desvio Padrão
		
		VMPmax = media + S; // VMP máximo
		
		VMPmin = media - S; // VMP mínimo
		
		for(int i=0; i < 7; i++) // FAC
		{
			c = c + FK[i];
			FAC[i] = c;
		}
		
		cond= OP.getNumclasse() % 2.0;
		
		if(cond==1.0) 
		{
			Li = OP.getNumclasse()/2.0;
			
			moda = ICMN[(int) (Math.round(Li))]+(FK[(int) (Math.round(Li))]-FK[(int) (Math.round(Li)-1)])*12.0/(2.0*FK[(int) (Math.round(Li))]-FK[(int) (Math.round(Li)-1)]-FK[(int) (Math.round(Li)+1)]);
			mediana = ICMN[(int) (Math.round(Li))]+(Dados.length/2.0-FAC[(int) (Math.round(Li))-1])*12.0/FK[(int) (Math.round(Li))];
		}
		
		
		// SAÍDA DE DADOS
		
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println("| FK-TOTAL | XK*FK-TOTAL | (XK*X)2-TOTAL | (XK*X)4-TOTAL | MÉDIA | S | VMPmax | VMPmin | MEDIANA | MODA |");
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println("| "+totalFK+"     | "+totalXK_FK+"     | "+TotalXK_X2+"        | "+TotalXK_X4+"     | "+Math.round(media)+"   | "+Math.round(S)+" | "
				+Math.round(VMPmax)+"    | "+Math.round(VMPmin)+"    | "+Math.round(mediana)+"     |"+moda+" |");
		System.out.println("---------------------------------------------------------------------------------------------------------");
		
		System.out.println("");
		
		System.out.println("========================================================================");
		System.out.println("K|  IC           |FK   |XK   |XK*FK  |XK*X  |(XK*X)2|(XK*X)4    |FAC   |");
		System.out.println("========================================================================");
		System.out.println("1"+"|"+ICMN[0]+" |-- "+ ICMX[0]+"|"+FK[0]+"  |"+XK[0]+"|"+XK_FK[0]+" |"+XK_X[0]+" |"+XK_X2[0]+" |"+XK_X4[0]+"  |"+FAC[0]+"   |");
		System.out.println("2"+"|"+ICMN[1]+" |-- "+ ICMX[1]+"|"+FK[1]+" |"+XK[1]+"|"+XK_FK[1]+" |"+XK_X[1]+" |"+XK_X2[1]+" |"+XK_X4[1]+"  |"+FAC[1]+"  |");
		System.out.println("3"+"|"+ICMN[2]+" |-- "+ ICMX[2]+"|"+FK[2]+"  |"+XK[2]+"|"+XK_FK[2]+" |"+XK_X[2]+" |"+XK_X2[2]+"  |"+XK_X4[2]+"   |"+FAC[2]+"  |");
		System.out.println("4"+"|"+ICMN[3]+" |-- "+ ICMX[3]+"|"+FK[3]+"  |"+XK[3]+"|"+XK_FK[3]+" |"+XK_X[3]+" |"+XK_X2[3]+"  |"+XK_X4[3]+"    |"+FAC[3]+"  |");
		System.out.println("5"+"|"+ICMN[4]+" |-- "+ ICMX[4]+"|"+FK[4]+"  |"+XK[4]+"|"+XK_FK[4]+" |"+XK_X[4]+"   |"+XK_X2[4]+"    |"+XK_X4[4]+"        |"+FAC[4]+"  |");
		System.out.println("6"+"|"+ICMN[5]+" |-- "+ ICMX[5]+"|"+FK[5]+" |"+XK[5]+"|"+XK_FK[5]+" |"+XK_X[5]+"  |"+XK_X2[5]+"  |"+XK_X4[5]+"    |"+FAC[5]+"  |");
		System.out.println("7"+"|"+ICMN[6]+" |-- "+ ICMX[6]+"|"+FK[6]+" |"+XK[6]+"|"+XK_FK[6]+"|"+XK_X[6]+"  |"+XK_X2[6]+"  |"+XK_X4[6]+"   |"+FAC[6]+"  |");
		System.out.println("========================================================================");

	}

}
