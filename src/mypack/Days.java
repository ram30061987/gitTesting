package mypack;

import java.time.LocalDate;

public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate tomorrow = LocalDate.now().plusDays(30);
		System.out.println(""+tomorrow);

	}

}
