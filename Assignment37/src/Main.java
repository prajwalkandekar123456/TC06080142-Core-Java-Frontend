import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Student> students = new ArrayList<>();
		
		System.out.println("Enter detail of students");
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print("Name :");
			String name = sc.nextLine();
			
			System.out.println("Roll No :");
			int rollno = sc.nextInt();
			
			System.out.println("Age :");
			int age = sc.nextInt();
			
			System.out.println("Score :");
			double score = sc.nextDouble();
			
			Student s = new Student(name, rollno, age, score);	
			students.add(s);
			
			sc.nextLine();
		}
		
		Collections.sort(students,Comparator.comparing(s -> s.score));
		
		List<Student> grp1 = new ArrayList<>();
		List<Student> grp2 = new ArrayList<>();
		List<Student> grp3 = new ArrayList<>();
		List<Student> grp4 = new ArrayList<>();
		
		for(Student student : students) {
			
			if (student.score >= 0 && student.score <= 50) {
                grp1.add(student);
            } else if (student.score > 50 && student.score <= 65) {
                grp2.add(student);
            } else if (student.score > 65 && student.score <= 80) {
                grp3.add(student);
            } else if (student.score > 80 && student.score <= 100) {
                grp4.add(student);
            }
		}
		
		 display("[0-50]",grp1);
	     display("[50-65]",grp2);
	     display("[65-80]",grp3);
	     display("[80-100]",grp4);
		
	}

	private static void display(String groupName, List<Student> group) {
        System.out.println("\n" + groupName + ":");
        for (Student student : group) {
            System.out.println("Name: " + student.name + ", Roll No: " + student.rollNo + ", Age: " + student.age + ", Score: " + student.score);
        }
    }

}
