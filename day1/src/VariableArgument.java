
public class VariableArgument {
	
	public int add(int... a) { // variable argument: Ellipses
		
		int sum = 0 ;
		int cnt = 0 ;
		for(int i: a) {
			cnt+=1;
			sum += i;
		}
		System.out.println("Number oF Argument : "+ cnt);
		return sum;
	}
//	public int add(int a, int b , int... c) {
//		int sum = 0 ;
//		int cnt = 0 ;
//		for(int i: c) {
//			cnt+=1;
//			sum += i;
//		}
//		System.out.println("Number oF Argument : "+ cnt);
//		return sum;	
//		
//	}
//	public int add(int a , int b , int c) {
//		return a+b+c;
//	}

	public static void main(String[] args) {
		
		VariableArgument v = new VariableArgument();
		System.out.println("Addition : "+v.add(1,2,3,4,5,6));
		System.out.println("Addition : "+v.add(1,2,3));
		
		System.out.println("Addition : "+v.add(1,2,3,4,5,6));
		
		
		

	}

}
