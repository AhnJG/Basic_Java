import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyClock extends JFrame implements Runnable{

	static MyClock my;
	
	Thread th;
	
	JLabel jl = new JLabel(clockText());
	JButton jb1, jb2;
	
	String text;

	MyClock()
	{
		setTitle("스레드");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 400);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		jl.setFont(new Font("Gothic", Font.BOLD, 50));
		jl.setHorizontalAlignment(JLabel.CENTER);
		jl.setForeground(Color.green);
		
		c.add(jl);
		
		jb1 = new JButton("시작");
		jb2 = new JButton("정지");
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				th = new Thread(my);
				th.start();
			}
		});
		
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt();
			}
		});
		
		c.add(jb1);
		c.add(jb2);
		
		setVisible(true);
	
//		th = new Thread(this);
//		th.start();
	}
	
	public String clockText()
	{
		Calendar ca = Calendar.getInstance();
		int hour = ca.get(Calendar.HOUR_OF_DAY);
		int minute = ca.get(Calendar.MINUTE);
		int second = ca.get(Calendar.SECOND);
		
		text = Integer.toString(hour);
		text = text.concat(" : ");
		
		text = text + Integer.toString(minute);
		text = text.concat(" : ");
		
		text = text + Integer.toString(second);
		
		return text;
	}
	
	public void run()
	{
		try
		{
			while(true)
			{
				Thread.sleep(1000);
				jl.setText(clockText());
			}
		}
		catch(Exception e)
		{
			
		}
		
	}
	
	
	public static void main(String[] args) {
		my = new MyClock();
	}

}
