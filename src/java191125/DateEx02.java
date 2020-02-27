package java191125;

import java.util.Date;

public class DateEx02 {

	public static void main(String[] args) throws Exception{

		Class cls;
		Object obj;
		//try {
			//forName("클래스전체명") : 클래스이름에 해당하는 클래스 리턴해줌.
		cls = Class.forName("java.util.Date");
		//new~ : cls가 갖고 있는 클래스타입으로 객체 생성해줌.
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
