package curso_programacao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Exercicio_27 {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:15:31");
		Instant d06 = Instant.parse("2022-07-20T01:15:31Z");

		/*
		 * for(String s : ZoneId.getAvailableZoneIds()) { System.out.println(s); }
		 * Imprime todos os fusos horários disponíveis
		 */

		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));

		System.out.println("r1: " + r1);
		System.out.println("r2: " + r2);
		
		System.out.println("d4 dia: "+d04.getDayOfMonth());
		
		System.out.println("d05 hora: "+d05.getHour());
	}

}
