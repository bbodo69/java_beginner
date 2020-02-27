package java191125;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx01 {

	public static void main(String[] args) {
	
		Date day = new Date();
		System.out.println(day);
		System.out.println(day.getMonth());
		
		
		// 날짜 출력시 원하는 형태로 출력하기 위해  만들때 사용
		SimpleDateFormat sdf1, sdf2;
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("yy년 MM월 dd일");

		System.out.println(sdf1.format(day));
	}

}
