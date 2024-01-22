import java.util.Scanner;
import java.lang.Math;

public class que31 {
	private int X,Y;
	private int R;
	
	public void init() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X");
		X = sc.nextInt();
		System.out.println("Enter Y");
		Y = sc.nextInt();
		sc.close();
	}
	public int add() {
		R = X+Y;
		return R;
	}
	public int multiply() {
		R = X*Y;
		return R;
	}
	public void power() {
		R = (int)Math.pow(X, Y);
		System.out.println("Power :"+R);
	}
	
	public static void main(String[] args) {
		que31 obj = new que31();
		obj.init();
		System.out.println("Addition :"+obj.add()); 
		System.out.println("Multiplication :"+obj.multiply()); 
		obj.power(); 
	}

}
