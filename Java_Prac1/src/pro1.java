import java.util.Scanner;

public class pro1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("학번: ");
		String no = sc.next();
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		System.out.println("이름: "+name+", 학번: "+no+", 나이: "+age);
	}

}
