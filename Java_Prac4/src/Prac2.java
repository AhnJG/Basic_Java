import java.util.Scanner;

public class Prac2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("������: ");
			int d1 = sc.nextInt();
			System.out.print("������: ");
			int d2 = sc.nextInt();
			
			try
			{
				System.out.println("��: "+d1/d2);
				break;
			}
			catch(ArithmeticException e)
			{
				System.out.println("0���� ���� �� �����ϴ�! �ٽ� �Է�");
			}
		}		
	}

}
