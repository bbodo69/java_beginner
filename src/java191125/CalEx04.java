package java191125;

import java.util.Calendar;

public class CalEx04 {

	public static void main(String[] args) {

		Calendar date = Calendar.getInstance();
		System.out.println(toString(date));
		
		System.out.println("========1일후========");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		date.add(Calendar.MONTH, -3);
		System.out.println(toString(date));
		

	}
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년"+(Calendar.MONTH)+
				"월"+(Calendar.DATE)+"일";
	}
}
