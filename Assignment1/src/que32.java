
public class que32 {
	 
	public int multiply(int a , int b) {
		return a*b;
		
	}
	public float multiply(float a , float b , float c) {
		return a*b*c;
	}
	
	public double multiply(double a , int b) {
		return a*b;
	}
	
	public int multiply(int[] arr) {
		int sum = 1;
		for(int i : arr) {
			sum*=i;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		int[] Arr = {10,20,30,40};
		que32 obj = new que32();
		System.out.println("Multiplication :"+obj.multiply(10, 20));
		System.out.println("Multiplication :"+obj.multiply(1.0f, 2.0f, 3.0f));
		System.out.println("Multiplication :"+obj.multiply(2.0 , 10));
		System.out.println("Multiplication of Array:"+obj.multiply(Arr));
		
	
	}

}
