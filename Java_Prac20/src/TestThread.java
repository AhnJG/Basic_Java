
public class TestThread extends Thread{

	public void run()
	{
		for(int i=10; i>0; i--)
		{
			System.out.println(i + " ");
		}
	}
	
	public static void main(String[] args) 
	{
		TestThread t1 = new TestThread();
		t1.start();
		
		TestThread t2 = new TestThread();
		t2.start();
	}

}
