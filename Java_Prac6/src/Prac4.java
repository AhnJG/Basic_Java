
public class Prac4 {

	public static void main(String[] args) {
		Data a = new Data();
		
		a.area(1);
		a.area(1.0, 2.0);
		a.area(3,3);
		a.area(1,2,3);
	
	}

}

class Data
{
	void area(int r)
	{
		System.out.println("���� ����: "+(r*r*3.14));
	}
	
	void area(double h, double w)
	{
		System.out.println("�ﰢ���� ����: "+(h*w/2));
	}
	
	void area(int h, int w)
	{
		System.out.println("�簢���� ����: "+(h*w));
	}
	
	void area(int k, int m, int e)
	{
		System.out.println("�������� ��: "+(k+m+e));
	}
}