package java191113;

public class ThisEx01 {

	// this�� �ν���Ʈ �ż��峪 �����ڿ��� ����
	// �ν��Ͻ� ����
	int x = 10;
	
	void add(int x) {
		this.x=x;
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisEx01 t = new ThisEx01();
		t.add(100);
		System.out.println(t.x);
		
	}

}
