package java191111;

public class Method01 {
	//����
	//�ż���
	//1. �Է°�x , ���ϰ�x
	
	void func1() {
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
	}
	
	//2. �Է°� 0 , ���ϰ� x
	void printMsg(String msg) {
		System.out.println(msg);
	}
	
	//3. �Է°� x, ���ϰ� o
	int returnTen() {
		System.out.println("10�� ����");
		return 10;
	}
	
	//4. �Է°� o, ���ϰ� o
	int mySum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public static void main(String[] args) {

	Method01 m = new Method01();
	
	m.func1();
	
	m.printMsg("���� ����?");
	
	int result = m.returnTen();
	System.out.println("result =  "+result );
	
	int result2 = m.mySum(1,2);
	System.out.println(result2);
	
	}

}
