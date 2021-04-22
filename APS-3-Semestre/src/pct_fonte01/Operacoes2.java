package pct_fonte01;

public class Operacoes2 
{
	
	//Arrays
		public double Dados[] = {358.0, 360.0, 361.0, 363.0, 364.0, 366.0, 367.0, 369.0, 370.0, 370.0, 
		  		  371.0, 372.0, 373.0, 374.0, 375.0, 377.0, 378.0, 379.0, 380.0, 382.0, 
		  		  383.0, 384.0, 386.0, 387.0, 389.0, 390.0, 392.0, 393.0, 395.0, 396.0, 
		  		  398.0, 400.0, 402.0, 404.0, 405.0, 407.0, 409.0, 410.0, 412.0, 413.0, 
		  		  415.0, 417.0, 418.0, 420.0, 421.0, 423.0, 424.0, 426.0, 427.0, 427.0, 
		  		  427.0, 428.0, 428.0, 428.0, 428.0, 429.0, 429.0, 429.0, 429.0, 430.0, 
		  		  430.0, 431.0, 431.0, 431.0, 431.0, 431.0, 432.0, 432.0, 432.0, 433.0, 
		  		  433.0, 433.0, 433.0, 433.0, 434.0, 434.0,434.0,434.0, 435.0, 436.0, 
		  		  436.0, 436.0, 437.0, 438.0, 438.0, 439.0, 439.0, 440.0, 440.0, 440.0, 
		  		  441.0, 441.0};
		
		public double FK[] = {8.0,11.0,9.0,7.0,7.0,17.0,33.0};
		double ICMX[]= {370.0, 382.0, 394.0, 406.0, 418.0, 430.0, 442.0};
		double ICMN[]= {358.0, 370.0, 382.0, 394.0, 406.0, 418.0, 430.0};
		public double XK[] = new double[7];
		public double XK_FK[] = new double[7];
		public double XK_X[]= new double[7];
		public double XK_X2[]= new double[7];
		public double XK_X4[]= new double[7];
		
		//Variáveis
		
		public double totalFK,totalXK_FK,XK_FKTotal,TotalXK_X2,TotalXK_X4, c;
		
		//Criando um OBJETO
		
		
		
		
	public Operacoes2()
	{	
	   
	   
		
	}
	public double[] getFK() 
	{
		return FK;
	}

    
	// XK

	public double[] getXK () 
	{
		
		for(int i=0; i < XK.length; i++) 
		{
			XK[i]=(ICMX[i]+ICMN[i])/2.0;
		}
		
		return XK;
	}

	// XK*FK

	public double[] getXK_FK() 
	{
		for(int i=0; i<XK_FK.length;i++) 
		{
			XK_FK[i]= XK[i]*FK[i]; 
		}
		
		return XK_FK;
	}

	public double gettotalXK_FK() 
	{
		for(int i=0; i<XK_FK.length;i++) 
		{
			totalXK_FK +=XK_FK[i];
		}
		return totalXK_FK;
	}

	public double gettotalFK() 
	{
		for(int i=0; i<FK.length;i++) 
		{
			totalFK += FK[i];
		}
		return totalFK;
	}

	// XK-X

	public double[] getXK_X()
	{
		for(int i=0; i<XK.length;i++) 
		{
			XK_X[i]= XK[i]- 411.0;
		}
		
		return XK_X;
	}

	// (XK-X)2

	public double[] getXK_X2() 
	{
		for(int i=0; i<XK_X2.length;i++) 
		{
			XK_X2[i]=XK_X[i]*XK_X[i];
		}
		
		return XK_X2;
	}

	// (XK-X)4

	public double[] getXK_X4() 
	{
		for(int i=0; i<XK_X4.length;i++) 
		{
			XK_X4[i]=XK_X2[i]*XK_X2[i];
		}
	return XK_X4;
	}

	// Total do (XK-X)2

	public double getTotalXK_X2() 
	{
		for(int i=0; i<XK_X2.length;i++) 
		{
			
			TotalXK_X2 += XK_X2[i];
		} 
		
		return TotalXK_X2;
	} 

	// Total do (XK-X)4

	public double getTotalXK_X4() 
	{
		for(int i=0; i<XK_X4.length;i++) 
		{
			TotalXK_X4 += XK_X4[i];
		} 
		
		return TotalXK_X4;
	} 
	
}
