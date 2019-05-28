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
		setTitle("�̺�Ʈ ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.addMouseListener(this);
		
		JButton j = new JButton("�����");
		j.addActionListener(this);
		j.setSize(140, 20);
		j.setLocation(100,  100);
		c.add(j);
		
		la.setSize(60, 30);
		la.setLocation(30, 30);
		//la.setBackground(Color.PINK); �� �ȵɱ�..?
		
		c.add(la);
		
		setVisible(true);
	}
	public void mousePressed(MouseEvent e) // ���콺 ������ ��
	{
		int x = e.getX(); // ���콺 Ŭ�� x��ǥ
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
		if(b.getText().contentEquals("�����"))
		{
			b.setText("��纣��");
			b.setBackground(Color.blue);
		}
		else
		{
			b.setText("�����");
			b.setBackground(Color.PINK);
		}
	}
	
	public static void main(String[] args) {
		new UseActionEvent();
	}

}
