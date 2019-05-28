import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{

	MyFrame()
	{
		//super("test"); // setTitle대신 사용가능
		setTitle("Title");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 이 메서드를 넣지 않고 창을 닫아도 실제로는 닫히지 않는다.
		
		Container c = getContentPane(); // 컨테이너의 위치 알아오기
		c.setLayout(new FlowLayout()); // 배치관리자, 창의 크기에 맞춰 가운데 정렬, 창의 사이즈에 맞춰 자동으로 조절된다.
		
		JButton j = new JButton("확인"); // 버튼위에 글씨 표현
		JButton j2 = new JButton("취소");
		JButton j3 = new JButton("제출");
		
		JLabel l1 = new JLabel("이름"); // 화면에 글씨표현
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
