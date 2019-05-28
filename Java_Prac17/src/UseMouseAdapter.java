import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class UseMouseAdapter extends JFrame{

	UseMouseAdapter() 
	{
		setTitle("Mouse");
		setSize(500, 300);

		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel lb1 = new JLabel("Hello");
		lb1.addMouseListener(new MyMouseAdapter());
		lb1.setLocation(30, 30);
		lb1.setSize(50, 50);
		c.add(lb1);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new UseMouseAdapter();
	}
}

class MyMouseAdapter extends MouseAdapter
{
	public void mousePressed(MouseEvent e)
	{
		int x = e.getX();
		int y = e.getY();
		JLabel lb = (JLabel)e.getSource(); // ..?
		lb.setLocation(x, y);
	}
}
