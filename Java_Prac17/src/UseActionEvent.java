import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UseActionEvent extends JFrame implements ActionListener,MouseListener {
	JLabel la = new JLabel("hello");
	
	UseActionEvent() 
	{
		setSize(500, 300);
		setTitle("이벤트 실행");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.addMouseListener(this);
		
		JButton j = new JButton("라즈베리");
		j.addActionListener(this);
		j.setSize(140, 20);
		j.setLocation(100,  100);
		c.add(j);
		
		la.setSize(60, 30);
		la.setLocation(30, 30);
		//la.setBackground(Color.PINK); 왜 안될까..?
		
		c.add(la);
		
		setVisible(true);
	}
	public void mousePressed(MouseEvent e) // 마우스 눌렀을 때
	{
		int x = e.getX(); // 마우스 클릭 x좌표
		int y = e.getY();
		la.setLocation(x, y);
	}
	public void mouseReleased(MouseEvent e)
	{
		
	}
	public void mouseClicked(MouseEvent e)
	{
		
	}
	public void mouseEntered(MouseEvent e)
	{
		
	}
	public void mouseExited(MouseEvent e)
	{
		
	}
	public void actionPerformed(ActionEvent e)
	{
		JButton b = (JButton)e.getSource();
		if(b.getText().contentEquals("라즈베리"))
		{
			b.setText("블루베리");
			b.setBackground(Color.blue);
		}
		else
		{
			b.setText("라즈베리");
			b.setBackground(Color.PINK);
		}
	}
	
	public static void main(String[] args) {
		new UseActionEvent();
	}

}
