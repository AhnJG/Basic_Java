import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

//���Ͽ��� �о ����ͷ� ��� FileInputStream���� src������ text1.txt���� �б�
//	
public class Exam1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		InputStreamReader isr = null;
		
		try {
			fis = new FileInputStream("D:\\eclipse\\workspace_2A_19\\Java20190318_2A\\Pro0409\\src\\text1.txt");
			isr = new InputStreamReader(fis, "MS949");
			int c;
			while((c=isr.read()) != -1)
			{
				System.out.print((char)c);
			}
			
		} catch (IOException e) {
			System.out.println("����� ����");
		}
		
		
	}

}
