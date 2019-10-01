package pct_fonteCalculadora2;

public class Operacao {
	    private int num1;
        private int num2;
        private int resultado;

        public int adicao(int _num1, int _num2) {
		this.num1 = _num1;
		this.num2 = _num2;
		resultado = num1 + num2;
	    return resultado;
	}
        public int subtracao(int _num1, int _num2) {
    		this.num1 = _num1;
    		this.num2 = _num2;
    		resultado = num1 - num2;
    	    return resultado;
    	}
        
        public int multiplicacao(int _num1, int _num2) {
    		this.num1 = _num1;
    		this.num2 = _num2;
    		resultado = num1 * num2;
    	    return resultado;
    	}
        public int divisao(int _num1, int _num2) {
    		this.num1 = _num1;
    		this.num2 = _num2;
    		resultado = num1 / num2;
    	    return resultado;
    	}

	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}
