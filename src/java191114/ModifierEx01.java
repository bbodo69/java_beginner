package java191114;

class Sample{
	//��ü ����
	public int a;
	//Ŭ���� �ȿ����� ���ٰ���
	private int b;
	//default, ��Ű�� �������� ��밡��
	int c;
	//��Ű��, �ٸ���Ű���� �ڽ� Ŭ�������� ��� ����
	protected int d;
}


public class ModifierEx01 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample s = new Sample();
		s.a = 10;
//		s.b = 5;         //private ������ �̱� ������ �ٸ� Ŭ�������� b ��� �Ұ�		
		
		
		System.out.println(s.a);
	}

}
