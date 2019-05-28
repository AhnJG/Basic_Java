import java.util.Scanner;

public class Prac7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		
		int n1, n2, n3;
		System.out.print("����1: ");
		n1 = sc.nextInt();
		System.out.print("����2: ");
		n2 = sc.nextInt();
		System.out.print("����3: ");
		n3 = sc.nextInt();
		
		int sum1 = sum(n1,n2,n3);
		float avg1 = avg(n1, n2, n3);
		
		System.out.println("��:" + sum1);
		System.out.println("���:" + avg1);
		System.out.println(grade(avg1));
		//sort(n1,n2,n3);
		
		sc.close();
	}
	
	public static int sum(int a, int b, int c)
	{
		return a+b+c;
	}
	
	public static float avg(float a, float b, float c)
	{
		return (a+b+c)/3;
	}
	
	public static String grade(float num)
	{
		String g=null;
		int num1 = (int)num/10;
		
		switch(num1)
		{
		case 10:
			g = "A����";
			break;
		case 9:
			g = "A����";
			break;
		case 8:
			g = "B����";
			break;
		case 7:
			g = "C����";
			break;
		case 6:
			g = "D����";
			break;
		default:
			g = "F����";
			break;
		}
		
		return g;
	}
	
	public static void sort(int a, int b, int c)
	{
		int tmp, i ,j;
		int arr[] = {a, b, c};
		
		for(i=0; i<2; i++)
		{
			for(j=0; j<2-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.println(arr[1]);
		
	}

}
