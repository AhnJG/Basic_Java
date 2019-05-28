import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GraphicEx1 extends JFrame{
	
	JPanel jp = new MyPanel();
	MyPanel2 jp2 = new MyPanel2();
	JPanel jp3 = new MyPanel3();
	
	public GraphicEx1() {
		setSize(600, 600);
		setTitle("Ex1");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		JButton jb = new JButton("test");
		JButton jb1 = new JButton("test");
		JButton jb2 = new JButton("test");
		JButton jb3 = new JButton("test");
		
		jb.setBackground(new Color(255, 255, 0));
		jb1.setBackground(new Color(255, 255, 70));
		jb2.setBackground(new Color(255, 255, 140));
		jb3.setBackground(new Color(255, 255, 210));
		
		jp2.add(jb, BorderLayout.NORTH);
		jp2.add(jb1, BorderLayout.EAST);
		jp2.add(jb2, BorderLayout.SOUTH);
		jp2.add(jb3, BorderLayout.WEST);
		
		c.add(jp, BorderLayout.CENTER);
		c.add(jp2, BorderLayout.NORTH);
		c.add(jp3, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	class MyPanel extends JPanel // drawString
	{
		ImageIcon icon = new ImageIcon("src/koreaMap.png");
		Image img = icon.getImage(); // �̹��� ��ü
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			
//			g.drawImage(img, 300, 50, 150, 150, this); // �̹���, (x, y), (����, ����)
			g.drawImage(img, 50, 50, getWidth(), getHeight(), this); // �г� ����� ���缭 �׸���
			//this �� �ʿ�?
			
			g.setColor(Color.red);
			g.drawString("�ȳ�ȳ�", 100, 50);
			
			g.setColor(new Color(255, 27, 255));
			g.drawString("��ħ", 100, 70);
			
			g.setFont(new Font("Gothic", Font.ITALIC, 40));
			g.drawString("ũ�Ƥ���", 100, 150);
			
			g.setColor(Color.blue);
			g.drawLine(200, 200, 400, 400); //����
			g.drawRect(200, 300, 100, 100); // �簢��
			g.fillRect(100, 300, 50, 100); //ä���� �簢��
			g.drawOval(100, 200, 100, 100); //��
			g.drawOval(100, 300, 100, 150); //Ÿ��
			g.fillOval(100, 400, 100, 100); // ä���� ��
			
			g.setColor(Color.red);
			g.fillArc(400, 300, 100, 100, 0, 270); // 270�� ȸ��
		}
	}
	
	class MyPanel2 extends JPanel // button
	{
		MyPanel2() 
		{
			JButton btn = new JButton("����");
			setBackground(Color.yellow);
			add(btn);
		}
	}
	
	class MyPanel3 extends JPanel // label
	{
		MyPanel3() 
		{
			JLabel lb = new JLabel("AhnJG");
			setBackground(Color.yellow);
			add(lb);
		}
	}
	
	public static void main(String[] args) {
		new GraphicEx1();
	}

}
