import java.util.InputMismatchException;
import java.util.Scanner;

public class Prac4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력:");
		int sum=0, n=0;
		
		for(int i=0; i<3; i++)
		{
			System.out.println(i+">>");
			try
			{
				n = sc.nextInt();
			}catch(InputMismatchException e)
			{
				System.out.println("정수가 아닙니다. 다시 입력하세요");
				sc.next(); // 입력 스트림에 있는 정수가 나닌 토큰을 버린다.
				i--;
				continue; // 다음루프
			}
			
			sum += n;
		}
		System.out.println("합은 "+sum);
		sc.close();
		
		
	}

}
