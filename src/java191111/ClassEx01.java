package java191111;

import java.util.Scanner;

/*클래스 기본형 점수		:"클래스명, 변수명" : static int a ;
 * 클래스 참조형 변수		:"클래스명, 변수명" : static Tv t;
 * 
 * 인스턴스 기본형 변수	:객체생성->래퍼런스 변수명, 변수명 : int, a;
 * 인스턴스 참조형 변수	:객체생성->래퍼런스 변수명, 변수명 : Tv t; String str
 * 
 * 지역 기본형 변수 		:"분수명" : 메서드안에서 생성, 메서드 종료되면 소묠 
 * 지역 참조형 변수			:"분수명" : 메서드안에서 생성, 메서드 종료되면 소묠:"변수명"
 * 
 *  클래스 매서드 : "클래스명, 매서드명()"
 *  					vod finv)(){/////}
 *  
 *  인스턴스 매서 : 객체생성 ->랜퍼런스 변수명 , 기레
 *  
 */

class Tv1{
	boolean power = false;
	int vol = 0; 
	int ch = 0;
	
	void powerOnOff() {
		power = !power;	
	}

	void chUp() {
		ch++;
	}
	void chDown() {
		ch--;
	}
	
	void chChange(int i) {
		ch = i;
	}
	
	void volUp() {
		vol++;
	}
	
	void volDown() {
		vol--;
	}
	void volChange(int j) {
		vol = j;
	}
	
}	
	public class ClassEx01{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Tv1 t1 = new Tv1();
		System.out.println(t1.power);
		t1.powerOnOff();
		System.out.println(t1.power);
		
	
		System.out.println(t1.ch);
		
		t1.chChange(sc.nextInt());
		System.out.println(t1.ch+"번 채널");
		
		t1.volChange(sc.nextInt());
		System.out.println("소리 크기 "+t1.vol);
		
		
		
	}

}
