package pct_fonte11;

import java.util.Calendar;

public class ClasseCalendar {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime()); //passa a hora e data atual
		System.out.println(c.get(Calendar.YEAR)); //passar o ano atual
		System.out.println(c.get(Calendar.MONTH)); //passar o mês atual
		System.out.println(c.get(Calendar.DAY_OF_YEAR)); //passar o dia em relação ao ano
		System.out.print(c.get(Calendar.DAY_OF_WEEK) + " = "); //passar o dia da semana atual
		
		if(c.get(Calendar.DAY_OF_WEEK) == 5) 
		{
			System.out.println("Quinta Feira!");
		}
		
		
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH)); //estudar
		
		System.out.println();
		
		Calendar cl = Calendar.getInstance();
		int Ano = 2019;
	    
		//atribuir primeiro
		cl.set(Calendar.YEAR, Ano);
		System.out.println(cl.get(Calendar.YEAR));
		
		System.out.println();
		
		int ano = 1978;
		int mes = 02;
		int dia = 01;
		
		cl.set(ano, mes, dia);
		System.out.println(cl.get(Calendar.YEAR));
		System.out.println(cl.get(Calendar.MONTH));
		System.out.println(cl.get(Calendar.DAY_OF_MONTH));
		

	}

}
