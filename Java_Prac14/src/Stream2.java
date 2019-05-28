import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stream2 {

	public static void main(String[] args) {
		InputStreamReader fin = new InputStreamReader(System.in);
		FileWriter fw = null;
		
		int c;
		try {
			fw = new FileWriter("D:\\eclipse\\workspace_2A_19\\Java20190318_2A\\Pro0409\\src\\test_Stream2.txt");
			while((c=fin.read()) != -1)
			{
				System.out.print((char)c);
				fw.write(c);
			}
			fw.close();
		} catch (IOException e) {
			System.out.println("입출력 예외");
		}
	}

}
