package pct_fonte11;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class ClasseDateFormat {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance(); //instanciou a classe calendar
		
		Date data  = c.getTime();
		System.out.println(data);
		
		//formatar data
		DateFormat data1 = DateFormat.getDateInstance();
		System.out.println(data1.format(data));
		
		//formatar hora
		DateFormat hora = DateFormat.getTimeInstance();
	    System.out.println(hora.format(data));
	    
	    //formatar data e hora
	    DateFormat datahora = DateFormat.getDateTimeInstance();
	    System.out.println(datahora.format(data));
		
	}

}
