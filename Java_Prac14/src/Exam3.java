import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//test2.txt������ test3.txt�� �����ϱ� (���ϸ��� �Է¹޾Ƽ� �� ��)
public class Exam3 {

	public static void main(String[] args) {
		String path = "D:\\eclipse\\workspace_2A_19\\Java20190318_2A\\Pro0409\\src\\";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ���� �� : ");
		String source = sc.next();
		
		System.out.println("���纻 ���� �� : ");
		String dest = sc.next();
		
		try
		{
			FileReader fr = new FileReader(path+source);
			FileWriter fw = new FileWriter(path+dest);
			
			int tmp;
			while((tmp=fr.read()) != -1)
			{
				fw.write(tmp);
			}
			
			fr.close();
			fw.close();
		}
		catch(IOException e)
		{
			System.out.println("����� ����");
		}
	}

}
