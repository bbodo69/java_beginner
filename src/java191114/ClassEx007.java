package java191114;

import java.util.Scanner;

class Info{
	
	private String name;
	private String type;
	private int number;
	
	void setName(String name) {this.name = name;}
	void setType(String type) {this.type = type;}
	void setNumber(int number) {this.number = number;}
	String getName() {return name;}
	String getType() {return type;}
	int getNumber () {return number;}
	
	Info(String type, String name, int number){					//생성자
		this.name = name;
		this.type = type;
		this.number = number;
	}
	
	Info(){
		
	}
	
}

class Reserve{
	Scanner sc = new Scanner(System.in);
	Info [] s; 
	Info [] a;
	Info [] b;
	
			
	void menu() {
		
	}
	
	void run() {
		
		s = new Info[10];
		a = new Info[10];
		b = new Info[10];
		
		Info s = new Info();
		Info a = new Info();
		Info b = new Info();
		
	}
	
	void seatType() {
		int numType = Integer.parseInt(sc.nextLine());
		System.out.println("좌석타입, 예약자이름, 좌석번호 입력");
		if(numType == 1) {			
			String seatType = sc.nextLine();
			String seatName = sc.nextLine();
			int seatNumber = Integer.parseInt(sc.nextLine());
			s[i] = 
			
		}
		if(numType == 2) {			
			String seatType = sc.nextLine();
			String seatName = sc.nextLine();
			int seatNumber = Integer.parseInt(sc.nextLine());			
			a[seatNumber-1] = new Info(seatType,seatName,seatNumber);					
		}
		if(numType == 3) {			
			String seatType = sc.nextLine();
			String seatName = sc.nextLine();
			int seatNumber = Integer.parseInt(sc.nextLine());
			b[seatNumber-1] = new Info(seatType,seatName,seatNumber);					
		}
		if(numType != 1 && numType != 2 && numType != 3 ) {
			System.out.println("잘못입력");
		}
	}
		
	
	
	void input() {
		Reserve r = new Reserve();
		while(true) {
			System.out.println("예약:1, 조회:2, 취소:3, 끝내기:4");
			int menu = Integer.parseInt(sc.nextLine());
			if (menu == 1) {
				System.out.println("좌석구분 S(1), A(2), B(3)");			
				r.seatType();
			}
			if (menu == 2) {
				
			}
			if (menu == 3) {
				
			}
			if (menu == 4) {
				break;
			}
			else {
				return;				
			}
		}
	}
	
}
/*
콘서트 예약 프로그램. 
- 공연은 하루에 한번
- 좌석은 S석, A석, B석으로 나뉘며, 각각 10개의 좌석이 있다. 
- 예약 시스템의 메뉴는 "예약", "조회", "취소", "끝내기"가 있다. 
- 예약은 한자리만 가능하고, 좌석타입, 예약자이름, 좌석번호를 입력받아 예약한다.
- 조회는 모든 좌석을 출력한다.
- 취소는 예약자의 이름을 입력받아 취소한다.
- 없는 이름, 없는 번호, 없는 메뉴, 잘못된 취소등에 대해서
  오류 메세지를 출력하고 사용자가 다시 시도하도록 한다.
  
# 실행예시 #
자바콘서트홀 예약시스템입니다.
예약:1, 조회:2, 취소:3, 끝내기:4 >> 1
좌석구분 S(1), A(2), B(3) >> 1
S >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ 
이름 >> 피카츄
번호 >> 1
<<예약완료>>

예약:1, 조회:2, 취소:3, 끝내기:4 >> 1
좌석구분 S(1), A(2), B(3) >> 2
A >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
이름 >> 꼬북이
번호 >> 5
<<예약완료>>

예약:1, 조회:2, 취소:3, 끝내기:4 >> 2
S >> 피카츄 ___ ___ ___ ___ ___ ___ ___ ___ ___
A >> ___ ___ ___ ___ 꼬북이 ___ ___ ___ ___ ___
B >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
<<조회완료>>

예약:1, 조회:2, 취소:3, 끝내기:4 >> 3
좌석구분 S(1), A(2), B(3) >> 2
A >> ___ ___ ___ ___ 꼬북이 ___ ___ ___ ___ ___
이름 >> 꼬북이
<<취소완료>>

예약:1, 조회:2, 취소:3, 끝내기:4 >> 2
S >> 피카츄 ___ ___ ___ ___ ___ ___ ___ ___ ___
A >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
B >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
<<조회완료>>

예약:1, 조회:2, 취소:3, 끝내기:4 >> 4
<<프로그램 종료>>
*/

public class ClassEx007 {
	public static void main(String[] args) {
			Reserve reserve = new Reserve();
			reserve.run();
			reserve.input();
			
	}
}
