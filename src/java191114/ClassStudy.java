package java191114;
import java.util.Scanner;
////////////////////////////////////////////////////////////////////////////////////////////////////////////
class PersonRsv{
	
	private String seatType;
	private String name;
	private int seatNumber;
	
	PersonRsv(String seatType, String name, int seatNumber){
		this.seatType = seatType;
		this.name = name;
		this.seatNumber = seatNumber;
	}
	PersonRsv(){
		
	}
			
	
	void setSeatType(String seatType) {
		this.seatType= seatType;
	}
	void setName(String name) {
		this.name= name;
	}
	void setSeatNumber(int seatNumber) {
		this.seatNumber= seatNumber;
	}
	
	String getSeatType() {
		return seatType;
		System.out.println(seatType);
	}
	String getName() {
		return name;
	}
	int	 getSeatNumber() {
		return seatNumber;
	}	
}
//class S extends PersonRsv{
//	
//}
//class A extends PersonRsv{
//	
//}
//class B extends PersonRsv{
//	
//}
class arr{

}
////////////////////////////////////////////////////////////////////////////////////////////////////////////
class Reservation{
	 
	
	Scanner sc = new Scanner(System.in);
	int num = Integer.parseInt(sc.nextLine());			//예약:1, 조회:2, 취소:3, 끝내기:4 값 입력
	
	void reservation() {
		
		PersonRsv [] s = new PersonRsv[10];
		PersonRsv [] a = new PersonRsv[10];
		PersonRsv [] b = new PersonRsv[10];
		
		
		
		if(num == 1) {
			System.out.println("좌석타입입력");
			int seatType = Integer.parseInt(sc.nextLine());
			if(seatType == 1) {
				System.out.println("예약자 : ");
				String seatName = sc.nextLine();
				System.out.println("시트번호 : ");
				int seatNumber = Integer.parseInt(sc.nextLine());
				s[seatNumber-1] = new PersonRsv("s", seatName, seatNumber);
				System.out.println(s[seatNumber-1].getName());
			}
		}
	}
}


//class run{
//	System.out.println("예약:1, 조회:2, 취소:3, 끝내기:4");
//}




public class ClassStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reservation r = new Reservation();
		r.reservation();
		System.out.println(s[0].name);
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