import java.util.Scanner;

public class Prac4 {
                                                                                                     
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸�:");
		String name = sc.nextLine();
		
		System.out.println("Ű:");
		float hei = sc.nextFloat();
		
		System.out.print("����:");
		String gender = sc.next();
		
		System.out.print("ü��:");
		float weight = sc.nextFloat();
		
		
		float wei = 0;
		
		if(gender.equals("����"))
			wei = (hei - 100) * 0.8F;
		else
			wei = (hei - 100) * 0.9F;
		
		System.out.printf("%s�� ü���� %.2f �̰�, ǥ�ظ����Դ� %.2f �Դϴ�", name, weight, wei);
	}

}
