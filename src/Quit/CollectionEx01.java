package Quit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

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
 class Student5{
	static HashMap<String, Integer> h = new HashMap<String, Integer>();
	static Scanner sc = new Scanner(System.in);
	
	static void List() {
		Iterator<String> it = h.keySet().iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name+"  "+ h.get(name));
		}	
	}	
	static void put() {
		System.out.println("등록 할 이름, 성적 >> ");
		h.put(sc.nextLine(), Integer.parseInt(sc.nextLine()));
		
	}
	static void set() {
		System.out.println("수정 할 이름, 성적 >> ");
		h.put(sc.nextLine(), Integer.parseInt(sc.nextLine()));
	}
	
	static void remove() {
		System.out.println("삭제 할 이름 >> ");
		h.remove(sc.nextLine());
	}
	static void avg() {
		Iterator <String> it = h.keySet().iterator();
		double total = 0;
		while(it.hasNext()) {
			String name = it.next();
			total += h.get(name);
		}System.out.println("평균 "+total/h.size());
	}
}

public class CollectionEx01 {
		
	public static void main(String[] args) {
		Student5 st = new Student5();		 
				
		while(true) {
			System.out.println("** 자바 성적 관리 프로그램 **\r\n" + 
					"	1. 전체 조회 \r\n" + 
					"	2. 등록\r\n" + 
					"	3. 수정\r\n" + 
					"	4. 삭제\r\n" + 
					"	5. 전체 평균\r\n" + 
					"	6. 프로그램 종료");
			int i = Integer.parseInt(Student5.sc.nextLine());
			if( i == 1) {				
				Student5.List();
			}
			if( i == 2) {
				Student5.put();
			}
			if( i == 3) {
				Student5.set();
			}
			if( i == 4) {
				Student5.remove();
			}
			if( i == 5) {
				Student5.avg();
			}
			if( i == 6) {
				break;
			}
		}
		
	}
}
