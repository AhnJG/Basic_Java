
public class Ex3 {

	public static void main(String[] args) {
		String a = "12";
		int b = Integer.parseInt(a); // ���ڸ� ������ ��ȯ
		System.out.println("2������ ��ȯ: "+Integer.toBinaryString(b)); //2������ ��ȯ
		System.out.println("2������ ��ȯ: "+Integer.toOctalString(b)); //8������ ��ȯ
		System.out.println("2������ ��ȯ: "+Integer.toHexString(b)); //16������ ��ȯ
		
		int c[] = {12,44,23,63,54,57,86,67,96,50};
		int i;
		for(i=0; i<c.length; i++)
		{
			System.out.println(c[i]+"�� 2������ ��ȯ�մϴ�. -> "+Integer.toBinaryString(c[i]));
			System.out.println(c[i]+"�� 8������ ��ȯ�մϴ�. -> "+Integer.toOctalString(c[i]));
			System.out.println(c[i]+"�� 16������ ��ȯ�մϴ�. -> "+Integer.toHexString(c[i]));
			System.out.println();
		}
		
		char d[] = {'e', 'T', '5', ' ', '@', 'g'};
		for(i=0; i<d.length; i++)
		{
			if(Character.isLowerCase(d[i]) && Character.isAlphabetic(d[i])) // �ҹ���
				System.out.println(d[i] + "�� ���ĺ� �ҹ���");
			if(Character.isUpperCase(d[i]) && Character.isAlphabetic(d[i])) // �빮��
				System.out.println(d[i] + "�� ���ĺ� �빮��");
			if(Character.isDigit(d[i])) // ����
				System.out.println(d[i] + "�� ����"); 
			if(Character.isWhitespace(d[i])) // ����
				System.out.println(d[i] + "�� ����");
			if(!Character.isAlphabetic(d[i]) && !Character.isDigit(d[i]) && !Character.isWhitespace(d[i])) // Ư������
				System.out.println(d[i] + "�� Ư������");
			
			
		}
		
	}

}
