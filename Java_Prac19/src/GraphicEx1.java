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
		Image img = icon.getImage(); // 이미지 객체
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			
//			g.drawImage(img, 300, 50, 150, 150, this); // 이미지, (x, y), (가로, 세로)
			g.drawImage(img, 50, 50, getWidth(), getHeight(), this); // 패널 사이즈에 맞춰서 그린다
			//this 왜 필요?
			
			g.setColor(Color.red);
			g.drawString("안녕안녕", 100, 50);
			
			g.setColor(new Color(255, 27, 255));
			g.drawString("아침", 100, 70);
			
			g.setFont(new Font("Gothic", Font.ITALIC, 40));
			g.drawString("크아ㅏㅏ", 100, 150);
			
			g.setColor(Color.blue);
			g.drawLine(200, 200, 400, 400); //라인
			g.drawRect(200, 300, 100, 100); // 사각형
			g.fillRect(100, 300, 50, 100); //채워진 사각형
			g.drawOval(100, 200, 100, 100); //원
			g.drawOval(100, 300, 100, 150); //타원
			g.fillOval(100, 400, 100, 100); // 채워진 원
			
			g.setColor(Color.red);
			g.fillArc(400, 300, 100, 100, 0, 270); // 270도 회전
		}
	}
	
	class MyPanel2 extends JPanel // button
	{
		MyPanel2() 
		{
			JButton btn = new JButton("보안");
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
