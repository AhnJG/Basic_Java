import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Prac1 {

	public static void main(String[] args) {
		Data d = new Data(500, 400);
		Data1 d1 = new Data1(700, 500);
	}

}

class Data extends JFrame
{
	Data(int width, int height) // ������
	{
		setTitle("Test"); // ����
		setSize(width, height); //âũ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â ����
		Container c = getContentPane(); // �����̳�
		c.setBackground(Color.cyan); // ����
		c.add(new JLabel("����")); // �����̳ʿ� �����Է�
		setVisible(true); // ǥ��
	}
}

class Data1 extends JFrame
{
	Data1(int width, int height)
	{
		setTitle("Test1");
		setSize(width, height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x������ ����
		Container c = getContentPane();
		c.setBackground(Color.cyan);
		c.add(new JLabel("����"));
		setVisible(true);
	}
}
