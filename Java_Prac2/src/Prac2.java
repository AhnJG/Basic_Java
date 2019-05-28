import java.util.Scanner;

public class Prac2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름:");
		String name = sc.nextLine(); // 공백 입력가능
		
		System.out.print("나이:");
		int age = sc.nextInt();
		
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
	}

}
