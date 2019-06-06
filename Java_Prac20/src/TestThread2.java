
public class TestThread2 implements Runnable{

	public void run()
	{
		try
		{
			for(int i=10; i>0; i--)
			{
				int time = (int)(Math.random() * 3000);
				Thread.sleep(time);
				System.out.println(i + " ");
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e.toString());
		}
		
	}
	
	public static void main(String[] args) {
		 TestThread2 t = new TestThread2();
		 Thread t2 = new Thread(t);
		 t2.start();
		 
		 Runnable t3 = new TestThread2();
		 Thread t4 = new Thread(t3);
		 t4.start();
	}
}
