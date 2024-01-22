package p1;

public class A {

	protected int no = 10;// default are only accessible withing the package 
	
	protected void getNo() {
		System.out.println("Hello from A class :"+ no);
	}
	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a.no);
		a.getNo();

	}

}
