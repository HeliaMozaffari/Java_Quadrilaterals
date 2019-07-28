package quad;

public class Trapezoid extends Quadrilateral
{
	public int tLength1;
	public int tLength2;
	public int tHeight;
	

	public Trapezoid(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		tLength1 = length1();
		tLength2 = length2();
		tHeight = height();
	}


	@Override
	public double area() {
		double a =((tLength1 + tLength2)/2)*tHeight;
		return (a);
	}
	
	
	
}
