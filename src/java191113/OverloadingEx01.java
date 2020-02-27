package java191113;

public class OverloadingEx01 {
	// 메서드 오버로딩
	//#1. 매개변수 개수가 다른경우
	int getSum(int a, int b) {
		return a+b;
	}
	int getSum(int a, int b, int c) {
		return a+b+c;
	}
	//#2. 매개변수의 타입이 다른 경우
	int getMul(int a, int b) {
		return a*b;
	}
	int getMul(int a, double b) {
		return a*(int)b;
	}
/*	
	//#3. 매개변수, 매개변수 타입이 같기 때문에 오버로딩 불가
	int getSub(int a, int b) {
		return a - b ; 
	}
	double getSub(int a, int b) {
		return a - b ; 
	}
	//#4. 매개변수 갯수가 같기 때문에 오버로딩 불가
	int getDiv(int a , int b) {
		return a / b;		
	}
	int getDiv(int c , int d) {
		return a / b;		
	}
	
	
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingEx01 o = new OverloadingEx01();
		
		int result = o.getSum(3, 10);
		System.out.println(result);
		
		int result1 = o.getSum(1, 6, 10);
		System.out.println(result1);
		
	}

}
