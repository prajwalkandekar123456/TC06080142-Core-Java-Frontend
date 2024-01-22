package day5_1;

public class Teacher extends Person{
	
	String subject;
	
	public Teacher() {
		
	}
	public Teacher(int id , String name , String subject) {
		super(id,name);
		this.subject = subject;
	}
	
	public void getData() {
		super.getData();
		System.out.println("Subject :"+ subject);
	}

}
