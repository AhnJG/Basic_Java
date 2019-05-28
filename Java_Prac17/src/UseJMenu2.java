import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class UseJMenu2 extends JFrame{

	String str[] = {"ㄱ", "ㄴ", "ㄷ", "ㄹ", "ㅁ"};
	UseJMenu2()
	{
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JMenuBar jb = new JMenuBar();
		JMenu jm = new JMenu("컴포넌트 추가");
		JMenuItem jt = new JMenuItem("우아아ㅏ");
		
		jm.add(jt);
		jb.add(jm);
		c.add(jb);
		
		ImageIcon icon = new ImageIcon("abE.png");
		
		JLabel la = new JLabel("안녕", icon, SwingConstants.CENTER);
		JLabel la2 = new JLabel(icon);
		
		JButton b = new JButton(icon);
		
		c.add(la);
		c.add(la2);
		c.add(b);
		
		JCheckBox ch1 = new JCheckBox("국어");
		JCheckBox ch2 = new JCheckBox("영어", true);
		JCheckBox ch3 = new JCheckBox("수학", true);
		
		c.add(ch1);
		c.add(ch2);
		c.add(ch3);
		
		ButtonGroup group = new ButtonGroup();
		JRadioButton r1 = new JRadioButton("남자");
		JRadioButton r2 = new JRadioButton("여자");
		group.add(r1);
		group.add(r2);
		
		c.add(r1);
		c.add(r2);
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(20);
		
		c.add(t1);
		c.add(t2);
		
		JTextArea jta = new JTextArea(5, 30); // 행, 열
		c.add(jta);
		
		JList<String> st = new JList<String>(str);
		c.add(st);
		
		JComboBox<String> com = new JComboBox<String>();
		for(int i=0; i<str.length; i++)
		{
			com.addItem(str[i]);
		}
		c.add(com);
		
		
		JSlider sid = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
		c.add(sid);
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new UseJMenu2();
	}

}
