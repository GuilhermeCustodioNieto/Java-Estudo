package teory;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TeorySeven {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2023-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2023-07-20T01:30:26");
		Instant d06 = Instant.parse("2023-07-20T01:30:26Z");
		
		LocalDate pasteWeekLocalDate = d04.minusWeeks(1);
		LocalDate nextWeekLocalDate = d04.plusWeeks(1);
		
		
		LocalDate pasteDaysLocalDate = d04.minusDays(7);
		LocalDate nextDaysLocalDate = d04.plusDays(7);
		
		
		System.out.println("pasteWeekLocalDate = " + pasteWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		System.out.println("pasteDaysLocalDate =" + pasteDaysLocalDate);
		System.out.println("nextDaysLocalDate = " + nextDaysLocalDate);
		

		LocalDateTime pasteDaysLocalDateTime = d05.minusDays(7);
		LocalDateTime nextDaysLocalDateTime = d05.plusDays(7);
		
		System.out.println("pasteDaysLocalDateTime = " + pasteDaysLocalDateTime);
		System.out.println("nextDaysLocalDateTime = " + nextDaysLocalDateTime);
		
		Instant pasteDaysInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextDaysInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pasteDaysInstant = " + pasteDaysInstant);
		System.out.println("nextDaysInstant = " + nextDaysInstant);
		
		Duration t01 = Duration.between(pasteWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t02 = Duration.between(pasteDaysLocalDateTime, d05);
		Duration t03 = Duration.between(nextDaysInstant, d06);
		
		System.out.println("d1 = " + t01.toDays());
		System.out.println("d2 = " + t02.toDays());
		System.out.println("d3 = " + t03.toDays());
		
		
	}

}
