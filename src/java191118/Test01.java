package java191118;

class My{
	
	private String id;
	private String pw;
	private String name;
	private int age;
	
		void setId(String id){
			this.id = id;
		}
		String getId() {
			return id;
		}
		void setPw(String pw){
			this.pw = pw;
		}
		String getPw() {
			return pw;
		}
		void setName(String name) {
			this.name = name;
		}
		String getName() {
			return name;
		}
		void setAge(int age) {
			this.age = age;
		}
		int getAge() {
			return age;
		}
}


public class Test01 {
	
	// id, pw, name, age �ν��Ͻ� �����ۼ�
	// get/set �޼��� �ۼ�
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//My Ÿ������ �� ���ڸ� ��� �л��� ��ü �����
		//������ �����ϰ� ����ϼ���.
		
		My my1 = new My();
		My �ֺ��� = new My();
		My ��� = new My();
		My ���ҿ� = new My();
	
		my1.setId("bbodo629");
		my1.setPw("12345");
		my1.setName("�迵��");
		my1.setAge(31);
		System.out.println(my1.getId());
		System.out.println(my1.getPw());
		System.out.println(my1.getName());
		System.out.println(my1.getAge());
		
		�ֺ���.setId(null);
		�ֺ���.setPw(null);
		�ֺ���.setName(null);
		�ֺ���.setAge(0);
		System.out.println(�ֺ���.getId());
		System.out.println(�ֺ���.getPw());
		System.out.println(�ֺ���.getName());
		System.out.println(�ֺ���.getAge());
		
	}

}
