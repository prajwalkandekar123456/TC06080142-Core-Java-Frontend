
public class ConstructorTest {
	
	private String country;
	private String playerName;
	
	public ConstructorTest() {
		this("Dhoni");
		country = "India";
	}
	
	public ConstructorTest(String playerName) {
//		this();
		this.playerName = playerName;
	}

	@Override
	public String toString() {
		return "ConstructorTest [country=" + country + ", playerName=" + playerName + "]";
	}

	public static void main(String[] args) {
		
		ConstructorTest c1 = new ConstructorTest();
		System.out.println(c1);
		
		
	}
	
	

}
