import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Prac1 extends JFrame implements ActionListener{
	private JLabel imageLabel = new JLabel();
	
	int v1 = 5;
	int v2 = 3;
	
	JTextField tf;
	
	JTextField tf_v1;
	JTextField tf_v2;
	
	Prac1()
	{
		setTitle("Prac1");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		setLayout(new FlowLayout());
		
		JMenuBar mb = new JMenuBar();
		JMenu m = new JMenu("파일");
		JMenuItem mit1 = new JMenuItem("새로만들기");
		JMenuItem mit2 = new JMenuItem("열기");
		mit2.addActionListener(new OpenActionListener());
		JMenuItem mit3 = new JMenuItem("저장");
		
		m.add(mit1);
		m.add(mit2);
		m.add(mit3);
		mb.add(m);
		
		m = new JMenu("도움말");
		mit1 = new JMenuItem("정보");
		
		m.add(mit1);
		mb.add(m);
		
		c.add(mb);
		setJMenuBar(mb);
		
		
		JLabel l1 = new JLabel("값1");
		tf_v1 = new JTextField(5);
		JLabel l2 = new JLabel("값2");
		tf_v2 = new JTextField(5);
		
		JButton b1 = new JButton("+");
		JButton b2 = new JButton("-");
		JButton b3 = new JButton("*");
		JButton b4 = new JButton("/");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		c.add(l1);
		c.add(tf_v1);
		c.add(l2);
		c.add(tf_v2);
		
		tf = new JTextField(10);
		c.add(tf);
		
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		
		c.add(imageLabel);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton j = (JButton)e.getSource();
		int result;
		
		v1 = Integer.parseInt(tf_v1.getText());
		v2 = Integer.parseInt(tf_v2.getText());
		
		if(j.getText().contentEquals("+"))
		{
			result = v1 + v2;
			tf.setText(Integer.toString(result));
		}
		else if(j.getText().contentEquals("-"))
		{
			result = v1 - v2;
			tf.setText(Integer.toString(result));
		}
		else if(j.getText().contentEquals("*"))
		{
			result = v1 * v2;
			tf.setText(Integer.toString(result));
		}
		else if(j.getText().contentEquals("/"))
		{
			double result1 = (double)v1 / v2;
			tf.setText(Double.toString(result1));
		}
	}

	
	public static void main(String[] args) {
		new Prac1();
	}

	class OpenActionListener implements ActionListener
	{
		private JFileChooser chooser;
		
		public OpenActionListener()
		{
			chooser = new JFileChooser();
		}
		
		public void actionPerformed(ActionEvent e) 
		{
			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPEG&GIF Images", "jpeg", "gif");
			chooser.setFileFilter(filter);
			
			int ret = chooser.showOpenDialog(null);
			if(ret != JFileChooser.APPROVE_OPTION)
			{
				JOptionPane.showMessageDialog(null,  "파일을 선택하지 않았습니다", "경고", JOptionPane.WARNING_MESSAGE);
				return;
			}
			
			String filePath = chooser.getSelectedFile().getPath();
			imageLabel.setIcon(new ImageIcon(filePath));
			pack();
		}
	}
}
