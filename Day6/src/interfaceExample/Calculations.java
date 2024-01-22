package interfaceExample;

public class Calculations extends CompareCal implements StaticCal,Factorial,ArithCal{

	@Override
	public int add(int a, int b) {
		return (a+b);
	}
 
	@Override
	public int sub(int a, int b) {
		return (a>b)? (a-b):(b-a);
	}

	@Override
	public int fact(int n) {
		int f = 1;
		for(int i = 1 ; i <= n ; i++) {
			f*=i;
		}
		return f;
	}

	@Override
	public int avg(int a, int b) {
		return (a+b)/2;
	}

}
