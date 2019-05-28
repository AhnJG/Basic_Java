import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Prac2 extends JFrame{
	int n1, n2, n3;
	JLabel res = new JLabel();
	Prac2()
	{
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("" + n1);
		JButton btn2 = new JButton("" + n2);
		JButton btn3 = new JButton("" + n3);
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		
		c.add(res);
		
		c.requestFocus();
		c.setFocusable(true);
		c.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				if(key == KeyEvent.VK_ENTER)
				{
					n1 = (int)(Math.random() * 2 + 1);
					btn1.setText("" + n1);
					n2 = (int)(Math.random() * 2 + 1);
					btn2.setText("" + n2);
					n3 = (int)(Math.random() * 2 + 1);
					btn3.setText("" + n3);
					
					res.setText("≤Œ");
				}
				
				if(n1 == n2 && n1 == n3)
				{
					res.setText("¥Á√∑!");
				}
			}
		});
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Prac2();
	}

}
