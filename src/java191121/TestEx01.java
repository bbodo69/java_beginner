package java191121;

abstract class Action{
	public abstract void exec();
}

class MyAction extends Action{
	public void exec() {
		System.out.println("exec");
	}
}
	


public class TestEx01 {

	public static void main(String[] args) {
		
//	Action a = new MyAction();
//	
//	a.exec();
		
		Action a = new Action() {
			public void exec() {
				System.out.println("exec");
			}
		};
		a.exec();

	}

}
