class RectData
{
	int width;
	int height;
	float radius;
	
	int getArea()
	{
		return width * height;
	}
	
	double getCircleArea()
	{
		return 3.14 * radius * radius;
	}
	
	double getTriangleArea()
	{
		return width*height / 2;
	}
}

public class RectApp {

	public static void main(String[] args) {
		RectData rd = new RectData();
		rd.width = 120;
		rd.height = 240;
		System.out.println("»ç°¢ÇüÀÇ ³ĞÀÌ= "+rd.getArea());
		rd.radius = 5;
		System.out.println("¿øÀÇ ³ĞÀÌ= "+rd.getCircleArea());
		System.out.println("¿øÀÇ ³ĞÀÌ= "+rd.getTriangleArea());
	}

}
