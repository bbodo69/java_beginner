package java191121;

class Person{
	void wake() {
		System.out.println("7�ÿ� ���");
	}
}

class Anony {
	//Person p = new Person();
	//�ʱⰪ���� �����ϴ� ����
	Person p = new Person() {
		void work() {
			System.out.println("���");
		}
		void wake() {
			System.out.println("6�ÿ� ���");
			work();
		}
	};
	
	void func() {
		//�������� ������ ����
		Person localP = new Person() {
			void walk() {
				System.out.println("��å");
			}
			void wake() {	
				System.out.println("7�ÿ� ���");
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
		
	//�͸� ��ä �ް��� ���
	Annoy.func2(new Person() {
		void stusy() {
			System.out.println("���ΰ���");
		}
		void wake() {
			System.out.println("8�ÿ� ����);"
			Study();
		}
	}
	
	
	//a.average(new int[] {1,2,3,4,5}];
	
	};
}
