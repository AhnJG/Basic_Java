//13-5 + 마우스 올리고 뻇을때 실행, 정지 시험!!

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
		public void mouseEntered(MouseEvent e) { // 마우스가 창에 들어왔을 때
			super.mouseEntered(e);
			th1 = new Thread(new thread(jl, Integer.parseInt(jl.getText())));
			th1.start();
		}
		@Override
		public void mouseExited(MouseEvent e) { // 마우스가 창에서 나갔을 때
			super.mouseExited(e);
			th1.interrupt();
		}
		
		@Override
		public void mousePressed(MouseEvent e) { // 마우스 눌렀을떄
			super.mousePressed(e);
			
			if(th1.isAlive()) // 쓰레드가 살아있으면 중지
			{
				th1.interrupt(); 
			}
			else // 쓰레드가 중지 상태이면 실행
			{
				th1 = new Thread(new thread(jl, Integer.parseInt(jl.getText()))); // 이전의 라벨값을 넣어준다
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
				Thread.sleep(1000); // 예외처리를 해줘야한다.
			}
			catch (InterruptedException e) 
			{
				return;
			}
			
		}
	}
}