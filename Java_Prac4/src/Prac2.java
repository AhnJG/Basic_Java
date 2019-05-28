import java.util.Scanner;

public class Prac2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("나뉠수: ");
			int d1 = sc.nextInt();
			System.out.print("나눌수: ");
			int d2 = sc.nextInt();
			
			try
			{
				System.out.println("몫: "+d1/d2);
				break;
			}
			catch(ArithmeticException e)
			{
				System.out.println("0으로 나눌 수 없습니다! 다시 입력");
			}
		}		
	}

}
