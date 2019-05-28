import java.util.Scanner;

public class Prac3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름:");
		String name = sc.nextLine();
		
		System.out.print("도시:");
		String country = sc.nextLine();
		
		System.out.print("나이:");
		byte age = sc.nextByte();
		
		System.out.print("체중:");
		float weight = sc.nextFloat();
		
		System.out.print("독신여부:");
		boolean marry = sc.nextBoolean();
		
		System.out.println("이름: "+name);
		System.out.println("도시: "+country);
		System.out.println("나이: "+age);
		System.out.println("체중: "+weight);
		System.out.println("독신여부: "+marry);
	
	}

}
