import java.util.Scanner;

public class Prac7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		int n1, n2, n3;
		System.out.print("점수1: ");
		n1 = sc.nextInt();
		System.out.print("점수2: ");
		n2 = sc.nextInt();
		System.out.print("점수3: ");
		n3 = sc.nextInt();
		
		int sum1 = sum(n1,n2,n3);
		float avg1 = avg(n1, n2, n3);
		
		System.out.println("합:" + sum1);
		System.out.println("평균:" + avg1);
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
			g = "A학점";
			break;
		case 9:
			g = "A학점";
			break;
		case 8:
			g = "B학점";
			break;
		case 7:
			g = "C학점";
			break;
		case 6:
			g = "D학점";
			break;
		default:
			g = "F학점";
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
