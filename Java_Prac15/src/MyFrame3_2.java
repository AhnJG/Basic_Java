import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame3_2 extends JFrame{
	Container c;
	JPanel p[] = new JPanel[3];
	JButton b[] = new JButton[9];
	
	Color color[] = {Color.yellow, Color.blue, Color.red};
	int flowLay[] = {FlowLayout.LEFT, FlowLayout.CENTER, FlowLayout.RIGHT};
	String borderLay[] = {BorderLayout.NORTH, BorderLayout.CENTER, BorderLayout.SOUTH};
	
	MyFrame3_2()
	{
		setTitle("MyFrame3");
		setSize(600, 250);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c = getContentPane();
		c.setLayout(new GridLayout(3, 3, 0, 10)); // 행, 열, 수평, 수직
		
		setPanel();
		
		setVisible(true);
	}
	
	void setPanel()
	{
		for(int i=0; i<p.length; i++)
		{
			for(int j=i*3+1; j<i*3+4; j++)
			{
				b[j-1] = new JButton(Integer.toString(j));
				b[j-1].setBackground(color[i]);
				b[j-1].setFont(new Font("gothic", Font.ITALIC, 30));
				c.add(b[j-1]);
			}
		}
	}

	public static void main(String[] args) {
		new MyFrame3_2();
	}

}
