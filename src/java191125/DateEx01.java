package java191125;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx01 {

	public static void main(String[] args) {
	
		Date day = new Date();
		System.out.println(day);
		System.out.println(day.getMonth());
		
		
		// ��¥ ��½� ���ϴ� ���·� ����ϱ� ����  ���鶧 ���
		SimpleDateFormat sdf1, sdf2;
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("yy�� MM�� dd��");

		System.out.println(sdf1.format(day));
	}

}
