package java191114;

class Person2{
	
	private int age = 10;
	void setAge(int age) {
		if(age>0 && age<120)   //������ ������ �޼��� �ȿ��� ����.
										//�̰Ͷ����� private�� �� �� �ִ�.
		this.age = age;
	}
	int getAge() {
		return age;
	}
	
	
}

public class EncapsulEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
