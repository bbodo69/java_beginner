package java191108;

class Tv{
	boolean power = false;
	int vol = 0, ch = 1;
}

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t;         //����
		t = new Tv(); //����(�޸� ��������)
		
		//Tv t = new Tv();
		
		System.out.println(t.power);
		System.out.println(t.ch);
		System.out.println(t.vol);
		
		t.power = true;
		t.ch = 10;
		t.vol = 100;
		
		System.out.println(t.power);
		System.out.println(t.ch);
		System.out.println(t.vol);
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		Tv t3 = new Tv();
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		// ��Ű����, Ŭ������ @ ��ü������ȣ
		
		t1.ch = 10;
		System.out.println(t1.ch);
		
		
		//���� Ÿ�Գ��� ���԰���
		int a = 10;
		int b = 20;
		
		//Tv ��� ���� Ÿ���̶� ���԰���.
		t1 = t2;
		t2 = t1;
		
		}
		
	}


