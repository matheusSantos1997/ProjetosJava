package pct_metodo;

public class PassagemDeArrays {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		
		String[] cadastro = {"nome", "sobrenome"};
		
		ExibirArray(a);
		ExibirNome(cadastro);
		ExibirSobrenome(cadastro);

	}
     
	public static void ExibirArray(int[] x) 
	{
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(x[4]);
	}
	public static void ExibirNome(String[] x) 
	{
		System.out.println(x[0]);
	}
	public static void ExibirSobrenome(String[] y)
	{
		System.out.println(y[1]);
	}
	
}
