import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrameEx2 extends JFrame{ 

	Container content;
	JPanel p;
	JLabel j[] = new JLabel[5];
	String str[] = {"이름", "나이", "주소", "전화번호", "기타등등"};
	
	MyFrameEx2()
	{
		setTitle("배치관리자");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//레이블 컴포넌트를 왼쪽으로 배치
		content = getContentPane();
		content.setLayout(new BorderLayout(10, 20));
		
//		p = new JPanel();
//		p.setLayout(new FlowLayout(FlowLayout.LEFT));
//		p.setBackground(Color.gray);
		
		setLabel();
		setVisible(true);
	}
	
	void setLabel()
	{
		for(int i=0; i<j.length; i++)
		{
//			j[i] = new JLabel(str[i]);
//			p.add(j[i]);
//			content.add(new JLabel(str[i]));
		}
		content.add(new JLabel(str[0]), BorderLayout.EAST);
		content.add(new JLabel(str[1]), BorderLayout.WEST);
		content.add(new JLabel(str[2]), BorderLayout.SOUTH);
		content.add(new JLabel(str[3]), BorderLayout.NORTH);
		content.add(new JLabel(str[4]), BorderLayout.CENTER);
//		content.add(p);
	}
	public static void main(String[] args) {
		new MyFrameEx2();
	}

}
