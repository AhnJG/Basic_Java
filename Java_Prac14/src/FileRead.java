import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException{
		FileReader fin = null; // �ѱ��� �� ���´� (����Ʈ ��Ʈ��)
		//FileInputStream fin_ = null; // �ѱ��� ������ (���� ��Ʈ��)
		try
		{
			fin = new FileReader("D:\\eclipse\\workspace_2A_19\\Java20190318_2A\\Pro0409\\src\\test.txt");
			//fin_ = new FileInputStream("D:\\eclipse\\workspace_2A_19\\Java20190318_2A\\Pro0409\\src\\test.txt");
			//fin = new FileReader(".\test.txt");
			int c;
			while((c = fin.read()) != -1)
			{
				System.out.print((char)c);
			}
			fin.close();
		}
		catch(IOException e)
		{
			System.out.println("����� ����");
		}
	}

}
