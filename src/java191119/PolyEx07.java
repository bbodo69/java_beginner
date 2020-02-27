package java191119;

class Person{}
class Student extends Person{}
class Cooldinator extends Person{}
class Professor extends Person{}

public class PolyEx07 {
	
	static void print(Person p) {//Person p = new Student();
		
		if(p instanceof Person) {
			System.out.println("person type");
			
		}
		if(p instanceof Student) {
			System.out.println("student type");
		}
		if(p instanceof Cooldinator) {
			System.out.println("person type");
		}
		if(p instanceof Professor) {
			System.out.println("person type");
		}
		
	}
	public static void main(String [] args) {
		
		System.out.println("new student : ");
		print(new Student());
		System.out.println("new cooldinator : ");
		print(new Cooldinator());
		System.out.println("professor : ");
		print(new Professor());
		
		//Object는 최상위 클래스로 모든 타입 대입 가능.
		Object obj = new Person();
		
		Person p = new Person();
		Object o = p;
		Student s = (Student)o; //대입은 가능하나 실행하면 에러.
		//Student s = new Person(); 불가능
		
		
	}

}
