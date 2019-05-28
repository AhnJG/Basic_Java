import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class UseJMenu {

	public static void main(String[] args) {
		new Test();
	}

}

class Test extends JFrame implements ActionListener
{
	JMenuBar jb;
	JMenu m1, m2, m3, m4;
	JMenuItem t1, t2, t3;
	
	Test()
	{
		setSize(400, 500);
		setTitle("aaa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton j1 = new JButton("1");
		JButton j2 = new JButton("2");
		
		//메뉴바 생성
		jb = new JMenuBar();
		
		//1번 메뉴, 파일(새로 만들기, 열기, 저장)
		m1 = new JMenu("파일");
		t1 = new JMenuItem("새로 만들기");
		t2 = new JMenuItem("열기");
		t3 = new JMenuItem("저장");
		
		m1.add(t1);
		m1.add(t2);
		m1.add(t3);
		m1.addSeparator();
		jb.add(m1);
		
		//2번 메뉴, 편집(복사, 붙여넣기, 잘라내기)
		m1 = new JMenu("편집");
		t1 = new JMenuItem("복사");
		t2 = new JMenuItem("붙여넣기");
		t3 = new JMenuItem("잘라내기");
		
		m1.add(t1);
		m1.add(t2);
		m1.add(t3);
		m1.addSeparator();
		jb.add(m1);
		
		//3번 메뉴, 도움말(정보확인)
		m1 = new JMenu("도움말");
		t1 = new JMenuItem("정보확인");
		
		m1.add(t1);
		m1.addSeparator();
		jb.add(m1);
		
		setJMenuBar(jb);
		
		j1.addActionListener(this);
		
		c.add(j1);
		c.add(j2);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
	}
}