package java191125;

import java.util.Calendar;

public class CalEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Calendar 객체 생성
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		
		// 년도와 달 맞이하기
		int year = now.get(Calendar.YEAR);
		
		System.out.println(year);
		
		int month = now.get(Calendar.MONTH);
		System.out.println(month);

	}

}
