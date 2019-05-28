
// 메소드 오버로딩

public class Prac3 {

	public static void main(String[] args) {
		T t = new T();
		
		t.t1(1);
		t.t1(1,1.0);
		t.t1(1,2);
	}

}

class test
{
	void t1(int i)
	{
		System.out.println(1);
	}
	
	void t1(int i, int j)
	{
		System.out.println(2);
	}
	
	void t1(int i, double j)
	{
		System.out.println(3);
	}
}