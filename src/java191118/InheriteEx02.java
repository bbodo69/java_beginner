package java191118;

class SharpPencil{
	private int width = 10;
	private int amount;
	public int getAmount() { return amount;}
	public void setAmount(int amount) { this.amount =amount;}
	
	
}

class BallPen extends SharpPencil{
//	private int amount;
	private String color;
//	public int getAmount() { return amount;}
//	public void setAmout(int amount) { this.amount =amount;}
	public String getColor() {return color;}
	public void setColor(String color) {this.color = color;}
}

class FountainPen extends BallPen{
//	private int amount;
//	private String color;
//	public int getAmount() { return amount;}
//	public void setAmout(int amount) { this.amount =amount;}
//	public String getColor() {return color;}
//	public void setColor(String color) {this.color = color;}
	public void refill(int n) { setAmount(n);}
}

public class InheriteEx02 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BallPen b = new BallPen();
			b.getAmount();
			
			
			
	}

}
