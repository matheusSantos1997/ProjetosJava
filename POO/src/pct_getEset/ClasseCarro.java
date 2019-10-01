package pct_getEset;

public class ClasseCarro {

	//atributos
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private int numeroMarchas;
	private int anoModelo;
	private String numeroChassi = "";
	
	public ClasseCarro() { //método construtor
		 System.out.println("método construido");
		
	}
	
	//sobrecarga de construtor
	public ClasseCarro(String _marca, String placa) {
		 this.marca = _marca;
		 this.placa = placa;
	}
	//metodos get e set
	
	//numeroChassi
	public String getNumeroChassi() { //retorna numeroChassi
		
		return this.numeroChassi;
	}
	
	public void setNumeroChassi(String _numeroChassi) { //atribui ou modifica os dados para o numeroChassi
		 this.numeroChassi = _numeroChassi;
	}
	
	//marca
	public String getMarca() {
		 return this.marca;
	}
	
    public void setMarca(String _marca) { //String _marca variavel local
    	this.marca = _marca;
    }
    
    //modelo
    public String getModelo() {
    	 return this.modelo;
 
    }
    
    public void setModelo(String _modelo) {
    	this.modelo = _modelo;
    }
    
    //placa
    public String getPlaca() {
    	return this.placa;
    }
    
    public void setPlaca(String _placa) {
    	this.placa = _placa;
    }
    
    //cor
    public String getCor() {
    	return this.cor;
    }
    
    public void setCor(String _cor) {
    	this.cor = _cor;
    }
    
    //numero de marchas
    public int getNumeroMarchas() {
    	return this.numeroMarchas;
    }
    
    public void setNumeroMarchas(int _numeroMarchas) {
    	this.numeroMarchas = _numeroMarchas;
    }
    
    //ano do Modelo
    
    public int getAnoModelo() {
    	return this.anoModelo;
    }
    
    public void setAnoModelo(int _anoModelo) {
    	this.anoModelo = _anoModelo;
    }
    
    
}
