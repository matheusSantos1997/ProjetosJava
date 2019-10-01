package pct_fonte01;

public class Operacoes 
{

	//Arrays
	
		public double XK[] = new double[7];
		public double FK[] = new double[7];
		public double cont[] = new double[7];
		public double XK_FK[]= new double[7];
		public double ICmax[] = new double[7];
		public double ICmin[] = new double[7];
		private double Dados[]= new double[92];
		
		//Variáveis
		
		public double maior=0, menor=0, H=0, amplitude=0, vetorSoma=0, valormin=0, valormai=0, K=0, c=0;
		

		
	// Add o valor do vetor da classe "principal", para esta classe
		
	public void setOperacoes(double[] _vetor) 
	{
		this.Dados = _vetor;
	}

	//MAIOR elemento

	public double getMaior() 
	{
		for(int nl=0; nl < Dados.length; nl++) 
		{
			if(Dados[nl]>maior) {maior = Dados[nl];}
		} 
		
		return maior;
	}

	// MENOR elemento

	public double getMenor() 
	{
		for(int nl=0; nl < Dados.length; nl++) 
		{
			if(menor==0) {menor = Dados[0];}
			
			//if(Dadoss[nl]<menor) {menor = Dadoss[nl];}
		} 
		
		return menor;
	}

	// Amplitude da Amostra = H

	public double getAmplitudeA() 
	{
		H = maior - menor;
		
		return H;
	}

	// Número de classes = K

	public double getNumclasse() 
	{
	K =  Math.log10(Dados.length)*3.3+1;

	return Math.round(K);
	}

	//AMPLITUDE DA CLASSE = h

	public double getAmplitudeC() 
	{
		amplitude = H/Math.round(K);
				
		return Math.round(amplitude);
	}

	//IC

	public double[] getICmax() {

		valormai = menor;

		//IC maximo
		for(int i = 0; i < ICmax.length; i++)
		{
			ICmax[i] = valormai + Math.round(amplitude);
			valormai = ICmax[i];
			
		}
		return ICmax;
	}

	public double[] getICmin () {
		
		valormin = menor - Math.round(amplitude);
		
		//IC minimo
		for(int i = 0; i < ICmin.length; i++)
		{
			ICmin[i] = valormin + Math.round(amplitude);
			valormin = ICmin[i];
			
		}
		
		return ICmin;
		
	}
}
