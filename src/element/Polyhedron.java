package element;

public class Polyhedron 
{
	private Polygon[] polygons;
	
	public Polyhedron(Polygon...polygons)
	{
		this.polygons = new Polygon[polygons.length];
		for(int i = 0; i < polygons.length; i++)
		{
			Polygon polygon = polygons[i];
			this.polygons[i] = new Polygon(polygon.getPoints());
		}
	}
	
	public Polygon[] getPolygons() { return polygons; }
}
