package java191108;

// 1. Ŭ���� ����
class Person{
	//���� (�Ӽ�)
	String name = "";
	int age = 0;
	//�޼��� (����)
	void eat() {
		System.out.println("�Դ´�");
	}
	void sleep() {
		System.out.println("�ܴ�");
	}		
}

public class Test02 {

	public static void main(String[] args) {
		// ���α׷� ����� ���� �ڵ����� ����(ȣ��)�Ǵ� �޼��� == ���θ޼���
		
		//2. ��ü ����
		Person p1 = new Person(); //��ǰ����
		//3. ��ü ���
		System.out.println("p1 age = "+ p1.age); 
		System.out.println("p1 name = " + p1.name);
		p1.eat();
		p1.sleep();
		
		p1.name = "ȣ���ϵ�";
		p1.age = 1500;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		
	}

}
