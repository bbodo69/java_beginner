package java191120;
//�Ʒ� �߻�Ŭ���� Calculator�� ��� ���� MyCalc Ŭ������ ��������.
abstract class Calculator{
	public abstract int add(int a, int b);
	public abstract int substract(int a, int b);
	public abstract double average(int [] a ); // �迭�� ����� ������ ��հ��� ����
}

class MyCalc extends Calculator{
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int [] a) {
		
		double total = 0;
		
			for(int i = 0 ; i < a.length ; i++) {
			total = total + a[i];
		}
		return total / a.length;
	}
}

public class ClassEx100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalc my = new MyCalc();
		System.out.println(my.add(1, 3));
		System.out.println(my.substract(2, 4));
		int [] arr = {200,300,400};
		System.out.println(my.average(new int[]{100,30,40}));
		System.out.println(my.average(arr));
	}

}
