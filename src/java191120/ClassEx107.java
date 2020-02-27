package java191120;

import java.util.Scanner;

//인터페이스 (심화)
/*
	Stack 인터페이스를 상속받아 문자열을 저장하는 StringStack 클래스를 구현하세요. 
	아래와 같은 실행결과가 나오도록 main()을 참고하여 작성하세요. 
	실행결과:
		총 스택 저장 공간의 크기 입력 >>  3 (사용자가 입력)
		문자열 입력 >> hello
		문자열 입력 >> sunny
		문자열 입력 >> smile
		문자열 입력 >> happy
		스택이 꽉 차서 푸시 불가!
		문자열 입력 >> 그만
		스택에 저장된 모든 문자열 팝 : smile sunny hello
*/
interface Stack {
	int length();					// 현재 스택에 저장된 개수 리턴
	int capacity();					// 스택의 전체 저장 가능한 개수 리턴
	String pop();					// 스택의 톱(top)에 저장된 문자열 리턴하고 저장소에서 문자열 삭제
	boolean push(String val);		// 스택의 톱(top)에 저장소에 문자열 넣고 실행 결과 boolean 타입으로 리턴
}

class StringStack implements Stack {
	
	Scanner sc = new Scanner(System.in);
	String [] arr ;
	
	StringStack(){
		}
//////////////////////////////////////////////////////////////////////////////////////////////////////
	public int length() {
		
		int count = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == null) {
				count++;
			}
		}
		return count;
	}
////////////////////////////////////////////////////////////////////////////////////////////////////
	public int capacity() {
		int count = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == null) {
				
				count++;
			}
			if(arr[i] != null) {
				System.out.print(arr[i]+"  ");
			}
		}
		return arr.length-count;
	}
////////////////////////////////////////////////////////////////////////////////////////////////////
	public String pop() {
		int a = 0;
		for(int i = 1 ; i < arr.length ; i++) {
			if(arr[arr.length-1] != null) {
				a = arr.length;
			}else if(arr[i] == null) {
				a = i;
				break;
			}
				
		}if(a != 0 ) {
			System.out.println(arr[a-1]);
		}
		return arr[a-1] = null;
		
	}
////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean push(String val) {
		return false;
	}
////////////////////////////////////////////////////////////////////////////////////////////////////
	void run() {
		
		System.out.println("배열 갯수 입력");
		arr = new String [Integer.parseInt(sc.nextLine())];
		
	while(true) {
		String s = "stop";
		System.out.println("1. 문자열 생성, 2.저장 가능한 갯수, 3. 저장 한 갯수, 4.톱 리턴, 문자열 삭제, 5. 스택에 저장된 모든 문자열 출력 ");
		int j = Integer.parseInt(sc.nextLine());
		if(j == 1) {
	
			for(int i = 0 ; i < arr.length ; i++) {
				if(arr[i] == null) {
					System.out.println(i+"번째 배열 내용 입력, 멈추려면 stop 입력");
					String str = sc.nextLine();
					if(str.equals(s)) {
						System.out.println("그만 생성");
						break;
						}
					if(i ==0) {
						arr[0] = str;
						}
					if(i<arr.length && i > 0) {
						arr[i] = str;
					}
				}
						
			}
		}
			
			if(j == 2) {
				System.out.println("빈방 >> " + length());
				}
			if(j==3) {
				System.out.println("채워진 방>>" + capacity());
						
			 	}
		if(j==4) {
			pop();
		}
		
	}
	}
}


public class ClassEx107 {
	public static void main(String[] args) {

		StringStack s = new StringStack();
		s.run();	// 프로그램 구동 시작
		System.out.println(s.length());
		System.out.println(s.capacity());
	}
}
