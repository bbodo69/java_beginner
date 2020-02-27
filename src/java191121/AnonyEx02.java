package java191121;

class Person{
	void wake() {
		System.out.println("7시에 기상");
	}
}

class Anony {
	//Person p = new Person();
	//초기값으로 대입하는 형태
	Person p = new Person() {
		void work() {
			System.out.println("출근");
		}
		void wake() {
			System.out.println("6시에 기상");
			work();
		}
	};
	
	void func() {
		//지역변수 값으로 대입
		Person localP = new Person() {
			void walk() {
				System.out.println("산책");
			}
			void wake() {	
				System.out.println("7시에 기상");
				walk();
			}
		};
		localP.wake();
		
	}
	
}



public class AnonyEx02 {

	public static void main(String[] args) {
		
		//#2
		MY m 
	}
		
		Person p= new Person();
		p.wake();

		Anony anony = new Anony();
		
		anony.p.wake();
		
	
	anony.func();
		
	//익명 객채 메개값 사용
	Annoy.func2(new Person() {
		void stusy() {
			System.out.println("공부공부");
		}
		void wake() {
			System.out.println("8시에 기장);"
			Study();
		}
	}
	
	
	//a.average(new int[] {1,2,3,4,5}];
	
	};
}
