
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
				sleep(1000); // ����ó���� ������Ѵ�.
			}
			catch (InterruptedException e) 
			{
				return;
			}
			
		}
	}
	
	public static void main(String[] args) {
		//�ΰ��� Thread�� ������ ���´�.
		ThreadEx1 th = new ThreadEx1();
		th.start();
		
		ThreadEx1 th2 = new ThreadEx1();
		th2.start();
	}

}
