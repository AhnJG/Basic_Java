import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Calc1 extends JFrame{

	Container c;
	JButton b[] = new JButton[16];
	
	String text[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "CE", "°è»ê", "+", "-", "*", "/"};
	Calc1()
	{
		c = getContentPane();
		
		setTitle("Calc Form");
		setSize(600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c.setLayout(new GridLayout(4, 4, 10, 10));
		for(int i=0; i<text.length; i++)
		{
			b[i] = new JButton(text[i]);
			b[i].setFont(new Font("gothic", Font.ITALIC, 30));
			b[i].setSize(50, 50);
			c.add(b[i]);
		}
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Calc1();
	}

}
