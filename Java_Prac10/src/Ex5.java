import java.util.StringTokenizer;

public class Ex5 {

	public static void main(String[] args) { // ����!!!
		StringBuffer a = new StringBuffer("apple");
		System.out.println(a);
		
		System.out.println(a.append(" Banana"));
		System.out.println(a.append(" Banana")); // �ڿ� �߰�
		a.insert(5, " Orange"); // �߰��� �߰�
		System.out.println(a);
		
		a.replace(3,  4,  "try"); // ���� 3~5�� ����� try �߰�
		System.out.println(a);
		
		a.delete(3, 5); // ���� 3~4 �����
		System.out.println(a);
		
		//import java.util.StringTokenizer; �ʿ��ϴ�
		StringTokenizer st = new StringTokenizer("����/ȣ��/���̹�/��ŷ/���Ȱ�", "/"); // ���ڿ��� ��ȣ�� ���� ������ 
		while(st.hasMoreTokens()) // ��ū�� ����?
		{
			System.out.println(st.nextToken()); // ���� ��ū ���
		}
	}

}
