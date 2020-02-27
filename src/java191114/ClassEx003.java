package java191114;

import java.util.Scanner;


/*
Grade 클래스를 작성해보세요. 
3과목의 점수를 입력받아 Grade 객체를 생성하고 
성적 평균을 출력하는 main()과 실행 예시는 아래와 같습니다. 

콘솔출력예 )
	수학, 과학, 영어점수를 입력하세요. 
	수학>> 90  (<- 임의로 사용자가 입력한 숫자)
	과학>> 88
	영어>> 96
	평균은 91
*/
class Grade{
	int math;
	int science;
	int english;
	int avg;
	
	Grade(int math, int science,  int english){
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	void average() {
		System.out.println("수학>> "+math+"\n"+"과학>> "+science+"\n"+"영어>> "+english
									+"\n"+"평균은 "+(math+science+english)/3);
	}
}

public class ClassEx003 {
	public static void main(String[] args) {
		
		System.out.println("수학 과학 영어 점수를 입력하세요.");	
		Scanner sc = new Scanner(System.in);
		Grade me = new Grade(sc.nextInt(),sc.nextInt(),sc.nextInt());
		
		me.average();
		
		
		
	}
}
