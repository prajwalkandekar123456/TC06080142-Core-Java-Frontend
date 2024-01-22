
public class StaticTest {
	
	private int rollNo;
	private String name;
	private static int count;
	
	public StaticTest(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
		count+=1;
	}
	
	public static int getCount() {
		return count;	
	}
	
	static {
		System.out.println("Static block invoked");
	}

	public static void main(String[] args) {
		StaticTest s1 = new StaticTest(101, "A");
		StaticTest s2 = new StaticTest(101, "A");
		StaticTest s3 = new StaticTest(101, "A");
		StaticTest s4 = new StaticTest(101, "A");
		StaticTest s5 = new StaticTest(101, "A");
		
		System.out.println("Total Number of Student = "+StaticTest.getCount());
		

	}

}
