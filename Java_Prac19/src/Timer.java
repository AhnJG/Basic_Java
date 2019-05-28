//13-5 + ���콺 �ø��� �P���� ����, ���� ����!!

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Timer extends JFrame 
{
	JLabel jl = new JLabel("0");
	Thread th1 = new Thread(new thread(jl));
	
	public Timer() 
	{
		setSize(300, 170);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Timer");

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addMouseListener(new mouse());
		
		jl.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(jl);
		
		setVisible(true);
	}
	
	class mouse extends MouseAdapter
	{
		@Override
		public void mouseEntered(MouseEvent e) { // ���콺�� â�� ������ ��
			super.mouseEntered(e);
			th1 = new Thread(new thread(jl, Integer.parseInt(jl.getText())));
			th1.start();
		}
		@Override
		public void mouseExited(MouseEvent e) { // ���콺�� â���� ������ ��
			super.mouseExited(e);
			th1.interrupt();
		}
		
		@Override
		public void mousePressed(MouseEvent e) { // ���콺 ��������
			super.mousePressed(e);
			
			if(th1.isAlive()) // �����尡 ��������� ����
			{
				th1.interrupt(); 
			}
			else // �����尡 ���� �����̸� ����
			{
				th1 = new Thread(new thread(jl, Integer.parseInt(jl.getText()))); // ������ �󺧰��� �־��ش�
				th1.start();
			}
			
		}
	}
	
	public static void main(String[] args) {
		new Timer();
	}
}

class thread implements Runnable
{
	int n = 0;
	JLabel jl = new JLabel();
	
	thread(JLabel jl)
	{
		this.jl = jl;
	}
	
	thread(JLabel jl, int n)
	{
		this.jl = jl;
		this.n = n;
	}
	
	public void run()
	{
		while(true)
		{
			jl.setText(Integer.toString(n));
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
}