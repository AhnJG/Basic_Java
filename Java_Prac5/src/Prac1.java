import java.util.Scanner;

class Data
{
	String name; 
	int age;
	
	//public void eat() // ��� �޼ҵ�, public�� main������ ��밡��
	void eat()
	{
		System.out.println(age + "��" + name + "�Դ´�.");
	}
}

public class Prac1 {
	String name; // �������, �⺻�� NULL
	int age;// �������, �⺻�� 0
	
	public static void main(String[] args) {
			// Ŭ������ ��ü���� = new Ŭ������();
			String name; // ��������, �⺻�� �����Ⱚ
			Data p1 = new Data(); // ��üȭ, ��ü����, �ν��Ͻ�ȭ
			Prac2 p2 = new Prac2();
			Scanner sc = new Scanner(System.in);
			
			p1.name = "asd";
			p1.age = 12;
			p1.eat();
			
			p2.height = sc.nextFloat();
			System.out.println("Ű: " + p2.height);
	}

}
