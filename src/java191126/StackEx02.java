package java191126;

import java.util.Stack;

//인터넷 브라우저에 뒤로/앞으로 가기 기능만 구현

public class StackEx02 {
	
	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	//현재 페이지 상태 출력
	public static void status() {
		System.out.println("back : " + back);
		System.out.println("현재페이지 : " + back.peek());
		System.out.println("forward : " + forward);
	}
	
	//웹 페이지 이동
	public static void goURL(String url) {
		back.push(url);	//back의 peek가 현재페이지가 될것 -> 이동하면 back에 쌓기
		if(!forward.empty()) {
			forward.clear(); 												//새 주소로 이동시 기존의 쌓인 forward 기록 삭제.
		}
	}
	//뒤로가기
	public static void goBack() {
		if(!back.empty()) {							//이전에 갔던 페이지가 비어있지 않을때 pop.
		forward.push(back.pop());
		}		
	}
	//앞으로 가기
	public static void goForward() {
		if(!forward.empty()) {
		back.push(forward.pop());
		}
	}
	
	
	
	public static void main(String[] args) {

		goURL("1. 구글");								//주소창 : www.google.com
		goURL("2. 네이버");
		goURL("3. 다음");
		goURL("4. StackoverFlow");
		
		

	}

}
