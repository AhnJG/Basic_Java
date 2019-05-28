import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStream {

	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		
		try 
		{
			fin = new FileInputStream("D:\\eclipse\\workspace_2A_19\\Java20190318_2A\\Pro0409\\src\\test.txt");
			//in = new InputStreamReader(fin, "MS949"); // 한글 인코딩
			in = new InputStreamReader(fin, "US-ASCII"); // 한글이 깨져서 나온다.
			int c;
			
			System.out.println(in.getEncoding());
			while((c = in.read()) != -1)
			{
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		}
		catch(IOException e)
		{
			System.out.println("입출력 오류");
		}
	}

}
