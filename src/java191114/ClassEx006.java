package java191114;

import java.util.Scanner;
/*
하루할일을 표현하는 클래스 Day는 다음과 같다. 
한달의 할일을 표현하는 MonthSchedule 클래스를 작성하세요.
MonthSchedule 클래스에는 Day 객체 배열과 적절한 변수,메서드를 작성하고
실행 예시처럼 입력, 보기, 끝내기 등의 3개의 기능을 작성하라. 
 -> 생성자, input(), view(), finish(), run() 메소드 만들기. 
 
#실행예시#
이번달 스케쥴 관리 프로그램. 
할일(입력:1, 보기:2, 끝내기:3) >> 1
날짜(1~30)? 1
할일? 자바공부

할일(입력:1, 보기:2, 끝내기:3) >> 2
날짜(1~30)? 1
1일의 할 일은 자바공부입니다.

할일(입력:1, 보기:2, 끝내기:3) >> 3
프로그램 종료.
*/

class Day { // 그대로놔 두고 문제 푸세요
	
	private String work; // 하루의 할 일을 나타내는 문자열
	void set(String work) { this.work = work; }					//private 된 work 변수를 바꿔주기 위한 메소드
	public String get() { return work; }							//work 변수 출력 메소드
	public void show() {												
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
	}
}

class MonthSchedule {
	
	Scanner sc = new Scanner(System.in);
	
	Day [] day;

	void run() {

		day = new Day [30];
		for(int i = 0 ; i < 30 ; i++) {
			day[i] = new Day();
		}
		
		
		while(true) {
			System.out.println("할일(입력:1, 보기:2, 끝내기:3");
			
			int num4 = Integer.parseInt(sc.nextLine());
			if(num4 == 1) {
				System.out.println("날짜(1~30)?");
				int num1 = Integer.parseInt(sc.nextLine());		
				System.out.println("할일?");
				day[num1-1].set(sc.nextLine());
			}
					
			if(num4 == 2) {
				
				System.out.println("날짜(1~30)?");
				int num5 = Integer.parseInt(sc.nextLine());
				System.out.println(day[num5-1].get());
				}			
			if(num4 == 3) {
				System.out.println("프로그램 종료");
				break;
				}
			if(num4 != 1 && num4 != 2 && num4 != 3) {
				System.out.println("잘 못 입력");
			}
			
			}
	}
	 	
		
}

public class ClassEx006 {
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(); // 4월달의 할 일
		april.run();
		
		
	}
}
