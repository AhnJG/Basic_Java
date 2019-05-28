import java.util.Scanner;

public class Prac4 {
                                                                                                     
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름:");
		String name = sc.nextLine();
		
		System.out.println("키:");
		float hei = sc.nextFloat();
		
		System.out.print("성별:");
		String gender = sc.next();
		
		System.out.print("체중:");
		float weight = sc.nextFloat();
		
		
		float wei = 0;
		
		if(gender.equals("남자"))
			wei = (hei - 100) * 0.8F;
		else
			wei = (hei - 100) * 0.9F;
		
		System.out.printf("%s의 체중은 %.2f 이고, 표준몸무게는 %.2f 입니다", name, weight, wei);
	}

}
