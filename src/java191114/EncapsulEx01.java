package java191114;

class Person{
	
	// ���� : private
	private String name;
	private int age;
	//get �ż��� : public
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	//set �ż��� : public
	void setName(String name) {
		this.name = name;
	}
	void setAge(int age) {
		this.age = age;
	}
}


public class EncapsulEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.setName("�迵��");
		System.out.println(p1.getName());
		
		Person p2 = new Person();
		p2.setName("������");
		System.out.println(p2.getName());
		
	}
		

}
