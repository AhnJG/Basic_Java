import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameEvent1 extends JFrame{
	JButton btn;
	JLabel lab;
	Container c;
	
	int count = 0;
	public JFrameEvent1()
	{
		setTitle("Prev1");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		lab = new JLabel("���� ��ġ:"+count);
		btn = new JButton("��ư");

//		btn.addActionListener(new JFrameEvent2()); 
//		btn.addActionListener(this); //ActionListener�� �ٷ� ��ӹް� actionPerformed�� Ŭ������ �ٷ��� �ʾƵ� �����ϴ�.
		btn.addActionListener(new ActionListener() // Ŭ���� �޼ҵ�� �������ʰ� ���⼭ �ٷ� ������ִ�.
		{
			@Override
			public void actionPerformed(ActionEvent e) //3�����, implement �ʿ����
			{
				count++;
				lab.setText("���� ī��Ʈ:"+count);
			}
		});
		
		c.add(lab);
		c.add(btn);
		setVisible(true);
	}
	
//	class JFrameEvent2 implements ActionListener //(1�����)
//	{
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			count++;
//			lab.setText("���� ī��Ʈ:"+count);
//			
//		}
//	}
	
//	public void actionPerformed(ActionEvent e) { //(2�����)
//		count++;
//		lab.setText("���� ī��Ʈ:"+count);
//	}
	
	public static void main(String[] args) {
		new JFrameEvent1();
	}

}

