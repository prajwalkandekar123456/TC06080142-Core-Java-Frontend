
public class Main {

	public static void main(String[] args) {
	
		
		try {
			Student s = new Student("Abhishek");			
			int fees = s.getFee();
			System.out.println("Name :"+s.getName());
			System.out.println("Fees :" + fees);
		}catch(InvalidFeeException e) {
			System.out.println(" "+ e.getMessage());
		}
		

	}

}
