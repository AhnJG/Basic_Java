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
	Data(int width, int height) // 생성자
	{
		setTitle("Test"); // 제목
		setSize(width, height); //창크기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 종료
		Container c = getContentPane(); // 컨테이너
		c.setBackground(Color.cyan); // 배경색
		c.add(new JLabel("눌러")); // 컨테이너에 문자입력
		setVisible(true); // 표시
	}
}

class Data1 extends JFrame
{
	Data1(int width, int height)
	{
		setTitle("Test1");
		setSize(width, height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x누르면 종료
		Container c = getContentPane();
		c.setBackground(Color.cyan);
		c.add(new JLabel("눌러"));
		setVisible(true);
	}
}
