package Quit;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


//HashMap을 이용하여 학생 이름과 자바 점수를 기록하는 관리 프로그램을 작성하세요. 
// 아래 프로그램 메뉴에서 각 번호로 서비스 선택하고, 
// 6번을 입력받으면 프로그램 종료. 
/*
 	** 자바 성적 관리 프로그램 **
	1. 전체 조회 
	2. 등록
	3. 수정
	4. 삭제
	5. 전체 평균
	6. 프로그램 종료
*/
public class CollectionEx01_1 {
	
	static Scanner sc = new Scanner(System.in);
	public static HashMap<String, Integer> h = new HashMap<String, Integer>();
	
	public static void list() {
			System.out.println("성적 리스트");
		System.out.println(h.entrySet());
	}
	public static void put() {
		System.out.println("이름과 성적 입력");
		h.put(sc.nextLine(), Integer.parseInt(sc.nextLine()));
//		h.put("김나박이", 22);
//		h.put("김나박이1", 33);
//		h.put("김나박이2", 66);
	}
	public static void set() {
		System.out.println("수정할 이름과 성적 입력");
		h.replace(sc.nextLine(), Integer.parseInt(sc.nextLine()));
		
	}
	public static void remove() {
		System.out.println("삭제할 이름 입력");
		h.remove(sc.nextLine());
	}
	public static void avg() {
		int total = 0;
		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();		//Iterator 는 
		while(it.hasNext()) {
			
			String key = it.next();
			int value = h.get(key);
			System.out.println(value);
			 total += value; 
			 System.out.println((float)total/h.size());
		
			
		}
	}
		
	
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("** 자바 성적 관리 프로그램 **\r\n" + 
					"	1. 전체 조회 \r\n" + 
					"	2. 등록\r\n" + 
					"	3. 수정\r\n" + 
					"	4. 삭제\r\n" + 
					"	5. 전체 평균\r\n" + 
					"	6. 프로그램 종료");
			int i = Integer.parseInt(sc.nextLine());
			
			if(i == 1) {
				CollectionEx01_1.list();
				
			}
			else if(i == 2) {
				CollectionEx01_1.put();
				
			}
			else if(i == 3) {
				CollectionEx01_1.set();
				
			}
			else if(i == 4) {
				CollectionEx01_1.remove();
			}
			else if(Integer.parseInt(sc.nextLine()) == 5) {
				CollectionEx01_1.avg();
			}
			else if(i == 6) {
				
				break;
			}
		}
		  			 
	}
}
