import java.util.Scanner;

public class Prac3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸�:");
		String name = sc.nextLine();
		
		System.out.print("����:");
		String country = sc.nextLine();
		
		System.out.print("����:");
		byte age = sc.nextByte();
		
		System.out.print("ü��:");
		float weight = sc.nextFloat();
		
		System.out.print("���ſ���:");
		boolean marry = sc.nextBoolean();
		
		System.out.println("�̸�: "+name);
		System.out.println("����: "+country);
		System.out.println("����: "+age);
		System.out.println("ü��: "+weight);
		System.out.println("���ſ���: "+marry);
	
	}

}
