package day5;

public class B extends A{
	
	public void getA() {
		System.out.println("In getA() of Class B");
	}
	
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.a);
		
	}

}
