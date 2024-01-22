package abstractTest;

public class Test {

	public static void main(String[] args) {
		
//		Bank b = new BOI();
//		System.out.println("BOI = "+ b.getROI());
//		
//		Bank b1 = new SBI();
//		System.out.println("SBI = "+b1.getROI());
//		
		Shape s1 = new Circle(5);
		System.out.println("Area of Circle :"+s1.area());
	
		Shape s2 = new Rectangle(2,4);
		System.out.println("Area of Rectangle :"+s2.area());
		
		float d = 5/2;
		System.out.println(""+d);

	}

}
