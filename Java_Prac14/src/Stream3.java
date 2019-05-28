import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Stream3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null; 
		int c;
		
		try
		{
			fw = new FileWriter("D:\\eclipse\\workspace_2A_19\\Java20190318_2A\\Pro0409\\src\\test_stream3.txt");
			while(true)
			{
				String line = sc.nextLine();
				if(line.length() == 0)
				{
					break;
				}
				
				fw.write(line, 0, line.length());
				fw.write("\r\n");
			}
			fw.close();
		}
		catch(IOException e)
		{
			System.out.println("입출력 예외");
		}
	}

}
