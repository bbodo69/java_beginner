package java191113;

import java.util.Scanner;

// BookŬ������ Ȱ���Ͽ� 2��¥�� ��ü �迭�� �����,
// ����ڷκ��� å�� ����� ���ڸ� �Է¹޾� �迭�� �ϼ��ϰ� �������.
	
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
				
		Book1 [] arr = new Book1[2];		// å�� -> å ��ü ����
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println("����");
			String title = sc.nextLine();
			System.out.println("����");
			String author = sc.nextLine();
			arr[i] = new Book1(title, author);
		}
		
//		System.out.println("1�� å ����� ���ڸ� �Է�.");
//		arr[0] = new Book1(sc.nextLine(),sc.nextLine());
//		System.out.println("2�� å ����� ���ڸ� �Է�.");
//		arr[1] = new Book1(sc.nextLine(),sc.nextLine());

//		arr[0] = new Book1();
//		arr[1] = new Book1();
//		
//		System.out.println("1�� å ������ �Է�.");
//		arr[0].title = sc.nextLine();
//		System.out.println("1�� å ���ڸ� �Է�.");
//		arr[0].author = sc.nextLine();
//		System.out.println("2�� å ������ �Է�.");
//		arr[1].title = sc.nextLine();
//		System.out.println("2�� å ���ڸ� �Է�.");
//		arr[1].author = sc.nextLine();
		
		System.out.println("title = "+arr[0].title +"  author = "+arr[0].author);
		System.out.println("title = "+arr[1].title +"  author = "+arr[1].author);
	}

}
