
public class Prac5 {

	public static void main(String[] args) {
		Test5 st = new Test5();
		
		st.a = 1;
		st.b = 2;
		st.c = 3;
		//st.d = 4; // 클래스가 달라서 불가능
		st.show(4); // private 변수에 값 넣는방법
	}
}

class Test5
{
	public int a;
	int b; // default
	protected int c;
	private int d;
	
	void show(int d)
	{
		this.d = d;
	}
}