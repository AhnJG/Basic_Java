import java.util.Scanner;

public class pro1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸�: ");
		String name = sc.next();
		System.out.print("�й�: ");
		String no = sc.next();
		System.out.print("����: ");
		int age = sc.nextInt();
		
		System.out.println("�̸�: "+name+", �й�: "+no+", ����: "+age);
	}

}
