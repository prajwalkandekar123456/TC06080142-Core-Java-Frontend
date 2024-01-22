package package1;

public class Employee {
	private int empId;
	private String empName;
	private Date dateOfJoining; // containment
	
	public Employee() {}
	public Employee(int empId, String empName, Date dateOfJoining) {
		this.empId = empId;
		this.empName = empName;
		this.dateOfJoining = dateOfJoining;
	}
	public String toString() {
		return "Employee [empId :" + empId + ", empName :" + empName + ", dateOfJoining :" + dateOfJoining + "]";
	}
	
	public static void main(String[] args) {
		Employee e = new Employee(111, "abc", new Date(19,10,2023));
		System.out.println(e);
	}
}
