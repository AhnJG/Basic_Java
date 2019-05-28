import java.util.Scanner;

public class Prac1 {

	public static void main(String[] args) {
		//1~������ �� ��
		Scanner sc = new Scanner(System.in);
		
		
		while(true)
		{
			System.out.print("���ù�ȣ:");
		
			switch(sc.nextInt())
			{
			case 1:
				forEx();
				break;
			case 2:
				whileEx();
				break;
			case 3:
				dowhileEx();
				break;
			case 4:
				c4();
				break;
			case 5:
				c5();
				break;
			case 6:
				fac(sc.nextInt());
				break;
			case 7:
				array1();
				break;
			case 8:
				array2();
				break;
			case 9:
				array3();
				break;
			case 10:
				array4();
				break;
			case 11:
				array5();
				break;
			case 12:
				array6();
				break;
			default:
				System.out.println("����");
				System.exit(0); // ���α׷� ����
			}
		}
	}
	
	
	public static void array6()
	{
		int a[][] = new int [2][3];
		int b[][] = {{1,2,3},{4,5,6}};
		int c[][] = {{1,2},{3,4},{5,6},{7,8}};
		int sum[] = {0, 0, 0, 0};
		
		int i, j;
		
		for(i=0; i<2; i++)
		{
			for(j=0; j<3; j++)
			{
				a[i][j] = 1;
			}
		}
		
		for(i=0; i<a.length; i++)
		{
			for(j=0; j<a[0].length; j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for(i=0; i<b.length; i++)
		{
			for(j=0; j<b[0].length; j++)
			{
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for(i=0; i<c.length; i++)
		{
			for(j=0; j<c[0].length; j++)
			{
				sum[i] += c[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.print("= "+sum[i]);
			System.out.println();
		}
	}
	
	public static void array5()
	{
		int a[]= {4,5,3,2,1,3,2,4};
		String b[]= {"asdf","zxcv","qwer"};
		
		for(int alist:a)
		{
			System.out.print(alist+", ");
		}
		System.out.println();
		
		for(String bl:b)
		{
			System.out.print(bl+", ");
		}
		System.out.println();
	}
	
	public static void array4()
	{
		Scanner sc = new Scanner(System.in);
		
		int a, i, cnt=0, num;
		

		a = (int)(Math.random()*10+1);
		
		while(true)
		{
			System.out.print("���� �˾Ƹ��߱�: ");
			num = sc.nextInt();
			
			cnt++;
			
			System.out.println("�õ�Ƚ�� : "+cnt);
			
			if(num == a)
			{
				System.out.println("�����Դϴ�.");		
				break;
			}
			else if(num > a)
			{
				System.out.println(num+"�� Ů�ϴ�.");
			}
			else if(num < a)
			{
				System.out.println(num+"�� �۽��ϴ�.");
			}
			
			System.out.println();
			
		}
	}
	
	public static void array3()
	{
		int arr[] = new int[10];
		int i, max, min;
		
		for(i=0; i<arr.length; i++)
		{
			arr[i] = (int)(Math.random()*100+1);
			System.out.print(arr[i]+", ");
		}
		
		max = min = arr[0];
		
		for(i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
			else if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("\nmax: "+max+"\nmin: "+min);
	}

	public static void array2()
	{
		Scanner sc = new Scanner(System.in);
		
		int i, sum=0;
		double avg;
		float arr[] = new float[10];
		
		for(i=0; i<arr.length; i++)
		{
			//arr[i] = sc.nextInt();
//			arr[i] = (int)(Math.random()*10+1); // 1~10
//			sum += arr[i];
			arr[i] = (float) Math.random(); // 1~10
			if(arr[i] > 0.5)
			{
				arr[i] = 1;
			}
			else
			{
				arr[i] = 0;
			}
			System.out.println(arr[i]+" ");
		}
		
//		avg = (double)sum / arr.length;
//		
//		System.out.println("��: "+sum+"\n���: "+avg);
	}
	
	public static void array1()
	{
		int []a = new int[5];
		a[0] = 3;
		a[4] = 9;
		
		int b[] = {1,2,3,4,5,6,7,8,9,0};
		float c[] = {6,7,8,9,0,3,7.4F};
		char d[] = {'a','b','c'};
		String e[] = {"asdf","zjxcv","qwer"};
		
		int i;
		
		for(i=0; i<5; i++)
		{
			System.out.print(a[i] + ", ");
		}
		System.out.println();
		
		for(i=0; i<b.length; i++)	// b.length : �迭�� ũ�� ���ϱ�
		{
			System.out.print(b[i] + ", ");
		}
		System.out.println();
		
		for(i=0; i<c.length; i++)	
		{
			System.out.print(c[i] + ", ");
		}
		System.out.println();
		
		for(i=0; i<d.length; i++)	
		{
			System.out.print(d[i] + ", ");
		}
		System.out.println();
		
		for(i=0; i<e.length; i++)	
		{
			System.out.print(e[i] + ", ");
		}
		System.out.println();
	}
	
	public static void forEx()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ��:");
		int num = sc.nextInt();
		
		int i, sum=0;
		for(i=1; i<=num; i++)
		{
			sum += i;
		}
		System.out.println("for��:"+sum);
	}
	
	public static void whileEx()
	{
		int i=1, sum=0;
		while(i<=10)
		{
			sum += i;
			i++;
		}
		System.out.println("while��:"+sum);
	}
	
	public static void dowhileEx()
	{
		int i=0, sum=0;
		do
		{
			i++;
			sum += i;
		}while(i<10);
		System.out.println("do~while��:"+sum);
	}
	
	public static void c4()
	{
		int i, sum=0, cnt=0;
		
		for(i=1; i<=100; i++)
		{
			if(i%5 == 0)
			{
				sum += i;
				cnt ++;
			}
		}
		System.out.println("1~100 ������ 5�� ����� \n����:"+cnt+"\n��:"+sum);
	}
	
	public static void c5()
	{
		int i, sum=0, cnt=0;
		
		for(i=1; i<=100; i++)
		{
			if(i%5 == 0 && i%7 == 0)
			{
				sum += i;
				cnt ++;
			}
		}
		
		System.out.println("1~100 ������ 5�� 7�� ������� \n����:"+cnt+"\n��:"+sum);
	}
	
	public static void fac(int num)
	{
		int i, j, sum=1;
		

		
		
		for(i=1; i<=num; i++)
		{
			System.out.print(i+"! = ");
			
			for(j=1; j<=i; j++)
			{
				System.out.print(j);
				if(i==j)
				{			
					
				}
				else
				{
					System.out.print(" * ");
				}
				
			}
			sum *= i;
			System.out.println(" = "+sum);
		}
		
		
	}
	
}
