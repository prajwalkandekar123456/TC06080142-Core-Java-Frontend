package day5;

public class D extends C{
	public D() {
		super();
		System.out.println("Child Default");
	}
	
	public D(int a) {
		super(a);
		System.out.println("Child Parameterized");
	}
	public static void main(String[] args) {
		D d = new D(10);
		
	}

}
