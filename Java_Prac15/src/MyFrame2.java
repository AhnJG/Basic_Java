import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame{

	Container c;
	JButton j[] = new JButton[4];
	String str[] = {"확인", "취소", "뒤로가기", "앞으로가기"};
	JLabel l1, l2, l3;
	JPanel p, p2;
	
	MyFrame2()
	{
		setTitle("Title");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 이 메서드를 넣지 않고 창을 닫아도 실제로는 닫히지 않는다.
		setButton();
		//setLabel();
		setVisible(true);
	}
	
	void setButton()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 40));
		
		p = new JPanel();
		p2 = new JPanel();
		
		p.setBackground(Color.magenta);
		p.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 40)); // 정렬(LEFT, CENTER, RIGHT), 가로, 세로
		
		p2.setBackground(Color.cyan);
		p2.setLayout(new FlowLayout(FlowLayout.RIGHT, 15, 40));
		
		for(int i=0; i<str.length; i++)
		{
			j[i] = new JButton(str[i]);
			p.add(j[i]);
			p2.add(j[i]);
		}
		c.add(p);
		c.add(p2);
	}
	
	void setLabel()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		l1 = new JLabel("라벨1");
		c.add(l1);
	}
	
	public static void main(String[] args) {
		MyFrame2 mf = new MyFrame2();
	}

}
