import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame3 extends JFrame{
	Container c;
	JPanel p[] = new JPanel[3];
	JButton b[] = new JButton[9];
	
	Color color[] = {Color.yellow, Color.blue, Color.red};
	int flowLay[] = {FlowLayout.LEFT, FlowLayout.CENTER, FlowLayout.RIGHT};
	String borderLay[] = {BorderLayout.NORTH, BorderLayout.CENTER, BorderLayout.SOUTH};
	
	MyFrame3()
	{
		setTitle("MyFrame3");
		setSize(600, 250);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c = getContentPane();
		c.setLayout(new BorderLayout());
		
//		p[0] = new JPanel();
//		p[0].setLayout(new FlowLayout(FlowLayout.LEFT));
//		
//		p[1] = new JPanel();
//		p[1].setLayout(new FlowLayout(FlowLayout.CENTER));
//		
//		p[2] = new JPanel();
//		p[2].setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		setPanel();
//		c.add(p[0], BorderLayout.NORTH);
//		c.add(p[1], BorderLayout.CENTER);
//		c.add(p[2], BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	void setPanel()
	{
		for(int i=0; i<p.length; i++)
		{
			p[i] = new JPanel();
			p[i].setLayout(new GridLayout(1, 3, 50, 0)); // GridLayout : ½ÃÇè!!
			//p[i].setLayout(new FlowLayout(flowLay[i]));
			p[i].setBackground(color[i]);
			
			for(int j=i*3+1; j<i*3+4; j++)
			{
				b[j-1] = new JButton(Integer.toString(j));
				b[j-1].setFont(new Font("gothic", Font.ITALIC, 30));
				p[i].add(b[j-1]);
				
			}
			c.add(p[i], borderLay[i]);
		}
	}

	public static void main(String[] args) {
		new MyFrame3();
	}

}
