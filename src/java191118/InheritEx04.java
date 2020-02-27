package java191118;

class Person{
	private int weight;
	int age;
	protected int height;
	public String name;
	public void setWeight(int weight) {this.weight = weight;}
	public int getWeight() {
		return weight;
	}
}

class Student extends Person{//weight, age, height, name, set()
	public void set() {
		age = 19;
		name = "¾Ë·»";
		height = 161;
		setWeight(50);
		System.out.println(getWeight());
	}
		
}



public class InheritEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Student s = new Student();
	}

}
