
public class Exam {

	public static void main(String[] args) {
		// + contains()
		String a[] = {"hello", "world", "apple", "art", "cat"};
		int i, j;
		
		//charAt() : o�ڰ� ����ִ� ���ڿ� ã�� !!����
		for(i=0; i<a.length; i++)
		{
			boolean includeO = false;
			for(j=0; j<a[i].length(); j++)
			{
				if(a[i].charAt(j) == 'o' || a[i].charAt(j) == 'O') 
				{
					includeO = true;
					break;
				}
			}
			if(includeO)
			{
				System.out.println("���ڿ��� O�� ���ԵǾ� �ֽ��ϴ�." + a[i]);
			}
		}
		
		//������ ���� : compareTo(), ��������, ����!!!
		int min;
		String temp;
		for(i=0; i<a.length-1; i++)
		{
			min = i;
			for(j=i+1; j<a.length; j++)
			{
				if(a[min].compareTo(a[j]) > 0)
				{
					min = j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		
		for(i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

}
