package java191120;
//추상 클래스 (심화)
/*
	키와 값을 하나의 아이템으로 저장하고 검색 수정이 가능한 
	PairMap 추상 클래스가 있습니다.
	PairMap을 상속받는 Dictionary클래스를 구현하고, 
	main()메서드 실행시 아래와 같은 결과가 나오도록 하세요.
	실행결과 : 
		노현태의 값은 빅데이터
		김아림의 값은 자바
		김아림의 값은 null
*/

abstract class PairMap {
	protected String [] keyArray;		// key들을 저장하는 배열
	protected String [] valueArray;		// value들을 저장하는 배열
	abstract String get(String key);	// key값을 가진 value리턴. 없으면 null리턴
	abstract void put(String key, String value);	// key와 value를 쌍으로 저장, 기존에 key가 있으면, 값을 value로 수정
	abstract String delete(String key);	// key값을 가진 아이템(value와 함께) 삭제. 삭제된 value값 리턴
	abstract int length();				// 현재 저장된 아이템의 개수 리턴
}
public class ClassEx108 {
	public static void main(String[] args) {

		//Dictionary dic = new Dictionary(10);
		//dic.put("최현수", "자바");
		//dic.put("김주희", "jsp");
		//dic.put("김영래", "안드로이드");
		//dic.put("김영래", "빅데이터");							// 김영래의 값을 빅데이터로 수정
		//System.out.println("김영래의 값은 "+dic.get("김영래"));
		//System.out.println("최현수의 값은 "+dic.get("최현수"));
		//dic.delete("최현수");										// 최현수 아이템 삭제
		//System.out.println("최현수의 값은 "+dic.get("최현수"));	// 삭제된 아이템 접근

	}
}
