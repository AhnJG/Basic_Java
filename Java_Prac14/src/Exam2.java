import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

//Ű���忡�� �Է��Ͽ� ���۸� ����Ͽ� ���Ͽ� ����
/*InputStreamReader in = new InputStreamReader(system.in);
BufferedReader buf = new BufferedReader(in);
FileWrite fout = new FileWrite("���");*/

public class Exam2 {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader buf = new BufferedReader(in);
		try {
			FileWriter fout = new FileWriter("D:\\eclipse\\workspace_2A_19\\Java20190318_2A\\Pro0409\\src\\test2.txt");
			int c;
			while((c=buf.read()) != -1)
			{
				fout.write(c);
			}
			fout.close();
			
		} catch (IOException e) {
			System.out.println("����� ����");
		}
	}

}
