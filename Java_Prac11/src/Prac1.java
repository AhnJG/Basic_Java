
public class Prac1 {

	public static void main(String[] args) {
		int a[] = new int[5];
		int b[] = {1, 4, 2, 3, 5, 6};
		
		try
		{
			for(int i=0; i<=b.length; i++)
			{
				System.out.println(b[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("예외 발생");
		}
		finally
		{
			System.out.println("반드시 실행");
		}
		
//		for(int x : b)
//		{
//			System.out.println(x);
//		}
		
//		int c[][] = {{101, 102, 103, 104}, {201, 202, 203, 204}, {301, 302, 303, 304}};
//		for(int k[] : c)
//		{
//			for(int k_ : k)
//			{
//				if(k_ == 102 || k_ == 303)
//				{
//					System.out.print("    ");
//					continue;
//				}
//				System.out.print(k_+ " ");
//			}
//			System.out.println();
//		}
	}

}
