package java191113;

import java.util.Scanner;

// Book클래스를 활용하여 2개짜리 객체 배열을 만들고,
// 사용자로부터 책의 제목과 저자를 입력받아 배열을 완성하고 출력하자.
	
class Book1{
	String title;
	String author;

//	Book1(){
//		
//	}
//	
//	Book1(String title){
//		this(title,"unknown");
//	}
	
	Book1(String title, String author){
		this.title = title;
		this.author = author;
	}
}


public class ClassArrEx02 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
				
		Book1 [] arr = new Book1[2];		// 책장 -> 책 객체 지정
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println("제목");
			String title = sc.nextLine();
			System.out.println("저자");
			String author = sc.nextLine();
			arr[i] = new Book1(title, author);
		}
		
//		System.out.println("1번 책 제목과 저자를 입력.");
//		arr[0] = new Book1(sc.nextLine(),sc.nextLine());
//		System.out.println("2번 책 제목과 저자를 입력.");
//		arr[1] = new Book1(sc.nextLine(),sc.nextLine());

//		arr[0] = new Book1();
//		arr[1] = new Book1();
//		
//		System.out.println("1번 책 제목을 입력.");
//		arr[0].title = sc.nextLine();
//		System.out.println("1번 책 저자를 입력.");
//		arr[0].author = sc.nextLine();
//		System.out.println("2번 책 제목을 입력.");
//		arr[1].title = sc.nextLine();
//		System.out.println("2번 책 저자를 입력.");
//		arr[1].author = sc.nextLine();
		
		System.out.println("title = "+arr[0].title +"  author = "+arr[0].author);
		System.out.println("title = "+arr[1].title +"  author = "+arr[1].author);
	}

}
