import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{

	MyFrame()
	{
		//super("test"); // setTitle��� ��밡��
		setTitle("Title");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �� �޼��带 ���� �ʰ� â�� �ݾƵ� �����δ� ������ �ʴ´�.
		
		Container c = getContentPane(); // �����̳��� ��ġ �˾ƿ���
		c.setLayout(new FlowLayout()); // ��ġ������, â�� ũ�⿡ ���� ��� ����, â�� ����� ���� �ڵ����� �����ȴ�.
		
		JButton j = new JButton("Ȯ��"); // ��ư���� �۾� ǥ��
		JButton j2 = new JButton("���");
		JButton j3 = new JButton("����");
		
		JLabel l1 = new JLabel("�̸�"); // ȭ�鿡 �۾�ǥ��
		String test = "test";
		JLabel l2 = new JLabel(test);
		
		c.add(j);
		c.add(j2);
		c.add(j3);
		
		c.add(l1);
		c.add(l2);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
	}

}
