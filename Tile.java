import java.awt.Color; // the color type used in StdDraw
import java.awt.Font; // the font type used in StdDraw
import java.util.Random;

// A class used for modeling numbered tiles as in 2048
public class Tile {
	// Data fields: instance variables
	// --------------------------------------------------------------------------
	private int number; // the number on the tile
	private Color backgroundColor; // background (tile) color
	private Color foregroundColor; // foreground (number) color
	private Color boxColor; // box (boundary) color

	// Data fields: class variables
	// --------------------------------------------------------------------------
	// the value of the boundary thickness (for the boundaries around the tiles)
	private static double boundaryThickness = 0.004;
	// the font used for displaying the tile number
	private static Font font = new Font("Arial", Font.PLAIN, 14);

	// Methods
	// --------------------------------------------------------------------------
	// the default constructor that creates a tile with 2 as the number on it
	public Tile() {
		// set the number on the tile
		int[] random_numbers = { 2, 4 }; // Tile now assigns 2 or 4 numbers randomly
		this.number = random_numbers[new Random().nextInt(random_numbers.length)]; // set the colors of the tile
		

	}

	public void setColorByNumber() {
		if (number == 2) {
			backgroundColor = new Color(151, 178, 199);
			foregroundColor = new Color(0, 100, 200);
			boxColor = new Color(0, 100, 200);
		} else if (number == 4) {
			backgroundColor = new Color(173, 216, 230);
			foregroundColor = new Color(0, 100, 200);
			boxColor = new Color(0, 100, 200);
		}
		else if (number == 8) {
			backgroundColor = new Color(118, 210, 255);
			foregroundColor = new Color(0, 100, 200);
			boxColor = new Color(0, 100, 200);
		} else if (number == 16) {
			backgroundColor = new Color(99, 194, 223);
			foregroundColor = new Color(0, 100, 200);
			boxColor = new Color(0, 100, 200);
		} else if (number == 32) {
			backgroundColor = new Color(46, 173, 212);
			foregroundColor = new Color(0, 100, 200);
			boxColor = new Color(0, 100, 200);
		} else if (number == 64) {
			backgroundColor = new Color(35, 139, 171);
			foregroundColor = new Color(0, 100, 200);
			boxColor = new Color(0, 100, 200);
		} else if (number == 128) {
			backgroundColor = new Color(149, 168, 255);
			foregroundColor = new Color(0, 100, 200);
			boxColor = new Color(0, 100, 200);
		}else if (number == 256) {
			backgroundColor = new Color(135, 143, 255);
			foregroundColor = new Color(0, 100, 200);
			boxColor = new Color(0, 100, 200);
		}else if (number == 512) {
			backgroundColor = new Color(120, 130, 255);
			foregroundColor = new Color(0, 100, 200);
			boxColor = new Color(0, 100, 200);
		}else if (number == 1024) {
			backgroundColor = new Color(103, 116, 255);
			foregroundColor = new Color(0, 100, 200);
			boxColor = new Color(0, 100, 200);
		}else if (number == 2048) {
			backgroundColor = new Color(84, 100, 255);
			foregroundColor = new Color(0, 100, 200);
			boxColor = new Color(0, 100, 200);
		}


	}

	// a method for drawing the tile
	public void draw(Point position, double... sideLength) {
		setColorByNumber();
		// the default value for the side length (sLength) is 1
		double sLength;
		if (sideLength.length == 0) // sideLength is a variable-length parameter
			sLength = 1;
		else
			sLength = sideLength[0];
		// draw the tile as a filled square
		StdDraw.setPenColor(backgroundColor);
		StdDraw.filledSquare(position.getX(), position.getY(), sLength / 2);
		// draw the bounding box around the tile as a square
		StdDraw.setPenColor(boxColor);
		StdDraw.setPenRadius(boundaryThickness);
		StdDraw.square(position.getX(), position.getY(), sLength / 2);
		StdDraw.setPenRadius(); // reset the pen radius to its default value
		// draw the number on the tile
		StdDraw.setPenColor(foregroundColor);
		StdDraw.setFont(font);
		StdDraw.text(position.getX(), position.getY(), "" + number);
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

}