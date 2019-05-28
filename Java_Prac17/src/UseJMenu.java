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
		
		//�޴��� ����
		jb = new JMenuBar();
		
		//1�� �޴�, ����(���� �����, ����, ����)
		m1 = new JMenu("����");
		t1 = new JMenuItem("���� �����");
		t2 = new JMenuItem("����");
		t3 = new JMenuItem("����");
		
		m1.add(t1);
		m1.add(t2);
		m1.add(t3);
		m1.addSeparator();
		jb.add(m1);
		
		//2�� �޴�, ����(����, �ٿ��ֱ�, �߶󳻱�)
		m1 = new JMenu("����");
		t1 = new JMenuItem("����");
		t2 = new JMenuItem("�ٿ��ֱ�");
		t3 = new JMenuItem("�߶󳻱�");
		
		m1.add(t1);
		m1.add(t2);
		m1.add(t3);
		m1.addSeparator();
		jb.add(m1);
		
		//3�� �޴�, ����(����Ȯ��)
		m1 = new JMenu("����");
		t1 = new JMenuItem("����Ȯ��");
		
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