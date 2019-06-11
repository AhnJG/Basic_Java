import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AhnJungGeun extends JFrame{
	
	
	JLabel label1, label2, label3;
	JLabel imageLabel = new JLabel();
	
	String text;
	
	Runnable r1 = new panel1();
	
	Thread t1;
	
	public AhnJungGeun() {
		setTitle("기말고사");
		setSize(500, 500);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		//메뉴
		JMenuBar bar = new JMenuBar();
		
		String menuText[] = {"File", "Edit", "Window", "Help"};
		JMenu menu[] = new JMenu[4];
		for(int i=0; i<menu.length; i++)
		{
			menu[i] = new JMenu(menuText[i]);
			bar.add(menu[i]);
		}
		
		String itemText[] = {"New", "Open", "Save"};
		JMenuItem item[] = new JMenuItem[3];
		for(int i=0; i<item.length; i++)
		{
			item[i] = new JMenuItem(itemText[i]);
			menu[0].add(item[i]);
		}
		
		item[1].addActionListener(new OpenActionListener());
		setJMenuBar(bar);
		
		c.setLayout(new BorderLayout());
		
		c.add(new panel1(), BorderLayout.NORTH);
		c.add(new panel2(), BorderLayout.CENTER);
		c.add(new panel3(), BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	class panel1 extends Panel implements Runnable
	{
		panel1()
		{
			label1 = new JLabel(clockText());
			label1.setFont(new Font("Gothic", Font.BOLD, 80));

			add(label1);
			
			addMouseListener(new panel1Mouse());
		}
		
		@Override
		public void run() {
			while(true)
			{
				try
				{
					Thread.sleep(1000);
					label1.setText(clockText());
				}
				catch(Exception e)
				{
					return;
				}
			}
		}
	}
	
	class panel1Mouse extends MouseAdapter
	{
		@Override
		public void mouseEntered(MouseEvent e) {
			super.mouseEntered(e);
			t1 = new Thread(r1);
			t1.start();
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			super.mouseExited(e);
			t1.interrupt();
		}
	}
	
	class panel2 extends Panel
	{
		panel2()
		{
			setBackground(Color.gray);
			label2 = new JLabel();
			add(label2);
		}
	}
	
	class OpenActionListener implements ActionListener
	{
		private JFileChooser chooser;
		
		public OpenActionListener()
		{
			chooser = new JFileChooser();
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
			chooser.setFileFilter(filter);
		
			int ret = chooser.showOpenDialog(null);
			if(ret != JFileChooser.APPROVE_OPTION)
			{
				JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다", "경고", JOptionPane.WARNING_MESSAGE);
				return ;
			}
			
			String filePath = chooser.getSelectedFile().getPath();
			label2.setIcon(new ImageIcon(filePath));
			pack();
		}
	}
	
	class panel3 extends Panel
	{
		panel3()
		{
			label3 = new JLabel("작성자 : 안정근");
			label3.setFont(new Font("Gothic", Font.BOLD, 30));

			add(label3);
		}
	}
	
	public String clockText()
	{
		Calendar ca = Calendar.getInstance();
		int hour = ca.get(Calendar.HOUR_OF_DAY);
		int minute = ca.get(Calendar.MINUTE);
		int second = ca.get(Calendar.SECOND);
		
		text = Integer.toString(hour);
		text = text.concat(" : ");
		
		text = text + Integer.toString(minute);
		text = text.concat(" : ");
		
		text = text + Integer.toString(second);
		
		return text;
	}
	
	public static void main(String[] args) {
		new AhnJungGeun();
	}

}
