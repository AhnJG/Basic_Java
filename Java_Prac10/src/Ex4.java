
public class Ex4 {

	public static void main(String[] args) {
		char a[] = {'h', 'e', 'l', 'l' ,'o'};
		String b1 = "Hello";
		String b2 = new String("Hello");
		String c[] = {"hello", "world", "apple"};
	
		System.out.println(b1.charAt(2));		
		System.out.println(b1.length());
		System.out.println(b1.concat("world"));
		
		if("cat".compareTo("art") < 0) // ==���� , <0 ���������� ������ �۴�, >0 ���������� �������� ũ��
			System.out.println("����");
		
		System.out.println(("cat".compareTo("caa")));
		
		System.out.println(b1.substring(2,  4)); // 2���� 4 ������
		
		int i=0;
		for(i=0; i<c.length; i++)
		{
			System.out.println(c[i]);
		}
		
		
	}

}
