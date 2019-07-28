package quad;

public class Square extends Rectangle 
{
	public int sLength;

	public Square(int x1, int y1, int x2, int y2) {
		super(x1, y1, x2, y2, 0, 0);
		sLength = length1();
	}
	
	@Override
	public double area() {
		double a =sLength * sLength;
		return (a);
	}
	

}
