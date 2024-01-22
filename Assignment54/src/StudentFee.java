import java.util.Scanner;

class InvalidFeeException extends Exception {
    public InvalidFeeException(String message) {
        super(message);
    }
}
public interface StudentFee {
	int getFee() throws InvalidFeeException;
}

class Student implements StudentFee {

    private String name;
    private double fees;

    public Student(String name) {
        this.name = name;
    }

    
    public int getFee() throws InvalidFeeException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter fees for " + name + ": ");
        int enteredFee = scanner.nextInt();

        
        if (enteredFee < 0) {
            throw new InvalidFeeException("Invalid or negative fees entered for " + name);
        }

        scanner.close();
        return enteredFee;
    }
    public String getName() {
    	return this.name;
    }
    
   

}

