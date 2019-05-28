import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//시험!!!!!!!!!! 주관식!!!!!!!!!!
public class JFrameEvent3 extends JFrame{
	JButton btn1, btn2;
	Container c;
	
	JFrameEvent3()
	{
		setTitle("Event3");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		btn1 = new JButton("버튼1");
		btn2 = new JButton("버튼2");
		btn1.addActionListener(new JFrameEvent4());
		btn2.addActionListener(new JFrameEvent4());
		
		c.add(btn1);
		c.add(btn2);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JFrameEvent3();
	}

}

class JFrameEvent4 implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		JButton j = (JButton)e.getSource();
		if(j.getText().equals("버튼1"))
		{
			j.setText("버튼2");
			j.setBackground(Color.BLUE);
		}
		else if(j.getText().equals("버튼2"))
		{
			j.setText("버튼1");
			j.setBackground(Color.red);
		}
	}
}