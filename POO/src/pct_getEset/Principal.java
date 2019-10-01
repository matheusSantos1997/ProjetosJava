package pct_getEset;

public class Principal {

	public static void main(String[] args) {
		
	
	   ClasseCarro carro = new ClasseCarro("fiat", "635633653");
	   ClasseCarro carro2 = new ClasseCarro();//instanciou a classe  GetterSetter1
	   
	   System.out.println("===========================CARROS==============================");
	   System.out.println();
       carro.setNumeroChassi("124565677"); //instanciou o set
       carro.setMarca("Mustang");
       carro.setModelo("GT 500");
       carro.setPlaca("FMI-942");
       carro.setCor("Vermelho");
       carro.setNumeroMarchas(5);
       carro.setAnoModelo(2015);
       
       HerancaCarro h = new HerancaCarro(); //instanciou a classe HerancaCarro
       
       h.getValor();
       h.setModelo("ferrari");
       
       System.out.println("o número do chassi é: " + carro.getNumeroChassi());//retornando numero de chassi
       System.out.println("a marca do carro é: " + carro.getMarca()); //retornando marca
       System.out.println("o modelo do carro é: " + carro.getModelo());//retornando o modelo do carro
       System.out.println("a placa do carro é: " + carro.getPlaca());
       System.out.println("a cor do carro é: " + carro.getCor());
       System.out.println("a quantidade de marchas que o carro possui é: " + carro.getNumeroMarchas());
       System.out.println("o ano do modelo é: " + carro.getAnoModelo());
       
       System.out.println("================================================================");
       System.out.println();
       
       carro2.setNumeroChassi("9997868688"); //instanciou o set
       carro2.setMarca("Honda");
       carro2.setModelo("Civic");
       carro2.setPlaca("FMI-345");
       carro2.setCor("Prata");
       carro2.setNumeroMarchas(4);
       carro2.setAnoModelo(2017);
       
       System.out.println("o número do chassi é: " + carro2.getNumeroChassi());//retornando numero de chassi
       System.out.println("a marca do carro é: " + carro2.getMarca()); //retornando marca
       System.out.println("o modelo do carro é: " + carro2.getModelo());//retornando o modelo do carro
       System.out.println("a placa do carro é: " + carro2.getPlaca());
       System.out.println("a cor do carro é: " + carro2.getCor());
       System.out.println("a quantidade de marchas que o carro possui é: " + carro2.getNumeroMarchas());
       System.out.println("o ano do modelo é: " + carro2.getAnoModelo());
     
	}

}
