package day5;

public class Employee extends Object{
	private int empId;
	private String empName;

	
	public Employee() {
		
	}
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj; // object downcasting	 
		// this -> it is referring to current object ie. e1
		// e -> it is referring to Employee e2 object 
		return ( (this.empId == e.empId) && (this.empName.equals(e.empName)));
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(111, "abc");
		Employee e2 = new Employee(111, "abc");
		
		if(e1.equals(e2)) {
			System.out.println("Objects are equal");
		}else {
			System.out.println("Objects are not equal");
		}
		

	}

}
