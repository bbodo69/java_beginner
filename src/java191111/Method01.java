package java191111;

public class Method01 {
	//변수
	//매서드
	//1. 입력값x , 리턴값x
	
	void func1() {
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
	}
	
	//2. 입력값 0 , 리턴값 x
	void printMsg(String msg) {
		System.out.println(msg);
	}
	
	//3. 입력값 x, 리턴값 o
	int returnTen() {
		System.out.println("10을 리턴");
		return 10;
	}
	
	//4. 입력값 o, 리턴값 o
	int mySum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public static void main(String[] args) {

	Method01 m = new Method01();
	
	m.func1();
	
	m.printMsg("내가 출력됬어?");
	
	int result = m.returnTen();
	System.out.println("result =  "+result );
	
	int result2 = m.mySum(1,2);
	System.out.println(result2);
	
	}

}
