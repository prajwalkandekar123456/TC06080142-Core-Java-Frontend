
public class Main {

	public static void main(String[] args) {
		
		
		Tile t = new Tile(3.5);
		
		Floor f = new Floor(5, 5);
		
		int total = f.totalTiles(t);
		
		System.out.println("Total Number of tiles required : "+ total);
		

	}

}
