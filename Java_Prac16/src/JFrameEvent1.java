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
		
		lab = new JLabel("현재 위치:"+count);
		btn = new JButton("버튼");

//		btn.addActionListener(new JFrameEvent2()); 
//		btn.addActionListener(this); //ActionListener를 바로 상속받고 actionPerformed을 클래스로 다루지 않아도 가능하다.
		btn.addActionListener(new ActionListener() // 클래스 메소드로 만들지않고 여기서 바로 만들수있다.
		{
			@Override
			public void actionPerformed(ActionEvent e) //3번방법, implement 필요없음
			{
				count++;
				lab.setText("현재 카운트:"+count);
			}
		});
		
		c.add(lab);
		c.add(btn);
		setVisible(true);
	}
	
//	class JFrameEvent2 implements ActionListener //(1번방법)
//	{
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			count++;
//			lab.setText("현재 카운트:"+count);
//			
//		}
//	}
	
//	public void actionPerformed(ActionEvent e) { //(2번방법)
//		count++;
//		lab.setText("현재 카운트:"+count);
//	}
	
	public static void main(String[] args) {
		new JFrameEvent1();
	}

}

