
package java191111;

class Calc{
	// 각각 매서드는 int 형 데이터 두개를 입력받아 연산 결과를 돌려준다
	// 덧셈에서도 mySum
	// 뺄셈에서도 mySub
	//곱셈에서도 myMul
	// 나눗셈에서도 myDiv
	
	int mySum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	int mySub(int num1, int num2) {
		int sub = num1 - num2;
		return sub;
	}
	
	int myMul(int num1, int num2) {
		
		return  num1 * num2;
	}
	
	int myDiv(int num1, int num2) {
		if(num2 ==0) {
			System.out.println("0으로 나눌수 없습니다.");
			return 0;
		}else {
		int Div = num1 / num2;
		return Div;
		}
	}
		
}

public class MethodEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc cal = new Calc();
		
		int sum = cal.mySum(5, 6);
		System.out.println(sum);
		
		int sub = cal.mySub(11, 6);
		System.out.println(sub);
		
		int mul = cal.myMul(5, 0);
		System.out.println(mul);
		
		int div = cal.myDiv(120, 5);
		System.out.println(div);
		
		int sum1 = 5+11;
		System.out.println(sum1);
		
		
	}

}
