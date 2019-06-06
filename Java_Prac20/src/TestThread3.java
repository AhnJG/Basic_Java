import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestThread3 extends JFrame implements Runnable{
	JLabel jl;
	JButton jb;
	int num = 0;
	
	TestThread3() 
	{
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		jl = new JLabel();
		jl.setFont(new Font("Gothic", Font.BOLD, 50));
		jl.setHorizontalAlignment(jl.CENTER);
		jl.setForeground(Color.GREEN);
		c.add(jl);
		
		jb = new JButton();
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		c.add(jb);
		
		setVisible(true);
	}
	
	public void run()
	{
		try
		{
			
			for(int num=1; num<=10; num++)
			{
				int time = (int)(Math.random() * 1000);
				Thread.sleep(time);
				System.out.println(num + " ");
				jl.setText(Integer.toString(num));
			}
		}
		catch(Exception e)
		{
			
		}
		
	}
	
	public static void main(String[] args) {
		TestThread3 t = new TestThread3();
		Thread t1 = new Thread(t);
		t1.start();
	}

}
