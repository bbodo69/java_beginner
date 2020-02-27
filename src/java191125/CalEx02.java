package java191125;

import java.util.Calendar;

public class CalEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String[] DAY_OF_WEEK = {"월", "화", "수", "목", "금", "토", "일"};
		
		Calendar today = Calendar.getInstance();
		Calendar christmas = Calendar.getInstance();    //현재시각
		christmas.set(2019,12,25);
		
		System.out.println(christmas);
		System.out.println(toString(christmas)+DAY_OF_WEEK);
		
		
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년"+(Calendar.MONTH)+"월";
	}

}
