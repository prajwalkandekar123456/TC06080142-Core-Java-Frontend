package package1;
import p2.p3.C;
import static p2.p3.C.fees; // static import 

public class D {

	public static void main(String[] args) {
		System.out.println(fees);
		System.out.println(C.getFees());
	}

}
