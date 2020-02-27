package Quit;

import java.util.HashMap;

/*
id와 tel(전화번호)로 구성되는 Student클래스를 만들고, 
이름을 key로 하고 Student객체를 값으로 하는 해쉬맵을 작성해보세요.
이름을 검색하면 id와 전화번호 출력되고, exit 입력하면 프로그램 종료. 
*/

class Student {
	static String id;
	static int tel;
	Student(String id, int tel){this.id=id; this.tel=tel;}	
	
	String getValues() {
		return "id : "+id +"    tel : "+tel;
	}	
}




public class CollectionEx02 {
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student("s1",0000);
		Student s2 = new Student("s2",1111);
		Student s3 = new Student("s3",2222);
		Student s4 = new Student("s4",3333);
		Student s5 = new Student("s5",4444);

		s1.getValues();
		
		HashMap<String, Student> h = new HashMap<String, Student>();
		h.put("s1", s1);
		h.put("s1", s2);
		
		//Student ss = h.get(s1);
		System.out.println(h.get("s1"));
	
	}
}
