package java191113;

class Book{
	String title;
	String author;
	
	Book(String t){
		title = t;				
		author = "unknown";
	}
	
	Book(String t, String a){
		title = t;
		author = a;
	}
	
}


public class CountEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b = new Book("old man and the sea");
		
		System.out.println(b.title);
		System.out.println(b.author);

		Book b2 = new Book("old man and the sea", "hemingway");
		System.out.println(b2.title);
		System.out.println(b2.author);
	}

}
