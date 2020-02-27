package java191112;
/*
 Tv기능 구현
 1. 채널 = 배열[10] 생성후 랜덤값 10개 받아, 낮은값부터 대입
 2. 채널 Up, Down = 배열의 현재위치에서 증감
 3. 채널값 입력받아 변경(채널에 맞는 값이 아닌경우 변경 불가)
 4. 볼륨 Up, Down = 볼륨은 0 ~ 10 까지 증감
 5. 볼륨 음소거 기능
 6. Tv정보기능 - 메서드 호출시 Tv 상태 출력(채널, 볼륨, 전원) - showInfo
 7. 전원이 꺼져있는 경우 모든 기능 동장 안함.
 8. 
 */

import java.util.Scanner;

class Tv{
	
	Scanner sc = new Scanner(System.in);
	
	boolean power = false;
	int chBasic = 0;
	int volBasic = 0;
	String str = sc.nextLine();
	 
		void OnOff() {
		
		}
		
				
	
	
	//전원
	
		void powerOnOff () {
		power = !power;
	}
	
	//채널 생성
	int [] ch	 = new int [10];
	int tmp;
	int k;
	 
	
	
	void chRandom() {
		
		if(power == true) {
			for(k = 0 ; k < ch.length; k++) {	
				ch[k] = (int)(Math.random()*300+1);
				}
			for(int i = 0 ; i < ch.length; i++) {
				for(int j = 0 ; j < ch.length-1; j++) {
					if(ch[j] > ch[j+1]) {
						tmp = ch[j];
						ch[j] = ch[j+1];
						ch[j+1] = tmp;
					}
				}
			}
		}else{System.out.println("전원을 켜주세요");
	}
	}
	
	//채널 출력
		void chList() {
			if(power == true) {
			System.out.print("현재 가지고 있는 채널은 ");
			for(int i = 0 ; i < ch.length ; i++) {
				System.out.print(ch[i]+" ");
			}
		}else{System.out.println("전원을 켜주세요");
		}
	}
	

	//기본 채널
		
	int basic() {
		System.out.println();
		System.out.println("기본채널 = "+ ch[0]+" 번");
		return ch[0];
	}
	
	//채널 Up, Down
	void chUp() {
		if(power == true) {
		if(chBasic <=9)
		chBasic++;
		if(chBasic == 10) {
			chBasic = 0;
		}System.out.println("현재 채널 = " +ch[chBasic]);
		}else{System.out.println("전원을 켜주세요");
		}
	}
		
		
	
	void chDown() {
		if(power == true) {
		if(chBasic>=0) {
		chBasic --;
		}
		if(chBasic == -1) {
			chBasic = 9;
		}System.out.println("현재 채널 = " +ch[chBasic]);
		}else{System.out.println("전원을 켜주세요");
		}
	}


//채널값 입력받아 변경(채널에 맞는 값이 아닌경우 변경 불가)

	void chChange(int c) {
		if(power == true) {
		for(int i = 0 ; i < ch.length ; i++) {
			if(c == ch[i]) {
			chBasic = i;					
			System.out.println("현재채널 = "+ch[i]);

			}
		}
	}else{System.out.println("전원을 켜주세요");
	}
	}

//현재 상태
	void info() {
		if(power == true) {
		System.out.println(" 채널 = " + ch[chBasic] +"   소리 = "+volBasic);
	}else{System.out.println("전원을 켜주세요");
}
}
}

public class ClassEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv t = new Tv();
		
		t.powerOnOff();
						
		t.chRandom();
		
		t.chList();
				
		t.basic();
		
		t.chUp();
		
		t.chChange(t.sc.nextInt());
		t.chUp();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		
		t.info();
		
				
	}

}
