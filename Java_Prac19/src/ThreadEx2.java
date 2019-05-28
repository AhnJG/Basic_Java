
public class ThreadEx2 implements Runnable{

	int n = 0;
	public void run()
	{
		while(true)
		{
			System.out.println(n);
			n++;
			try
			{
				Thread.sleep(1000); // ����ó���� ������Ѵ�.
			}
			catch (InterruptedException e) 
			{
				return;
			}
			
		}
	}
	
	public static void main(String[] args) {
		//�ΰ��� Thread�� ������ ���´�.
		
		Thread th1 = new Thread(new ThreadEx2());
		th1.start();
	
		Thread th2 = new Thread(new ThreadEx2());
		th2.start();
	}

}
