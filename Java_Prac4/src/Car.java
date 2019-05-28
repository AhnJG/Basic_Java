import java.util.Scanner;

public class Car {

	public static void main(String[] args) {
		CarData c1 = new CarData();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("차 이름: ");
		c1.name = sc.nextLine();
		System.out.print("차 색상: ");
		c1.color = sc.nextLine();
		System.out.print("차 속도: ");
		c1.speed = sc.nextFloat();
		
		c1.run();
		c1.stop();
		
		sc.close();
	}

}
