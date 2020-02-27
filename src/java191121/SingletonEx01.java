package java191121;
//�̱���
class SingleT{
	
	//�ν��Ͻ� ����
	int a = 100;
	
	private static SingleT instance = new SingleT();
	private SingleT() {}
	public static SingleT getInstance() {
		return instance;
	}
	
	void func() {
		System.out.println("�̱���");
	}
	
}


public class SingletonEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//SingleT s = new SingleT();
		SingleT s1 = SingleT.getInstance(); //��ü ���� �� ���� ������.
		s1.func();
		System.out.println(s1.a);
		s1.a = 200;
		System.out.println(s1.a);
		SingleT s2 = SingleT.getInstance();
		System.out.println(s2.a);							//heap �� �ϳ��� a�� 200�� �� ����.
		
	}

}
