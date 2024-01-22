
public class Employee {
	
	private int empId;
	private String empName;
	private float empSal;
	
	public Employee() {
		System.out.println("Default Constructor Invoke");
	}
	
	public Employee(int empId , String empName, float empSal){
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	
	}
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}


	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		System.out.println(e1);
		
		Employee e = new Employee(101, "abc", 160000.0f);
		System.out.println(e);
		
		
		
		

	}

}
