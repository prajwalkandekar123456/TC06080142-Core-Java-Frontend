
public class Demo {
	
	private int d,m,y; // instance variable: get memory while object creation

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public void displayDate() {
		System.out.println("Date :"+d + "/" + m + "/" + y);	
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		d.setD(17);
		d.setM(10);
		d.setY(2023);
		d.displayDate();
		
	}

}
