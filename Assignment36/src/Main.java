import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Product[] products = new Product[5];
		
		 for (int i = 0; i < 5; i++) {
	            System.out.println("Enter details for Product " + (i + 1) + ":");
	            System.out.print("Enter Pid: ");
	            int pid = sc.nextInt();
	            System.out.print("Enter Price: ");
	            double price = sc.nextDouble();
	            System.out.print("Enter Quantity: ");
	            int quantity = sc.nextInt();

	            Product proObj = new Product(pid, price, quantity);
	            products[i] = proObj;
	    }
		 
		int maxPid = findMax(products);
		
		System.out.println("PID of product with maximum Price :"+maxPid);
		
		double total = findTotal(products);
		
		System.out.println("Total amount of products :"+total);
		
		sc.close();
		
		
	}
	
	private static double findTotal(Product[] products) {
		
		double total = 0;
		
		for(Product p : products) {
			total += p.price * p.quantity;
		}
		return total;
	}

	private static int findMax(Product[] products) {
		
		int maxID = -1;
		double maxPrice = 0;
		
		for(Product p : products) {
			if(p.price > maxPrice) {
				maxPrice = p.price;
				maxID = p.pid;
			}
		}
		
		return maxID;
	}

	

}
