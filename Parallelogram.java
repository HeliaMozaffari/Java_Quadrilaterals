package quad;

public class Parallelogram extends Trapezoid
{
	public int pLength1;
	public int pHeight;

	public Parallelogram(int x1, int y1, int x2, int y2, int x3, int y3) {
		super(x1, y1, x2, y2, x3, y3, 0, 0);
		pLength1=length1();
		pHeight=height();
	}
	@Override
	public double area() {
		double a = pHeight* pLength1;
		return (a);
	}

}
