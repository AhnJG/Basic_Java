import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

//키보드에서 입력하여 버퍼를 사용하여 파일에 쓰기
/*InputStreamReader in = new InputStreamReader(system.in);
BufferedReader buf = new BufferedReader(in);
FileWrite fout = new FileWrite("경로");*/

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
			System.out.println("입출력 예외");
		}
	}

}
