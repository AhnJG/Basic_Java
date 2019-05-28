interface test2 
{
	default void print()
	{
		System.out.println("test");
	}
}
public class test1 implements test2{

	public static void main(String[] args) {
		test1 t1 = new test1();
		t1.print();
	}

}
