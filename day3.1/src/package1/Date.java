package package1;

public class Date {
	
	private int dd,mm,yy;
	
	public Date() {}
	
	public Date(int dd , int mm , int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public String toString() {
		return "[dd:" + dd + ", mm:" + mm + ", yy:" + yy + "]";
	}
	
}


