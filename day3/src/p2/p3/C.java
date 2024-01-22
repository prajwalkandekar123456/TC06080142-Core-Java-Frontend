package p2.p3;
import p1.A;

public class C extends A{

	public static int fees = 20;
	
	public static int getFees() {
		return fees;
	}
	public static void main(String[] args) {
//		A a = new A();
//		a.getNo();
		C c = new C();
		c.getNo();
		System.out.println("No = "+ c.no);
		
	}
	
}
