package java191121;

interface MyInter{
	void func();
	
}


public class AnonyEx01 {

	public static void main(String[] args) {


		//#1. �������̽� ������ �߻�޼��� �������̵�(����)
		//	��ü�����Ͽ�, �޼��� ȣ����� �ѹ��� �ذ�.
		new MyInter() {
			// interface �� �߻�޼��� ����
			public void func() {
				System.out.println("MyInter�� func() �������̵�");
			}
			
		}.func();
	}

}
