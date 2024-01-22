
public class Floor {
	double length;
    double width;

    public Floor(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public int totalTiles(Tile tile) {
        
    	double tileArea = tile.edge * tile.edge;
        double floorArea = length * width;
        int numberOfTiles = (int) Math.ceil(floorArea / tileArea);
        
        return numberOfTiles;
    }

}
