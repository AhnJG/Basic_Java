import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestThread4 extends JFrame{
	
	static TestThread4 t4;
	
	Count t;
	Thread t1;
	
	Thread th;
	JLabel jl = new JLabel("0");
	int c = 0;
	
	TestThread4()
	{
		setTitle("½º·¹µå");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		
		Container c = getContentPane();
		
		jl.setFont(new Font("Gothic", Font.BOLD, 50));
		jl.setHorizontalAlignment(JLabel.CENTER);
		jl.setForeground(Color.green);
		
		c.add(jl);
		c.addMouseListener(new MouseListenerTest());
		
		setVisible(true);
	}
	
	class MouseListenerTest extends MouseAdapter
	{
		@Override
		public void mouseClicked(MouseEvent e) {
			
			t = new Count();
			t1 = new Thread(t);
			
			t1.start();
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			t1.interrupt();
		}
		
	}
	
	class Count extends Thread
	{
		public void run()
		{
			try
			{
				while(true)
				{
					c++;
					sleep(1000);
					jl.setText(Integer.toString(c));
				}
			}
			catch(Exception e)
			{
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		t4 = new TestThread4();
	}

}
