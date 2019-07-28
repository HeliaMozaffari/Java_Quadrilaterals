package quad;

public class Rectangle extends Parallelogram
{
	public int rLength1;
	public int rWidth;

	public Rectangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		super(x1, y1, x2, y2, x3, y3);
		rLength1=length1();
		rWidth=height();
		
	}
	@Override
	public double area() {
		double a = rWidth* rLength1;
		return (a);
	}
	

}
