package pct_fonte11;

import java.sql.Time;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;

public class ClasseTime {

	public static void main(String[] args) {
		
		Time t = Time.valueOf(LocalTime.now()); //hora atual
		System.out.println(t); //imprimindo hora atual
		
		Year y = Year.now(); //ano atual
		System.out.println(y);
		
		YearMonth ym = YearMonth.now(); //ano e mes
		System.out.println(ym);
		
		MonthDay md = MonthDay.now(); //mes e dia atual
		System.out.println(md);
		
		OffsetDateTime dt = OffsetDateTime.now(); //data completa
		System.out.println(dt);
		
		ZoneId z = ZoneId.systemDefault(); //zona em que está
		System.out.println(z);
		
		Period p = Period.ofYears(2019);
		System.out.println(p);
		
		Time HoraAtual = Time.valueOf(LocalTime.now());
		System.out.println(HoraAtual);
		
		
		
	}

}
