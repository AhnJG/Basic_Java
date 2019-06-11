import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit.BoldAction;

public class FinalTest1 extends JFrame{
	
	JLabel b1, b2, b3, b4, b5;

	Runnable r = new Panel1();
	Runnable r2 = new Panel2();
	
	Thread th, th2;
	
	FinalTest1()
	{
		setTitle("연습");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.add(new Panel1(), BorderLayout.NORTH);
		c.add(new Panel2(), BorderLayout.EAST);
		c.add(new Panel3(), BorderLayout.WEST);
		c.add(new Panel4(), BorderLayout.SOUTH);
		c.add(new Panel5(), BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	class Panel1 extends JPanel implements Runnable
	{
		public Panel1() 
		{
			b1 = new JLabel("북쪽");
			setBackground(Color.red);
			b1.setForeground(Color.white);
			b1.setFont(new Font("Gothic", Font.BOLD, 18));
			add(b1);
			
			th = new Thread(r);
			th.start();
			
			
		}
		
		@Override
		public void run() {
			for(int i=0; i<5; i++)
			{
				try
				{
					Thread.sleep(1000);
					b1.setText(Integer.toString(i));
				}
				catch(Exception e)
				{
					
				}
				
			}
		}
	}
	
	class Panel2 extends JPanel implements Runnable
	{
		public Panel2() 
		{
			b2 = new JLabel("동쪽");
			setBackground(Color.blue);
			add(b2);
			
			th2 = new Thread(r2);
			th2.start();
		}
		
		@Override
		public void run() {
			for(int i=0; i<5; i++)
			{
				try
				{
					Thread.sleep(1000);
					b2.setText(Integer.toString(i));
				}
				catch(Exception e)
				{
					
				}
			}
		}
	}
	
	class Panel3 extends JPanel
	{
		public Panel3() 
		{
			JLabel b1 = new JLabel("서쪽");
			setBackground(Color.GRAY);
			add(b1);
			
			JMenuBar bar = new JMenuBar();
			JMenu menu = new JMenu("menu"); 
			JMenu menu2 = new JMenu("menu2"); 
			JMenuItem item1 = new JMenuItem("item1");
			add(bar);
			bar.add(menu);
			bar.add(menu2);
			menu.add(item1);
			
		}
	}
	
	class Panel4 extends JPanel
	{
		public Panel4() 
		{
			JLabel b1 = new JLabel("남쪽");
			setBackground(Color.orange);
			add(b1);
		}
		
		
	}
	

	class Panel5 extends JPanel
	{
		public Panel5() 
		{
			JLabel b1 = new JLabel("센터");
			setBackground(Color.PINK);
			add(b1);
		}
	}

	public static void main(String[] args) {
		new FinalTest1();
	}

}
