package java191114;

class Person2{
	
	private int age = 10;
	void setAge(int age) {
		if(age>0 && age<120)   //데이터 검증을 메서드 안에서 수행.
										//이것때문에 private를 쓸 수 있다.
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
