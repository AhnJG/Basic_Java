import java.util.Scanner;

public class Prac1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȣ�Է�: ");
		
		switch(sc.nextInt())
		{
		case 1:
			int a[] = {1,2,3,4,5,5,6,6,7,9};
			getHap(a);
			break;
		case 2:
			int intArray[];
			intArray = makeArray();
			makeArray();
			
			for(int i=0; i<intArray.length; i++)
			{
				System.out.println((i+1)+". "+intArray[i]);
			}
			
			break;
		}
		
	}
	
	public static void getHap(int s[])
	{
		int i, sum=0;
		for(i=0; i<s.length; i++)
		{
			sum += s[i];
		}
		
		System.out.println(sum);
	}
	
	static int[] makeArray()
	{
		int tmp[] = new int[10];
		for(int i=0; i<tmp.length; i++)
		{
			tmp[i] = (int)(Math.random()*100+1);
		}
		return tmp;
	}

}

/*
 * ����ó�� : try catch final
 * ����ó�� : throws
 try
 {
 	�⺻ ���๮
 }
 catch(����) // �տ��� �θ� Ŭ������ ����ϸ� �� ����ó�� �߻�x
 {
 }
 catch(����)
 {
 }
 final
 {
 }
 */
 
