package que42;

public class CollegeStudent extends Student{
	private int semester;
	
	public CollegeStudent() {
		
	}

	public CollegeStudent(int rollNo , float percentage ,int semester) {
		super(rollNo,percentage);
		this.semester = semester;
	}
	
	
}
