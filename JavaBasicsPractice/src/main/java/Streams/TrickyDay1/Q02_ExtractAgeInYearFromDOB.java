package Streams.TrickyDay1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Q02_ExtractAgeInYearFromDOB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate birthDay = LocalDate.of(1998, 02, 25);
		LocalDate today = LocalDate.now();
		
		System.out.println(ChronoUnit.YEARS.between(birthDay, today));
	}

}
