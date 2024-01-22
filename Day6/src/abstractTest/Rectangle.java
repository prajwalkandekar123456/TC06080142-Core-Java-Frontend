package abstractTest;

public class Rectangle extends Shape{

	private int l,b;
	public Rectangle(int l , int b) {
		this.l = l;
		this.b = b;
	}
	@Override
	public double area() {
		return (l*b);
	}

}
