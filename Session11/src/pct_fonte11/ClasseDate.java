package pct_fonte11;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

public class ClasseDate {

	public static void main(String[] args) {
		
		Date d = Date.valueOf(LocalDate.now()); //data formato padrão americano
		System.out.println(d);
		
		Date max = Date.valueOf(LocalDate.MAX); //maximo que pode ser
		System.out.println(max);
		
		Date min = Date.valueOf(LocalDate.MIN); //minimo que pode ser
		System.out.println(min);
		
		Date date = Date.valueOf(LocalDate.now()); //pegar data atual
		System.out.println(date.toString());
		
		Time t = Time.valueOf(LocalTime.now()); //pega hora atual
		System.out.println(t.toString());
		
		System.out.println(date.toString() + t.toString());
           
	}

} 
