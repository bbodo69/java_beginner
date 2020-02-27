package java191112;

import java.util.Scanner;

public class Class08 {
	
	static int money = 20000;
	static int total = 0;

////////////////////////////////////////////////////////////////////	
	
	static void menu1() {
		total = total + 2500;
		if((money-total)<=0){
			total = total - 2500;
			System.out.println("잔액이 부족합니다.");
		}
	}
	static void menu2() {
		total = total + 3000;
		if((money-total)<=0){
			total = total - 3000;
			System.out.println("잔액이 부족합니다.");
		}
	}
	static void menu3() {
		total = total + 3500;
		if((money-total)<=0){
			total = total - 3500;
			System.out.println("잔액이 부족합니다.");
		}
	}
	static void menu4() {
		total = total + 4000;
		if((money-total)<=0){
			total = total - 4000;
			System.out.println("잔액이 부족합니다.");
		}
	}
	static void menu5() {
		total = total + 6000;
		if((money-total)<=0){
			total = total - 6000;
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	/*	문제3. 주문프로그램

	*** 글로벌 카페 ***
	1. 아메리카노	: 2500원
	2. 카페라떼		: 3000원
	3. 카푸치노		: 3500원
	4. 카라멜마끼야	: 4000원
	5. 샌드위치		: 6000원
	6. 종료			

	1단계:
	메뉴판 출력하고, 사용자가 원하는 만큼 주문을 받고, 종료를 선택하면, 주문 종료하고
	주문한 총 금액 출력하고 프로그램 종료되게 만들자.
	
	2단계:
	int money = 20000;
	주문시 내돈에서 주문금액 차감.
	돈이 부족하면 주문 못하게 하고, 총액 출력시 잔액 도 출력.
*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("=========================");
		String a = "1. 아메리카노	: 2500원";
		String b = "2. 카페라떼	: 3000원";
		String c = "3. 카푸치노	: 3500원";
		String d = "4. 카라멜마끼야	: 4000원";
		String e = "5. 샌드위치	: 6000원";
		String f = "6. 종료		";
		System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f);
		System.out.println("=========================");
		
	
		

		while(true)
		{
			int i = sc.nextInt();

			if(i == 6){
			System.out.println("주문 총 금액은 "+total+"원 입니다.");
			break;

			}else if(i == 1){
				total = total + 2500;
				if((money-total)<=0){
					total = total - 2500;
					System.out.println("잔액이 부족합니다.");
				}
			}else if(i == 2){
				total = total + 3000;
				if((money-total)<=0){
					total = total - 3000;
					System.out.println("잔액이 부족합니다.");
				}
			}else if(i == 3){
				total = total + 3500;
				if((money-total)<=0){
					total = total - 3500;
					System.out.println("잔액이 부족합니다.");
				}
			}else if(i == 4){
				total = total + 4000;
				if((money-total)<=0){
					total = total - 4000;
					System.out.println("잔액이 부족합니다.");
				}
			}else if(i == 5){
				total = total + 6000;
				if((money-total)<=0){
					total = total - 6000;
					System.out.println("잔액이 부족합니다.");
				}
			}
			else{System.out.println("잘 못 입력했습니다.");
			}
			System.out.println("남은 금액은" + (money-total) + "원 입니다.");
		}
		
	}

}
