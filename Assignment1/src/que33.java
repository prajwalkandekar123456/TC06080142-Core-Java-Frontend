class Person {
	private String name;
	private int age;
	
	public Person() {
		this.age = 18;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void display() {
		System.out.println("Name ="+name +"\n"+ "Age = "+age);
	}
	
}
public class que33 {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Abhi");
		p.display();
		
		Person p1 = new Person("xyz", 21);
		p1.display();
	}

}
