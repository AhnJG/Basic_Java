
public class Prac5 {

	public static void main(String[] args) {
		Test5 st = new Test5();
		
		st.a = 1;
		st.b = 2;
		st.c = 3;
		//st.d = 4; // Ŭ������ �޶� �Ұ���
		st.show(4); // private ������ �� �ִ¹��
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