import java.util.Scanner;

public class Car {

	public static void main(String[] args) {
		CarData c1 = new CarData();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �̸�: ");
		c1.name = sc.nextLine();
		System.out.print("�� ����: ");
		c1.color = sc.nextLine();
		System.out.print("�� �ӵ�: ");
		c1.speed = sc.nextFloat();
		
		c1.run();
		c1.stop();
		
		sc.close();
	}

}
