import java.io.IOException;
import java.io.InputStreamReader;

public class Stream1 {

	public static void main(String[] args) {
		InputStreamReader fin = new InputStreamReader(System.in);
		
		int c;
		try {
			while((c=fin.read()) != -1)
			{
				System.out.print((char)c);
			}
		} catch (IOException e) {
			System.out.println("입출력 예외");
		}
	}

}
