import java.util.InputMismatchException;
import java.util.Scanner;

public class Prac4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 3�� �Է�:");
		int sum=0, n=0;
		
		for(int i=0; i<3; i++)
		{
			System.out.println(i+">>");
			try
			{
				n = sc.nextInt();
			}catch(InputMismatchException e)
			{
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���");
				sc.next(); // �Է� ��Ʈ���� �ִ� ������ ���� ��ū�� ������.
				i--;
				continue; // ��������
			}
			
			sum += n;
		}
		System.out.println("���� "+sum);
		sc.close();
		
		
	}

}
