package java191113;

public class OverloadingEx01 {
	// �޼��� �����ε�
	//#1. �Ű����� ������ �ٸ����
	int getSum(int a, int b) {
		return a+b;
	}
	int getSum(int a, int b, int c) {
		return a+b+c;
	}
	//#2. �Ű������� Ÿ���� �ٸ� ���
	int getMul(int a, int b) {
		return a*b;
	}
	int getMul(int a, double b) {
		return a*(int)b;
	}
/*	
	//#3. �Ű�����, �Ű����� Ÿ���� ���� ������ �����ε� �Ұ�
	int getSub(int a, int b) {
		return a - b ; 
	}
	double getSub(int a, int b) {
		return a - b ; 
	}
	//#4. �Ű����� ������ ���� ������ �����ε� �Ұ�
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
