package java191125;

import java.util.Date;

public class DateEx02 {

	public static void main(String[] args) throws Exception{

		Class cls;
		Object obj;
		//try {
			//forName("Ŭ������ü��") : Ŭ�����̸��� �ش��ϴ� Ŭ���� ��������.
		cls = Class.forName("java.util.Date");
		//new~ : cls�� ���� �ִ� Ŭ����Ÿ������ ��ü ��������.
		obj = cls.newInstance();
		if(obj instanceof Date) {
			Date d = (Date)obj;
			System.out.println(d);
			
		}
//		}catch(Exception e){
//			e.printStackTrace();
//		}

	}

}
