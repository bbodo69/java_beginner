package java191112;

import java.util.Scanner;

/*
Tv 기능 구현
 1. 채널 = 배열[10] 생성후 랜덤값 10개 받아, 낮은값부터 대입
 2. 채널 Up, Down = 배열의 현재위치에서 증감
 3. 채널값 입력받아 변경(채널에 맞는 값이 아닌경우 변경 불가)
 4. 볼륨 Up, Down = 볼륨은 0 ~ 10 까지 증감
 5. 볼륨 음소거 기능 
 6. Tv정보기능 -  메서드 호출시 Tv상태 출력(채널,볼륨,전원)
 7. 전원이 꺼져있는 경우 모든 기능 동작 안함.
*/
class Tv123{ // 변수 + 메서드
	// 변수
	boolean power = false;
	int [] channel = new int[10]; // 랜덤 채널들 저장소
	int chIdx = 0;	// channel 배열의 인덱스번호 담을 변수
	int vol = 0, ch = 0;
	////////////////////////////////////////////////////////////////////////
	// 메서드
	void setTv() {
		if(power) {
			// 채널 세팅
			// 채널 10개 랜덤으로 받기
			for(int i = 0; i < 10; i++) {
				// 랜덤 받기
				channel[i] = (int)(Math.random() * 100) + 1;
				// 중복 확인
				for(int j = 0; j < i; j++) {
					if(channel[i] == channel[j]) {
						i--;
						break;
					}
				}
			}
			// 채널 정렬시키기
			for(int i = 0; i < channel.length-1; i++) {
				int min = i;
				for(int j = i+1; j < channel.length; j++) {
					if(channel[min] > channel[j]) {
						min = j;
					}
				}
				int tmp = channel[i];
				channel[i] = channel[min];
				channel[min] = tmp;
			}
			System.out.print("채널 : ");
			for(int i : channel) {
				System.out.print(i + " ");
			}
			System.out.println();
			
			// 채널 세팅후, 첫번째 채널의 번호를 ch에 담기
			ch = channel[0];	
			chIdx = 0;
		}else {
			System.out.println("전원을 켜주세요.");
		}
		
	}
	void powerOnOff() {
		// 전원 on off 기능
		power = !power;
	}
	void chUp() {
		if(power) { // power가 true일때만 작동해라.
			// 채널 up
			chIdx++;
			if(chIdx == 10) {
				chIdx = 0;
			}
			ch = channel[chIdx];
		}else {
			System.out.println("전원을 켜주세요");
		}
	}
	void chDown() {
		if(power) {
			// 채널 down
			chIdx--;
			if(chIdx == -1) {
				chIdx = 9;
			}
			ch = channel[chIdx];
		}else {
			System.out.println("전원을 켜주세요");
		}
	}
	/*
	void chChange(int c) {
		if(power) {
			for(int i = 0; i < channel.length; i++) {
				if(channel[i] == c) {
					chIdx = i;
					ch = channel[chIdx];
				}
			}
		}else {
			System.out.println("전원을 켜주세요");
		}
	}
	*/
	void chChange() {
		if(power) {
			Scanner sc = new Scanner(System.in);
			System.out.print("채널 :");
			for(int a : channel) System.out.print(a);
			System.out.println();
			System.out.println("바꿀 채널 번호 입력하세요 : ");
			int input = Integer.parseInt(sc.nextLine());
			
			// 입력받은 채널이 channel배열에 있는지 검사
			for(int i = 0; i < channel.length; i++) {
				if(channel[i] == input) { // 있으면 
					chIdx = i;				// 인덱스번호 바꾸고
					ch = channel[chIdx];	// 바뀐인덱스번호에 실제 채널번호저장.
				}
			}
		}else {
			System.out.println("전원을 켜주세요.");
		}
	}
	
	void volUp() {
		if(power) {
			// 볼륨 up 0~10
			if(vol < 10) { // vol이 10보다 작을때 볼륨을 1 높여라
				vol++;
			}
		}else {
			System.out.println("전원을 켜주세요");
		}
	}
	void volDown() {
		if(power) {
			// 볼륨 down
			if(vol > 0) { // vol이 0 보다 클때만 볼륨을 1 줄여라
				vol--;
			}
		}else {
			System.out.println("전원을 켜주세요");
		}
	}
	void mute() {
		if(power) {
			// 음소거기능
			vol = 0;
		}else {
			System.out.println("전원을 켜주세요");
		}
	}
	void showTvInfo() {
		if(power) {
			// tv정보 출력(전원, 채널, 볼륨)
			System.out.println("전원 : " + (power?"ON":"OFF") + " 채널 : " + ch + " 볼륨 : " + vol);
		}else {
			System.out.println("전원을 켜주세요");
		}
	}
}
public class ClassEx06111 {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);

		Tv123 t = new Tv123(); 	// tv 만들기
		t.powerOnOff();		// tv 키고
		t.setTv(); 			// 채널 세팅
		t.showTvInfo();
		t.volUp();
		t.volUp();
		t.volUp();
		t.showTvInfo();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		//System.out.println("채널 입력: ");
		//int input = Integer.parseInt(sc.nextLine());
		//t.chChange(input);
		t.chChange();
		t.showTvInfo();
		t.chUp();
		t.showTvInfo(); 
		t.chDown();
		t.chDown();
		t.powerOnOff();
		t.chDown();
		t.showTvInfo();
		
		// 볼륨키우고
		// 채널 up / down
		// 음소거
		// 음소거 풀고
		// 다른채널 본다
		// 소리 키우기..
		
	}
}
//변수 값대입, for, if,while, do-while, switch, ..... 모두 다 
//메서드 안에 있어야한다. 









