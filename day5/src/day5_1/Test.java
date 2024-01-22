package day5_1;

public class Test {

	public static void main(String[] args) {
		
		Teacher t = new Teacher(102, "Abhi", "Java");
		t.getData();
		
		System.out.println("-------------------------------");
		HOD h = new HOD(103, "XYZ", "IT");
		h.getData();
		
		System.out.println("-------------------------------");
		System.out.println(h instanceof HOD); 
		System.out.println(t instanceof Teacher);

	}
}
