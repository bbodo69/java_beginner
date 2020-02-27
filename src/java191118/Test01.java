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
	
	// id, pw, name, age 인스턴스 변수작성
	// get/set 메서드 작성
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//My 타입으로 내 옆자리 모든 학생의 객체 만들어
		//데이터 저장하고 출력하세요.
		
		My my1 = new My();
		My 최병찬 = new My();
		My 고결 = new My();
		My 조소연 = new My();
	
		my1.setId("bbodo629");
		my1.setPw("12345");
		my1.setName("김영래");
		my1.setAge(31);
		System.out.println(my1.getId());
		System.out.println(my1.getPw());
		System.out.println(my1.getName());
		System.out.println(my1.getAge());
		
		최병찬.setId(null);
		최병찬.setPw(null);
		최병찬.setName(null);
		최병찬.setAge(0);
		System.out.println(최병찬.getId());
		System.out.println(최병찬.getPw());
		System.out.println(최병찬.getName());
		System.out.println(최병찬.getAge());
		
	}

}
