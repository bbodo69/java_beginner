package java191120;
// �������̽� ����
interface Test{
	public static final int NUM = 1; //���
	public abstract void add();		//�߻�޼���
}
// �������̽� ����
interface Test2{
	void sub();
}
class Inter implements Test, Test2{//NUM, add()
	@Override
	public void add() {
		System.out.println("implements");
	}

	@Override
	public void sub() {
		System.out.println("sub");
	}
	
}



public class InterEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inter i = new Inter();
		i.add();
		i.sub();
		
		//������
		Test t = new Inter();
		t.add();
		
		Test2 t2 = new Inter();
		t2.sub();
		
		
				//new Inter �� ���� ��� �ɹ��� �����ϱ� ���ؼ���
				//InterŸ���� ���۷��� ������ Inter Ÿ������ ����ȯ�ؼ� �����Ͽ�
				//Inter Ÿ�̕� ���۷��� ������ ����Ͽ� �����ؾ��Ѵ�.
				
		Inter it = null;
		if(t instanceof Inter) { // t�� ����Ű�� ��ü�� Inter �� ��ü��� 
			it = (Inter)t;			//it�� t�� �����ض�
		}
		it.add();
		it.sub();
		System.out.println(it.NUM);
		
		}
		
	}


