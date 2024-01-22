
public class Voter {
	
	int voterId;
	String name;
	int age;
		
	public class InvalidAgeException extends Exception {

	    public InvalidAgeException(String message) {
	        super(message);
	    }
	}

	public Voter(int voterId, String name, int age) throws InvalidAgeException {
		
		if( age < 18) {
			throw new InvalidAgeException("Invalid Age");
		}
		this.voterId = voterId;
		this.name = name;
		this.age = age;
	}
	
	
	
	@Override
	public String toString() {
		return "Voter [voterId=" + voterId + ", name=" + name + ", age=" + age + "]";
	}



	public static void main(String[] args) {
		try {
			Voter v = new Voter(101, "Abhishek", 17);
			System.out.println(v.toString());
			
		}catch(InvalidAgeException e) {
		    System.out.println("" + e);
		}
	}
	
	

}
