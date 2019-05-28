
public class ThreadEx1 extends Thread{

	int n = 0;
	public void run()
	{
		while(true)
		{
			System.out.println(n);
			n++;
			try
			{
				sleep(1000); // 예외처리를 해줘야한다.
			}
			catch (InterruptedException e) 
			{
				return;
			}
			
		}
	}
	
	public static void main(String[] args) {
		//두개의 Thread가 섞여서 나온다.
		ThreadEx1 th = new ThreadEx1();
		th.start();
		
		ThreadEx1 th2 = new ThreadEx1();
		th2.start();
	}

}
