
public class Ex1 {

	public String toString()
	{
		return "�ȳ���";
	}
	
	public static void main(String[] args) {
		Ex1 a = new Ex1();
		System.out.println("Ŭ���� �� : " + a.getClass());
		System.out.println("�ؽ��ڵ� Ex1: " + a.hashCode());
		System.out.println("�̸� : " + a.toString()); 
		
		Ex2 b = new Ex2();
		System.out.println("\nŬ���� �� : " + b.getClass());
		System.out.println("�ؽ��ڵ� Ex2: " + b.hashCode());
		System.out.println("�̸� : " + b.toString()); 
		
		
	}

}

class Ex2
{
	
}