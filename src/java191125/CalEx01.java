package java191125;

import java.util.Calendar;

public class CalEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Calendar ��ü ����
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		
		// �⵵�� �� �����ϱ�
		int year = now.get(Calendar.YEAR);
		
		System.out.println(year);
		
		int month = now.get(Calendar.MONTH);
		System.out.println(month);

	}

}
