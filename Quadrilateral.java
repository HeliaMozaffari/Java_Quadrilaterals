package quad;

public abstract class Quadrilateral
{
	Points point1, point2, point3, point4;
	
	public Quadrilateral(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4 ) 
	{
		point1= new Points(x1, y1);
		point2= new Points(x2, y2);
		point3= new Points(x3, y3);
		point4= new Points(x4, y4);
		
	}
	public int length1() 
	{
		return Math.abs(point2.x - point1.x );
	}
	public int length2() 
	{
		return Math.abs(point4.x - point3.x );
	}
	public int height() 
	{
		return Math.abs(point3.y - point1.y );
	}
	public abstract double area();
	
	public static void main(String[] args) {
		
		Square s = new Square(5,20,10,20);
		System.out.println(s.area());
		
		Rectangle r = new Rectangle(5,20,15,20,5,30);
		System.out.println(r.area());
		
		Parallelogram p = new Parallelogram(5, 20, 15, 20, 10, 30);
		System.out.println(p.area());
		
		Trapezoid t = new Trapezoid(5, 20, 15, 20, 10, 30,12,30);
		System.out.println(t.area());
		
		

	}

	
}

