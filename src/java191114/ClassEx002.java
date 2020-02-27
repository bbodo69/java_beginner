package java191114;

/*
	main()메소드를 실행하였을때 예시와 같이 출력되도록 TvClass클래스를 작성하세요. 
	콘솔출력예 >> LG에서 만든 2018년형 32인치 TV
*/

class TvClass{
	String name;
	int year;
	int inch;
	
	TvClass(String name, int year, int inch){
		this.name = name;
		this.year = year;
		this.inch = inch;
	}
	
	void show() {
		System.out.println(name+"에서 만든 "+year+"년형 "+inch+"인치 TV");
	}
}

public class ClassEx002 {
	
	public static void main(String[] args) {
		
		TvClass myTV = new TvClass("LG", 2018, 32);
		myTV.show();

	}
}
