import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//test2.txt파일을 test3.txt로 복사하기 (파일명을 입력받아서 할 것)
public class Exam3 {

	public static void main(String[] args) {
		String path = "D:\\eclipse\\workspace_2A_19\\Java20190318_2A\\Pro0409\\src\\";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("복사할 파일 명 : ");
		String source = sc.next();
		
		System.out.println("복사본 파일 명 : ");
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
			System.out.println("입출력 예외");
		}
	}

}
