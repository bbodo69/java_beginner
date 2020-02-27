package java191125;

import java.util.Calendar;

public class CalEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		//time1 시간 : 10시 20분 30초
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		
		
		//time2 시간 : 20시 30분 10초
		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		
		System.out.println("time1 : " + time1.get(Calendar.HOUR_OF_DAY)+"시"+
				time1.get(Calendar.MINUTE)+"분"+time1.get(Calendar.SECOND)+"초");
		System.out.println("time2 : " + time2.get(Calendar.HOUR_OF_DAY)+"시"+
				time2.get(Calendar.MINUTE)+"분"+time2.get(Calendar.SECOND)+"초");
		
		final int [] TIME_UNIT = {3600, 60, 1};
		final String [] TIME_UNIT_NAME = {"시간","분","초"};
		
		long differnce = Math.abs(time2.getTimeInMillis()-time1.getTimeInMillis())/1000;
		System.out.println(differnce);
		
		String tmp = "";
		for(int i = 0 ; i < TIME_UNIT.length ; i++) {
			tmp += differnce/TIME_UNIT[i] + TIME_UNIT_NAME[i];
			differnce %= TIME_UNIT[i];
		}
		
		System.out.println("시분초로 변환: "+ tmp + "입니다.");
	}

	
	
	
//	public String toString(Calendar date) {
//		return date.get(Calendar.YEAR)
//	}
}
