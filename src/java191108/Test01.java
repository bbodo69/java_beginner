package java191108;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* public : 접근 지정자
		 * class : 클래스 선언 키워드
		 * Test01 : 클래스 이름
		 * {} : 클래스의 영역
		 * 
		 * static : 전역 선언 키워드
		 * void : 리턴타입이 없는 형태, 돌려줄 값이 없다.
		 * main : 메서드 이름
		 * {String[] args) : 매개변수
		 * {} : main 메서드 영역
		 * 
		 * 1. 선언
		 * 		클래스명 래퍼런스 변수명;
		 * 
		 * 		Scanner sc;
		 * 		String str;
		 * 
		 * 2. 생성
		 * 		래퍼런스변수명 = new 클래스명();
		 * 
		 * 		sc = new Scanner(System.in)
		 * 		str = new String("hello");
		 * 
		 * 3. 선언 + 생성
		 * 		클래스명 래퍼런스변수명 = new 클래스명();
		 * 		Scanner sc = new Scanner();
		 * 		String str = new String("hello");
		 * 
		 * 	래퍼런스 변수 : 객체를 가르키는, 객체의 주소를 담고 있을 변수.
		 * 	new : 메모리에 로딩시키는 키워드 -> 생산한다.	
		 * 	객체 맴버에 접근 : 점(.)연산자
		 * 
		 * 4. 변수의 종류
		 * 		: 선언 위치(어디에서 변수가 만들어졌느냐)에 따라 변수의 종류와 성질이 달라짐
		 * 		1)클래스
		 * 			-클래스내에 생성
		 * 			-이름 앞에 static 키워드가 붙는다.
		 * 			
		 * 			종류 : 클래스 래퍼런스변수 // 클래스 기본형 변수
		 * 				static String str; // static int a
		 * 				static Scanner sc ;  // statin double b
		 * 			특징 : 모든 개체들이 공유하는 변수
		 * 				가장 먼저 생선됨.
		 * 				new로 생성하지 않아도 바로 사용가능
		 * 			접근법 : 클래스명.변수명
		 * 					래퍼런스변수명,변수명
		 * 
		 * 		2)인스턴스
		 * 			-클래스 내에 생성
		 * 			종류 : 이스턴트 레퍼런스 변수 // 인스턴스 기본형 변수
		 * 			특징 : 각 매체의 개별적인 저장 공간 존재함.
		 * 				new를 한 후 (객체 생성후)메모리에 올라가면 사용가능.
		 * 				가느키는 참조변수가 없을 경우 가비지 콜렉터가 수거함 
		 * 		3)지역
		 * 			-래퍼런스변수명, 인터스턴트 변수명
		 * 			메서트 내에 생선됨 : 지역 래퍼런스 변수 / 지역 기본형 변수
		 * 		
		 * 			특징 ;메서드(조건문, 반복문, 변수를 가저가며 메서드 
		 * 
		 * # 메모리 로딩 순서
		 * 	클래스 -> static -> main 실행 -> new(객체)
		 * 	:클래스 범위 만들고
		 * 		:메모리에 메인포함 로딩
		 *     		:main 메서드가 있으면 실행
		 *     			:main 시행하면서 객체들 생성되고 사용됨.
		 */
		
		
	}

}
