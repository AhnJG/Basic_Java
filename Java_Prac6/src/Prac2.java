import java.util.Scanner;

public class Prac2 {

	public static void main(String[] args) {
		Student st[] = new Student[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<st.length; i++)
		{
			System.out.println("이름: ");
			String name = sc.next();
			
			System.out.println("국어");
			int kor = sc.nextInt();
			
			System.out.println("수학");
			int math = sc.nextInt();
			
			System.out.println("영어");
			int eng = sc.nextInt();
			
			st[i] = new Student(name, kor, math, eng);
		}
		
		for(int i=0; i<st.length; i++)
		{
			st[i].show();
		}
	}

}

class Student
{
	String name, grade;
	int kor, math, eng;
	
	Student(String name, int kor, int math, int eng)
	{
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	void show()
	{
		System.out.println(name+"의 국어성적 : "+kor+" 수학성적 : "+math+" 영어성적 : "+eng);
		
		int sum = kor+math+eng;
		double avg = sum/3.0;
		
		System.out.println("세과목 점수의 합 : "+sum);
		System.out.println("세과목 평균 : "+avg);
		
		if(avg>=90)
		{
			grade = "A";
		}
		else if(avg>=80)
		{
			grade = "B";
		}
		else if(avg>=70)
		{
			grade = "C";
		}
		else if(avg>=60)
		{
			grade = "D";
		}
		else
		{
			grade = "F";
		}
		
		System.out.println("등급: "+grade);
	}
}
