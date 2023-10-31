package element;

public class Polygon 
{
	private Point[] points;
	
	public Polygon(Point...points)
	{
		this.points = new Point[points.length];
		for(int i = 0; i < points.length; i++)
		{
			Point p = points[i];
			this.points[i] = new Point(p.getX(), p.getY(), p.getZ());
		}
	}
	
	public Point[] getPoints() { return points; }
}
